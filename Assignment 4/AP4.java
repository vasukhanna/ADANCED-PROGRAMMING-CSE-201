//assignment 4
import java.io.*;
import java.util.*;


public class AP4{
    public static void main(String[] args) {
        player p = new player();
        Scanner sc= new Scanner(System.in);
        String[] Softtoys={"Mickey Mouse soft toy","Minnie Mouse soft toy","goofy soft toy","Ben 10 soft toy","Doraemon soft toy","Nobita soft toy","Oswald soft toy","Obito soft toy","Donald Duck soft toy","Tom soft toy","jerry soft toy","Mouse soft toy","Dog soft toy","Cat soft toy","Car soft toy","Bike soft toy","Lion soft toy","Cheetah soft toy","Charger soft toy","pen soft toy","phone soft toy"};
        String[] hop={"First","Second","Third","Fourth","Fifth"};

        System.out.println("Hit enter to initialize the game");
        // try {
            String a=sc.nextLine();
            
        // } catch (InputMismatchException e) {
        //     System.out.println(e.getMessage());
        // }
        
        for(int i=0;i<5;i++){
            try{
                System.out.println("Hit enter for your "+hop[i]+ " hop");

            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("index out of bound");
            }
            

            
            // try {
                String b=sc.nextLine();
                
            // } catch (InputMismatchException e) {
            //     System.out.println(e.getMessage());
                
            // }
            
            Random r=new Random();
            int r2=r.nextInt(25)+1;
            if(r2%2==0 && r2<21){
                
                System.out.println("You landed on tile "+r2);
                System.out.println("You won a "+Softtoys[r2]);
                try {
                    toys t=new toys(Softtoys[r2]);
                
                    p.setBucket((toys)t.clone());
                
                    
                } catch (CloneNotSupportedException c) {


                    //TODO: handle exception
                }
                
            }
            else if(r2%2!=0 && r2<21) {
                System.out.println("You landed on tile "+r2);
                // System.out.println("Question answer round. Integer or strings?");
                toys t= new toys(Softtoys[r2]);
                questions q=new questions(Softtoys[r2]);
                boolean aq=q.ask_questions();
                if(aq==true){
                    try {
                        p.setBucket((toys)t.clone());
                        System.out.println("You won a "+Softtoys[r2]);

                        
                    } catch (CloneNotSupportedException c) {
                        //TODO: handle exception
                    }

                    
                }
                if(aq==false){
                    System.out.println("Incorrect answer\nYou did not win any soft toy");
                }


            }
            else{
                System.out.println("You are too energetic and zoomed past all the tiles. Muddy Puddle Splash!");

            }
            

        }
        System.out.println("Soft toys won by you are:");
        for(int i=0; i<p.getArrayList().size();i++){
            System.out.print(p.getArrayList().get(i).getToy_name()+" ,");




        }
        
        
        

        
        
    }
}
class player{
    private ArrayList<toys> bucket=new ArrayList<>();
    public ArrayList<toys> getArrayList(){
        return this.bucket;

    }
    public toys getBucket(int index) {

        return bucket.get(index);
    }
    public void setBucket(toys toy) {
        this.bucket.add(toy);
    }


}
abstract class tile implements Cloneable  {
    private toys t;
    public toys getT() {
        return t;
    }
    public void setT(toys t) {
        this.t = t;
    }
    private String toy_name;
    tile(String name) {
        this.toy_name=name;

    }

    public String get_toy_name() {
        return this.toy_name;
    }
   

}
class toys  implements Cloneable {
    private String toy_name;
    public String getToy_name() {
        return toy_name;
    }
    toys(String s) {
        this.toy_name=s;
    }
    
    public Object clone() throws CloneNotSupportedException {  
        return super.clone();  
    }  

   
    

}
class questions extends tile{
    questions(String s) {
        super(s);
        // ask_questions();
    }
    public boolean ask_questions() {
        System.out.println("Question answer round. Integer or String?");
        Scanner sc=new Scanner(System.in);
        String type="";
        try {
             type=sc.next();
            
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
        
        if (type.equals("Integer")||type.equals("integer")) {
            Random rr=new Random();
            int rr2=rr.nextInt(10000)+1;
            int rr3=rr.nextInt(1000)+1;
            calc <Integer> c=new calc<Integer>();
            int answer=(Integer)c.ans(rr2,rr3);
            System.out.println("Calculate the result of "+rr2+" divide by "+rr3);
            int input2=-1;
            try {
                input2=sc.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }
            
            if(answer==input2) {
                return true;
            }

        }

        
        if (type.equals("String")|| type.equals("string")) {
            String x="";
            String y="";
            String helperString= "abcdefghijklmnopqurstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            for(int i=0;i<3;i++){
                Random rrr=new Random();
                int rrr2=rrr.nextInt(helperString.length());
                x=x+x.concat(helperString.substring(rrr2, rrr2+1));


            }
            for(int i=0;i<3;i++){
                Random rrr=new Random();
                int rrr2=rrr.nextInt(helperString.length());
                y=y+y.concat(helperString.substring(rrr2, rrr2+1));

            }


            calc<String> c=new calc<String>();
            String ans=(String)c.ans(x,y);
            String input="";
            try {
                System.out.println("Calculate the concatenation of strings "+x+" and "+y);
                System.out.println("Enter yout answer");

                 input=sc.next();
                
            } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
            }
            
            if(ans.equals(input)){
                return true;
            }


        }
        else{
            return false;
        }
        // sc.close();
        return false;
        
    }

}
class calc <T> {
    public Object ans(Object o1,Object o2) {
        if(o1 instanceof Integer && o2 instanceof Integer){

            return ((Integer)o1/(Integer) o2);
        }
        else if(o1 instanceof String && o2 instanceof String){
            String s1=(String)o1;
            
            String s2=(String)o2;
            return s1.concat(s2);

        }
        return null;

    }




}
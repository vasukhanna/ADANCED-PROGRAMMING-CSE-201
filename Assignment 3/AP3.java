//Snakes and ladders
//In the extra feature i have added 2 bonus points for the player who reaches the destination floor without getting cut even once.
import java.util.*;

class Name {

    private String name;
    private int points;
    private int floor;
    private int vk;
    

    Name(String name) {
        this.name = name;
        this.vk=0;

    }

    void set_name(String name) {
        this.name = name;
    }

    String get_name() {
        return this.name;
    }

    void set_points(int points) {
        this.points = points;
    }

    int get_points() {
        return this.points;
    }
        void set_floor(int floor) {
        this.floor = floor;
    }

    int get_floor() {
        return this.floor;
    }
    void set_vk(int vk) {
        this.vk = vk;
    }

    int get_vk() {
        return this.vk;
    }

}

class Dice {

    private int face;

    Dice(int f) {
        this.face = f;
    }

    void set_face(int f) {
        this.face = f;
    }

    int get_face() {
        return this.face;
    }

    public int Rolls() {
        Random r = new Random();
        int R = r.nextInt(face) + 1;

        return R;

    }
}

class Floor {

//    private int floor;
    private int points;
//    private String name;
    void Floor(int points){
//        this.floor=floor;
//        this.name=name;
        this.points=points;
    }



    void set_points(int points) {
        this.points = points;
    }

    int get_points() {
        return this.points;
    }
    void points(Name a){
        
        
    }
    void floor(Name a){
        
    }



}

class emptyFloor extends Floor {
    

    
    emptyFloor(int points){
        super.Floor(points);
        
    }

//    void EFFloor() {
//        a.set_floor(0);
//
//    }
    @Override
    void points(Name a) {
         a.set_points(a.get_points()+1);
    }

}

class normalSnake extends Floor {

    
    normalSnake(int points){
        super.Floor(points);
        
    }

    @Override
    void points(Name a) {
        a.set_points(a.get_points()-2);
    }

    @Override
    void floor(Name a) {
        a.set_floor(1);
    }

}

class KingKobra extends Floor {

    
    KingKobra(int points){
        super.Floor(points);
        
    }

    @Override
    void points(Name a) {
        a.set_points(a.get_points()-4);
    }

    @Override
    void floor(Name a) {
        a.set_floor(3);
    }
}

class Ladder extends Floor {
    

    
    Ladder(int points){
        super.Floor(points);
        
    }
    @Override
    void points(Name a) {
        a.set_points(a.get_points()+2);
    }

    @Override
    void floor(Name a) {
        a.set_floor(12);
    }

}

class Elevator extends Floor {

    
    Elevator(int points){
        super.Floor(points);
        
    }

    @Override
    void points(Name a) {
        a.set_points(a.get_points()+4);
    }

    @Override
    void floor(Name a) {
        a.set_floor(10);
    }
}

public class AP3{

    public static void main(String[] args) {
        int bonus=0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the player name and hit enter");
        String n = sc.nextLine();
        System.out.println("The game setup is ready");
        System.out.println("If you reach the destination floor without getting cut then you get bonus points");
        Floor g = new Floor();
        Name nm = new Name(n);
        Floor EF = new emptyFloor(1);
        Floor ELF = new Elevator(4);
        Floor NS = new normalSnake(-2);
        Floor L = new Ladder(2);
        Floor KK = new KingKobra(4);
//        int floor = nm.get_floor();
        
//        ArrayList<Name> arrName =new ArrayList<>();
       
        while (true) {
            
//            arrName.add(nm);
            System.out.println("Hit enter to roll the dice");
            String e = sc.nextLine();
            Dice d = new Dice(2);
            int t=0;
            if(nm.get_vk()==0){
                while (true) {

                    int B=d.Rolls();
                    System.out.println("Dice gave " +B);
                    


                    if (B == 1) {
                        nm.set_floor(0);
                        System.out.println("Player position Floor " + nm.get_floor());
                        System.out.println(nm.get_name() + " has reached an Empty Floor");
                        EF.points(nm);
                        System.out.println("Total points "+nm.get_points());
                        t=1;
                        nm.set_vk(1);
                        break;

                    } 
                    else if (B == 2) {
                        System.out.println("Floor cannot start until you get 1");

                    }
                    System.out.println("Hit enter to roll the dice");
                    String f = sc.nextLine();


                }
            }
            
            
            if(t==1){
//                int dice=d.Rolls();
//                floor = floor + dice;
//                
//                System.out.println("Dice gave " +dice);
                continue;
            }
            int dice=d.Rolls();
                nm.set_floor(nm.get_floor()+dice);
                
                System.out.println("Dice gave " +dice);
            if (nm.get_floor() == 1) {
                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an Empty Floor");
                EF.points(nm);
                System.out.println("Total Points " + nm.get_points());

            } else if (nm.get_floor() == 2) {
                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an Elevator Floor");
//                System.out.println("Total Points " + nm.get_points());
                ELF.floor(nm);
                ELF.points(nm);
                System.out.println("Total Points " + nm.get_points());
                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an Empty Floor");
                EF.points(nm);
                System.out.println("Total Points " + nm.get_points());
                 
//                floor = nm.get_floor();

            } else if (nm.get_floor() == 3) {
                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an Empty Floor");
//                System.out.println("Total Points " + nm.get_points());
                EF.points(nm);
                 System.out.println("Total Points " + nm.get_points());

            } else if (nm.get_floor() == 4) {
//                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an Empty Floor");
//                System.out.println("Total Points " + nm.get_points());
                EF.points(nm);
                System.out.println("Total Points " + nm.get_points());
                System.out.println("Player position Floor " + nm.get_floor());
            } else if (nm.get_floor() == 5) {
                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an normal snake Floor");
                NS.floor(nm);
                NS.points(nm);
                System.out.println("Total Points " + nm.get_points());
                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an Empty Floor");
                EF.points(nm);
                bonus++;

                
//                floor = nm.get_floor();
//                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println("Total Points " + nm.get_points());

            } else if (nm.get_floor() == 6) {
                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an Empty Floor");
//                System.out.println("Total Points " + nm.get_points());
                EF.points(nm);
                 System.out.println("Total Points " + nm.get_points());
//                System.out.println("Player position Floor " + nm.get_floor());


            } else if (nm.get_floor() == 7) {
                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an Empty Floor");
//                System.out.println("Total Points " + nm.get_points());
                EF.points(nm);
                System.out.println("Total Points " + nm.get_points());
//                System.out.println("Player position Floor " + nm.get_floor());

            } else if (nm.get_floor() == 8) {
                System.out.println("Player position Floor " + nm.get_floor());
                
                 L.points(nm);
                System.out.println(nm.get_name() + " has reached a Ladder Floor");
                System.out.println("Total Points " + nm.get_points());
//                System.out.println("Player position Floor " + nm.get_floor());
                
                System.out.println(nm.get_name() + " has reached an Empty Floor");
                EF.points(nm);
                 L.floor(nm);
                 System.out.println("Player position Floor " + nm.get_floor());
//                System.out.println("Total Points " + nm.get_points());
               
                System.out.println("Total Points " + nm.get_points());
                
//                nm.get_floor() = nm.get_floor();

            } else if (nm.get_floor() == 9) {
                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an Empty Floor");
                EF.points(nm);
                System.out.println("Total Points " + nm.get_points());

            } else if (nm.get_floor() == 10) {
                System.out.println("Player position Floor " + nm.get_floor());
                
                System.out.println(nm.get_name() + " has reached an Empty Floor");
                EF.points(nm);
                System.out.println("Total Points " + nm.get_points());

            } else if (nm.get_floor() == 11) {
                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an King cobra Floor");
                
                KK.floor(nm);
                KK.points(nm);
                System.out.println("Total Points " + nm.get_points());
                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an Empty Floor");
                EF.points(nm);
                System.out.println("Total Points " + nm.get_points());
                bonus++;
                
                

            } else if (nm.get_floor() == 12) {
                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an Empty Floor");
                EF.points(nm);
                System.out.println("Total Points " + nm.get_points());

            } else if (nm.get_floor() == 13) {
                System.out.println("Player position Floor " + nm.get_floor());
                System.out.println(nm.get_name() + " has reached an Empty Floor");
                EF.points(nm);
                System.out.println("Total Points " + nm.get_points());
                System.out.println("Floor over");
                break;

            }
            else if(nm.get_floor()>13){
                System.out.println("Player cannot move");
                nm.set_floor(12);
                EF.points(nm);
                
            }

        }
//        System.out.println("bonus "+bonus);
        if(bonus==0){
            System.out.println("Points +"+nm.get_points());
            System.out.println("Bonus 2 points");
            System.out.println(nm.get_name() + " acumulated " + (nm.get_points() + 2)+ " Points");        
        }
        else{
            System.out.println(nm.get_name() + " acumulated " + nm.get_points()+ " Points");
        }

    }
}

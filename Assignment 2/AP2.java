
import java.util.*;

class Material {

    private int typeOfMat;
    private String topic;
    private int contentOfslides;
    private String content;
//    String topicOfVideo;
    private String fileName;
    private String dateofUpload;
    private String instructor;
    private ArrayList<String> arrContent1 = new ArrayList<>();

    Material(int toM, String toS, int coS, String content, String dOu, String i) {
        this.typeOfMat = toM;
        this.topic = toS;
        this.contentOfslides = coS;
        this.content = content;
        this.dateofUpload = dOu;
        this.instructor = i;

    }
    
    

    Material(String toV, String fileName, String dOu, String i) {
        this.topic = toV;
        this.fileName = fileName;
        this.dateofUpload = dOu;
        this.instructor = i;

    }
    void set_topic(String topic){
        this.topic=topic;
    }
    String get_topic(){
        return this.topic;
        
        
        
    
}
    void set_contentOfslides(int contentOfslides){
        this.contentOfslides=contentOfslides;
    }
    int contentOfslides(){
        return this.contentOfslides;
        
        
        
    
}
    void set_content(String content){
        this.content=content;
    }
    String get_content(){
        return this.content;
        
        
        
    
}
    void set_fileName(String fileName){
        this.fileName=fileName;
    }
    String get_fileName(){
        return this.fileName;
        
        
        
    
}
    void set_dateofUpload(String dateofUpload){
        this.dateofUpload=dateofUpload;
    }
    String get_dateofUpload(){
        return this.dateofUpload;
        
        
        
    
}
    void set_instructor(String instructor){
        this.instructor=instructor;
    }
    String get_instructor(){
        return this.instructor;
        
        
        
    
}

    void setContent(String content) {
        arrContent1.add(content);

    }

    ArrayList<String> getContent() {
        return arrContent1;
    }

}

class addAssesment {

    private String typeOfAss;
    private String instructor;
    private String assQ;
    private String quizQ;
    private int maxMarks;
//    int maxMarksQ;

    addAssesment(String q, int maxMarks, String inst, String tOa) {
        this.instructor = inst;
        this.assQ = q;
        this.maxMarks = maxMarks;
        this.typeOfAss = tOa;
        this.quizQ="";

    }

    addAssesment(String qq, String inst, String ToA) {
        this.quizQ = qq;
        this.instructor = inst;
        this.typeOfAss = ToA;
        this.maxMarks = 1;
        this.assQ="";

    }
    void set_instructor(String instructor){
        this.instructor=instructor;
    }
    String get_instructor(){
        return this.instructor;
        
        
        
    
}
    void set_typeOfAss(String typeOfAss){
        this.typeOfAss=typeOfAss;
    }
    String get_typeOfAss(){
        return this.typeOfAss;
        
        
        
    
}
    void set_assQ(String assQ){
        this.assQ=assQ;
    }
    String get_assQ(){
        return this.assQ;
        
        
        
    
}
    void set_quizQ(String quizQ){
        this.quizQ=quizQ;
    }
    String get_quizQ(){
        return this.quizQ;
        
        
        
    
}
    void set_maxMarks(int maxMarks){
        this.maxMarks=maxMarks;
    }
    int get_maxMarks(){
        return this.maxMarks;
        
        
        
    
}

}
class submission{
    private String studentId;
    private addAssesment v;
    private String checkedBY;
    private int scoredMarks;
    private String answer;
    submission(addAssesment v,String sID,String answer){
        this.answer=answer;
        this.v=v;
        this.studentId=sID;
        this.scoredMarks=-1;
    }
    void setGrade(String CheckedBY,int scoredMarks){
        this.scoredMarks=scoredMarks;
        this.checkedBY=CheckedBY;
    }
    void getGrade(){
        System.out.println(this.answer);
        if(this.scoredMarks==-1){
            
            System.out.println("Ungraded");
            
        }
        else{
            
            System.out.println("Marks = " +this.scoredMarks);
        }
    }
    void set_studentId(String studentId){
    this.studentId=studentId;
        
        }
    String get_studentId(){
        
        return this.studentId;
        
    }
void set_checkedBY(String checkedBY){
        this.checkedBY=checkedBY;
    }
    String get_checkedBY(){
        return this.checkedBY;
        
        
        
    
}
void set_scoredMarks(int scoredMarks){
        this.scoredMarks=scoredMarks;
    }
    int get_scoredMarks(){
        return this.scoredMarks;
        
        
        
    
}
void set_answer(String answer){
        this.answer=answer;
    }
    String get_answer(){
        return this.answer;
        
        
        
    
}
void set_v(addAssesment v){
        this.v=v;
    }
    addAssesment get_v(){
        return this.v;
        
        
        
    
}
    String checkStatus(){
        if(this.scoredMarks==-1){
            return "ungraded";
        }
       return "graded";
    }
    
}



//class submitAssesment extends addAssesment {
//
//    String Student;
//
//    void addAssesment(String q, int maxMarks, String inst, String tOa, String s) {
//        this.instructor = inst;
//        this.assQ = q;
//        this.maxMarks = maxMarks;
//        this.typeOfAss = tOa;
//        this.Student = s;
//
//    }
//
//    void addAssesment(String qq, String inst, String ToA, String s) {
//        this.quizQ = qq;
//        this.instructor = inst;
//        this.typeOfAss = ToA;
//        this.maxMarks = 1;
//        this.Student = s;
//
//    }
//
//}

interface comments {

    public String viewComm();

    public void addComm(String c,String commenter);

}

//class student implements comments {
//
//    String comment;
//    String commenter;
//
//    @Override
//    public void addComm(String comment,String commenter) {
//        this.comment = comment;
//        this.commenter=commenter;
//
//    }
//
//    @Override
//    public String viewComm() {
//        return comment +" - "+ commenter ;
//
//    }
//}

class instructor implements comments {

    private String comment;
    private String commenter;

    @Override
    public void addComm(String comment,String commenter) {
        this.comment = comment;
        this.commenter=commenter;

    }

    @Override
    public String viewComm() {
        this.comment=comment;
        return comment +" - "+ commenter ;

    }
}


public class AP2 {

    public static void main(String[] args) {
        ArrayList<Material> m = new ArrayList<>();
        ArrayList<String> Inst = new ArrayList<>();
        Inst.add("I0");
        Inst.add("I1");
        ArrayList<String> Stu = new ArrayList<>();
        Stu.add("S0");
        Stu.add("S1");
        Stu.add("S2");
        ArrayList<addAssesment> AA = new ArrayList<>();
        ArrayList<String> TypeOfASS = new ArrayList<>();
        TypeOfASS.add("Assignment");
        TypeOfASS.add("Quiz");
        ArrayList<String> arrContent = new ArrayList<>();
        comments iC = new instructor();
//        comments sC=new student();
        Date dO = new Date();
        String dOu = dO.toString();
        
        ArrayList<comments> I = new ArrayList<>();
        ArrayList<submission> S = new ArrayList<>();

//        ArrayList<student> S=new ArrayList<>();
        while (true) {
            System.out.println("Welcome to Backpack\n" + "1. Enter as instructor\n" + "2. Enter as student\n" + "3. Exit");

            int n;
            Scanner sc = new Scanner(System.in);
            n = Integer.parseInt(sc.nextLine());
            if (n == 1) {
                System.out.println("Instructors:\n"
                        + "0 - I0\n"
                        + "1 - I1");
                int chooseInst = Integer.parseInt(sc.nextLine());

                System.out.println("Welcome" + Inst.get(chooseInst));
                while (true) {
                    System.out.println("INSTRUCTOR MENU\n"
                            + "1. Add class material\n"
                            + "2. Add assessments\n"
                            + "3. View lecture materials\n"
                            + "4. View assessments\n"
                            + "5. Grade assessments\n"
                            + "6. Close assessment\n"
                            + "7. View comments\n"
                            + "8. Add comments\n"
                            + "9. Logout");
                    
                    int instMenu = Integer.parseInt(sc.nextLine());
                    if (instMenu == 1) {
                        System.out.println("1. Add Lecture Slide\n"
                                + "2. Add Lecture Video");
                        int toM = Integer.parseInt(sc.nextLine());
                        if (toM == 1) {
                            String content = null;
                            System.out.println("Enter topic of slides");
                            String toS = sc.nextLine();
                            toS=toS.replaceAll("\\s", " ");
                            System.out.println("Enter Number of slides");
                            int coS = Integer.parseInt(sc.nextLine());
                            for (int i = 1; i <= coS; i++) {
                                System.out.println("Content of Slide " + i);
                                content = sc.nextLine();
                                arrContent.add(content);

                            }

                            Material mS = new Material(toM, toS, coS, content, dOu, Inst.get(chooseInst));
                            m.add(mS);

                        } else if (toM == 2) {

                            System.out.println("Enter the topic of video");
                            String toV = sc.nextLine();
                            toV=toV.replaceAll("\\s", " ");
                            System.out.println("Enter filename of video");
                            String fileName = sc.nextLine();
                            if (fileName.length()>4&&fileName.substring((fileName.length() - 4), fileName.length()).equals(".mp4")) {
                                Material mV = new Material(toV, fileName, dOu, Inst.get(chooseInst));
                                m.add(mV);
                            } else {
                                System.out.println("Invalid format, try again");
                            }

                        } else {
                            System.out.println("invalid");
                        }

                    } else if (instMenu == 2) {
                        System.out.println("1. Add Assignment\n"
                                + "2. Add Quiz");
                        int choose;
                        choose = Integer.parseInt(sc.nextLine());
                        if (choose == 1) {
                            System.out.println("Enter problem statement");
                            String q = sc.nextLine();
                            q=q.replaceAll("\\s", " ");
                            System.out.println("Enter max marks");
                            int maxMarks = Integer.parseInt(sc.nextLine());
                            addAssesment aaa = new addAssesment(q, maxMarks, Inst.get(chooseInst), "Assignment");
                            AA.add(aaa);
                        } else if (choose == 2) {
                            System.out.println("Enter quiz question");
                            String qq = sc.nextLine();
                            qq=qq.replaceAll("\\s", " ");
//                        int quizMarks=1;
                            System.out.println(Inst.get(chooseInst));
                            addAssesment aaq = new addAssesment(qq, Inst.get(chooseInst), "Quiz");

                            AA.add(aaq);

                        }

                    } else if (instMenu == 3) {
                        for (int i = 0; i < m.size(); i++) {
                            System.out.println("Title :" + m.get(i).get_topic());

                            if (m.get(i).get_fileName() == null) {
                                for (int j = 0; j < arrContent.size(); j++) {
                                    System.out.println("Content " + j + " " + arrContent.get(j));

                                }
                            }
                            System.out.println("date of upload " + m.get(i).get_dateofUpload());
                            System.out.println("uploaded by: " + m.get(i).get_instructor());

                        }

                    } 
                    else if (instMenu == 4) {
                        for (int i = 0; i < AA.size(); i++) {
                            if (AA.get(i).get_typeOfAss().equals("Assignment")) {

                                System.out.println("ID: " + i + " " + AA.get(i).get_assQ() + " Max Marks : " + AA.get(i).get_maxMarks());
                                System.out.println("-------------------");

                            } else {
                                System.out.println("ID: " + i + " " + AA.get(i).get_quizQ() + " Max Marks : " + AA.get(i).get_maxMarks());
                                System.out.println("-------------------");

                            }
                        }
                        

                    }
                    else if(instMenu==6){
                         for (int i = 0; i < AA.size(); i++) {
                            if (AA.get(i).get_typeOfAss().equals("Assignment")) {

                                System.out.println("ID: " + i + " " + AA.get(i).get_assQ() + " Max Marks : " + AA.get(i).get_maxMarks());
                                System.out.println("-------------------");

                            } else {
                                System.out.println("ID: " + i + " " + AA.get(i).get_quizQ() + " Max Marks : " + AA.get(i).get_maxMarks());
                                System.out.println("-------------------");

                            }
                        }
                         int chooseId=Integer.parseInt(sc.nextLine());
                          AA.remove(chooseId);
                        
                    }
                    else if(instMenu==5){
                        System.out.println("assesmentsto be graded :");
                        for (int i = 0; i < AA.size(); i++) {
                            if (AA.get(i).get_typeOfAss().equals("Assignment")) {

                                System.out.println("ID: " + i + " " + AA.get(i).get_assQ() + " Max Marks : " + AA.get(i).get_maxMarks());
                                System.out.println("-------------------");

                            } else {
                                System.out.println("ID: " + i + " " + AA.get(i).get_quizQ() + " Max Marks : " + AA.get(i).get_maxMarks());
                                System.out.println("-------------------");

                            }
                        }
                        System.out.println("Choose Id");
                        int flag=0;
                        int chooseId=Integer.parseInt(sc.nextLine());
                        for(int i=0;i<S.size();i++){
                            if(AA.get(chooseId).get_assQ().equals(S.get(i).get_v().get_assQ())&&AA.get(chooseId).get_quizQ().equals(S.get(i).get_v().get_quizQ())&&S.get(i).checkStatus().equals("ungraded")){
                                System.out.println(S.get(i).get_studentId().substring(1)+" "+S.get(i).get_studentId());
                                
                                flag=1;
                                
                            }
                        }
                        if(flag==1){
                            int chooseSTU=Integer.parseInt(sc.nextLine());
                            for(int i=0;i<S.size();i++){
//                                &&S.get(i).get_studentId().substring(1).equals(Integer.toString(chooseSTU))
//                                String
//                                System.out.println(S.get(i).get_studentId());
//                                System.out.println("S"+String.valueOf(chooseSTU));
//                                System.out.println((S.get(i).get_studentId().equals("S"+String.valueOf(chooseSTU))));
//                                String dm="S"+String.valueOf(chooseSTU);
//                                System.out.println((S.get(i).get_studentId().equals(dm)));
//                                System.out.println(Integer.parseInt(S.get(i).get_studentId().substring(1)));
                                if((AA.get(chooseId).get_assQ().equals(S.get(i).get_v().get_assQ())||AA.get(chooseId).get_quizQ().equals(S.get(i).get_v().get_quizQ()))&&S.get(i).get_studentId().equals("S"+chooseSTU)){
                                    System.out.println("Answer "+S.get(i).get_answer());
                                    System.out.println("Max Marks "+AA.get(chooseId).get_maxMarks()); 
                                    
                                    System.out.println("Enter marks ");
                                    int grade=Integer.parseInt(sc.nextLine());
                                    S.get(i).setGrade(Inst.get(chooseInst), grade);
                                    
                                }
                            }
                        }
                        
//                        AA.remove(chooseId)
                        
                        
                    }
                    else if (instMenu == 7) {
                        for(int i=0;i<I.size();i++){
                            System.out.println(I.get(i).viewComm());
                        }
                        
//                        System.out.println();
                        System.out.println(dOu);

                    } else if (instMenu == 8) {
//                        comments iC = new instructor();
                        System.out.println("Enter a comment");
                        String Com = sc.nextLine();
                        Com=Com.replaceAll("\\s", " ");
                        instructor iCC=new instructor();
                        iCC.addComm(Com,Inst.get(chooseInst));
                        I.add(iCC);
                        

                    } else if (instMenu == 9) {
                        break;

                    }

                }

            } else if (n == 2) {
                System.out.println("Students:\n"
                        + "0 - S0\n"
                        + "1 - S1\n"
                        + "2 - S2");
                int chooseStudent = Integer.parseInt(sc.nextLine());

                while (true) {
                    System.out.println("Welcome " + Stu.get(chooseStudent));
                    System.out.println("STUDENT MENU\n"
                            + "1. View lecture materials\n"
                            + "2. View assessments\n"
                            + "3. Submit assessment\n"
                            + "4. View grades\n"
                            + "5. View comments\n"
                            + "6. Add comments\n"
                            + "7. Logout");
                    int StuMenu = Integer.parseInt(sc.nextLine());
                    if (StuMenu == 1) {

                        for (int i = 0; i < m.size(); i++) {
                            System.out.println("Title :" + m.get(i).get_topic());

                            if (m.get(i).get_fileName() == null) {
                                for (int j = 0; j < arrContent.size(); j++) {
                                    System.out.println("Content " + j + " " + arrContent.get(j));

                                }
                            }
                            System.out.println("date of upload " + m.get(i).get_dateofUpload());
                            System.out.println("uploaded by: " + m.get(i).get_instructor());

                        }

                    } else if (StuMenu == 2) {
                        for (int i = 0; i < AA.size(); i++) {
                            if (AA.get(i).get_typeOfAss().equals("Assignment")) {

                                System.out.println("ID: " + i + "Assignment " + AA.get(i).get_assQ() + " Max Marks : " + AA.get(i).get_maxMarks());
                                System.out.println("-------------------");

                            } else {
                                System.out.println("ID: " + i + " " + AA.get(i).get_quizQ() + " Max Marks : " + AA.get(i).get_maxMarks());
                                System.out.println("-------------------");

                            }
                        }

                    } else if (StuMenu == 3) {
                        
                        System.out.println("Pending Assesments");
                        int vk=0;
                        for(int i=0;i<AA.size();i++){
                            int flag=0;
                            for(int j=0;j<S.size();j++){
                                if((AA.get(i).get_assQ().equals(S.get(j).get_v().get_assQ())&&AA.get(i).get_quizQ().equals(S.get(j).get_v().get_quizQ()))&& S.get(j).get_studentId().equals(Stu.get(chooseStudent))){
                                    
                                    flag=1;
                                }
                            
                             }
                            if(flag==0){
                                vk=1;
                                System.out.println((AA.get(i).get_assQ()!="")?i+" "+AA.get(i).get_assQ():"");
                                System.out.println((AA.get(i).get_quizQ()!="")?i+ " "+AA.get(i).get_quizQ():"");
                            }
                        }
                        if(vk==0){
                            System.out.println();
                            
                        }
                        else{
                            int chooseSub=Integer.parseInt(sc.nextLine());
                           
                            System.out.println("Enter your answer");
                            String ans=sc.nextLine();
                             if(AA.get(chooseSub).get_quizQ().equals("")){
                                if(ans.length()>4&&ans.substring((ans.length() - 4), ans.length()).equals(".zip")) {
                                submission x=new submission( AA.get(chooseSub), Stu.get(chooseStudent), ans);
                                S.add(x);
                                }
                                else{
                                System.out.println("Invalid format, try again");
                                }
                             }
                             else{
                                 submission x=new submission( AA.get(chooseSub), Stu.get(chooseStudent), ans);
                                    S.add(x);
                                 
                             
//                            S.remove(chooseSub).v;
                            }
                            
                            
                        
                            
                            
                        
                        }
                        
                        
                        
                        

                    } 
                    else if(StuMenu==4){
                        for(int i=0;i<S.size();i++){
                            if(S.get(i).get_studentId().equals("S"+chooseStudent)){
                                
                            S.get(i).getGrade();
                            }
                        }
                    }
                    else if (StuMenu == 5) {
                        
                        for(int i=0;i<I.size();i++){
                            System.out.println(I.get(i).viewComm());
                        }
                        System.out.println(dOu);

                    } else if (StuMenu == 6) {
//                        comments iC = new instructor();
                        System.out.println("Enter a comment");
                        String Com = sc.nextLine();
                        Com=Com.replaceAll("\\s", " ");
                        instructor ICC1=new instructor();
                        ICC1.addComm(Com,Stu.get(chooseStudent));
                        I.add(ICC1);

                    }
                    else if (StuMenu == 7) {
                        break;
                    }
                }
            } else {
                System.out.println("Invalid ");
            }

        }

    }

}

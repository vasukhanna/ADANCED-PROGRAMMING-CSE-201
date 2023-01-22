package ap;

import java.util.*;

class AddVaccine {

    String NameOfVaccine;
    int NoOfDoses;
    int Gap;

    AddVaccine(String Vaccine, int doses, int gap) {
        this.NameOfVaccine = Vaccine;
        this.NoOfDoses = doses;
        this.Gap = gap;
//        return "vaccine name = "+Vaccine+" dose = "+doses+" gap = "+gap;

    }
}

class RegisterHospital {

    String HospitalName;
    int pincode;
    Random vk = new Random();

    int Id = vk.nextInt(900000) + 100000;
//    ArrayList<Integer> arr0=new ArrayList<>();
//    arr0.add();

    String RegisterHospital(String HospitalName, int pincode) {
        this.HospitalName = HospitalName;
        this.pincode = pincode;
        return "Hospital Name: " + HospitalName + " PinCode =" + pincode + " UniqueId = " + Id;

    }

}

class registerCitizen {

    String name;
    int age;
    String uniqueID;
    int doses;
    String Vaccine;
    

    String registerCitizen(String name, int age, String Id) {
        this.name = name;
        this.age = age;
        this.uniqueID = Id;
        return "";

    }

}

class CreateSlot {

    int HospitalId;
    int Slots;
    int qty;
    int day;
    String vc;
    int pincode;
    int vasu;
    String HospName;

    CreateSlot(int hospitalID, int day, int Qty, String vc, int pin, String HospName) {
        this.HospitalId = hospitalID;
//        this.Slots = v;
        this.qty = Qty;
        this.day = day;
        this.vc = vc;
        this.pincode = pin;
        this.HospName = HospName;
//        return "Slots added by hospital " + hospitalID + " for Day " + day + " Available Quantity " + Qty + " of Vaccine " + vc;

    }

    String print() {
        return "Slots added by hospital " + HospitalId + " for Day " + day + " Available Quantity " + qty + " of Vaccine " + vc;
    }

}

class bookslot {

    int HosId;
    String Vaccine;
    String Hospital;
    int pincode;
    int qty;
    int day;
    int vasu;

    bookslot(int HosId, String Vaccine, String Hospital, int pincode, int qty, int day) {

        this.HosId = HosId;
        this.Vaccine = Vaccine;
//        this.Hospital=
    }
}

public class AP {

    public static void main(String[] args) {
        String nl = System.lineSeparator();
        int due=0;

        System.out.println("CoWin Portal initialized...." + nl + nl + "---------------------------------" + nl + "1. Add Vaccine" + nl + "2. Register Hospital" + nl + "3. Register Citizen" + nl + "4. Add Slot for Vaccination" + nl + "5. Book Slot for Vaccination" + nl + "6. List all slots for a hospital" + nl + "7. Check Vaccination Status" + nl + "8. exit");
        ArrayList<RegisterHospital> arrrh = new ArrayList<>();
        ArrayList<AddVaccine> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<registerCitizen> arr2 = new ArrayList<>();
        ArrayList<Integer> arr0 = new ArrayList<>();
        ArrayList<String> arrPiD = new ArrayList<>();

        ArrayList<CreateSlot> Vaccin = new ArrayList<>();

        while (true) {

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("Enter name of vaccine");
                String Vaccine = sc.next();
                System.out.println("Enter no. of doses");
                int doses = sc.nextInt();
                System.out.println("Enter gap between doses");
                int gap = sc.nextInt();

                AddVaccine av = new AddVaccine(Vaccine, doses, gap);

                System.out.println("Vaccine Name: " + Vaccine + " Number of Doses: = " + doses + " Gap Between Doses = " + gap);
                System.out.println("---------------------------------");
                arr.add(av);

            } else if (n == 2) {

                System.out.println("Enter hospital name");
                String HospitalName = sc.nextLine() + sc.nextLine();
                HospitalName = HospitalName.replaceAll("\\s", "");
                System.out.println("Enter pincode");
                int pincode = sc.nextInt();
                if(pincode >99999 && pincode <=999999){
                
                RegisterHospital rh = new RegisterHospital();
                System.out.println(rh.RegisterHospital(HospitalName, pincode));
                System.out.println("---------------------------------");
                arr1.add(pincode);
                arrrh.add(rh);
                

                arr0.add(rh.Id);
                }
//            System.out.println(arr0.get(0));
//        for(int i=0;i<arr0.size();i++){
//            System.out.println("array"+arr0.get(0));
//            
//        }    
                else{
                    System.out.println("Invalid pincode");
                    
                }

            } 
            else if (n == 3) {
                System.out.println("Citizen Name ");
                String name = sc.nextLine() + sc.nextLine();
                name = name.replaceAll("\\s", "");
                System.out.println("Age:");
                int age = sc.nextInt();
                System.out.println("Enter your UniqueId");
                String uniqueId = sc.next();
                registerCitizen rc = new registerCitizen();
                if (age < 18 || uniqueId.length() != 12) {
                    System.out.println("Please check your age or Unique ID");

                } else {

                    System.out.println(rc.registerCitizen(name, age, uniqueId));
                    System.out.println("---------------------------------");
                    arr2.add(rc);

                    arrPiD.add(rc.uniqueID);
                    
                }
            } else if (n == 4) {

                System.out.println("Enter Hospital Id");
                int flag = 0;
                int hospitalID = sc.nextInt();
                RegisterHospital rhh = null;
                for (int i = 0; i < arrrh.size(); i++) {
                    if (hospitalID == arrrh.get(i).Id) {
                        rhh = arrrh.get(i);
                        flag = 1;
                        break;

                    }

                }

                if (flag == 0) {
                    System.out.println("Invalid");
                }
                if (flag == 1) {

                    System.out.println("Enter the number of slots to be added");
                    int v = sc.nextInt();
                    int k = 0;
                    while (k < v) {
                        System.out.println("Enter day Number");
                        int day = sc.nextInt();
                        System.out.println("Enter Quantity");
                        int Qty = sc.nextInt();
                        k++;

                        for (int i = 0; i < arr.size(); i++) {
                            System.out.println(i + " " + arr.get(i).NameOfVaccine);
                        }

                        int op = sc.nextInt();
                        CreateSlot cs = new CreateSlot(hospitalID, day, Qty, arr.get(op).NameOfVaccine, rhh.pincode, rhh.HospitalName);
                        Vaccin.add(cs);
                        System.out.println(cs.print());
                        System.out.println("---------------------------------");

//                for(int i=0;i<arr.size();i++){
//                    System.out.println( arr.get(i).NameOfVaccine);
//                    
//                }
//                        if (op == 0) {
//                            cs.vc = "Covax";
//                            System.out.println("---------------------------------");
//                            Vaccin.add(cs);
//                        } else if (op == 1) {
//                            cs.vc = "Covi";
//                            System.out.println(cs.print());
//                            System.out.println("---------------------------------");
//                            Vaccin.add(cs);
//                        }
                    }

                }

            } else if (n == 5) {
                
                registerCitizen registered = null;
                System.out.println("Enter patient Unique Id");
                String PiD = sc.next();
                int flag0 = 0;
                
                for (int i = 0; i < arr2.size(); i++) {
                    if (PiD.equals(arr2.get(i).uniqueID)) {
                        registered = arr2.get(i);
                        flag0 = 1;
                        break;

                    }

                }
                if (flag0 == 0) {
                    System.out.println("Unique ID not registered");
                }
                if (flag0 == 1) {

                    System.out.println("1. Search by area\n" + "2. Search by Vaccine\n" + "3. Exit");
                    System.out.println("Enter option");
                    int input = sc.nextInt();
                    if (input == 1) {
                        System.out.println("Enter pincode");

                        int pincode = sc.nextInt();
                        ArrayList<Integer> arrtemp = new ArrayList<>();
                        for (int k = 0; k < Vaccin.size(); k++) {
                            if (pincode == Vaccin.get(k).pincode && !arrtemp.contains(Vaccin.get(k).HospitalId)) {
                                arrtemp.add(Vaccin.get(k).HospitalId);
                                System.out.println(Vaccin.get(k).HospitalId + " " + Vaccin.get(k).HospName);
                            }
                        }

                        System.out.println("Enter hospital id");
                        int input0 = sc.nextInt();
                        
                        for (int i = 0; i < Vaccin.size(); i++) {
                            if (input0 == Vaccin.get(i).HospitalId) {

                                System.out.println(i + " > "+ Vaccin.get(i).day +" Available qty " + Vaccin.get(i).qty + " Vaccine " + Vaccin.get(i).vc);

                            }

                        }

                        System.out.println("Choose slot");

                        int ChooseSlot = sc.nextInt();
                        
                        registered.Vaccine=Vaccin.get(ChooseSlot).vc;
                        registered.doses++;
                        Vaccin.get(ChooseSlot).qty--;
                        System.out.println(registered.name + " vaccinated with " + Vaccin.get(ChooseSlot).vc);
                        System.out.println("---------------------------------");
                        due = Vaccin.get(ChooseSlot).day;

                    } else if (input == 2) {
                        System.out.println("Enter Vaccine Name");
                        String Vaccine = sc.next();
                        //problem in this loop
//                            for (int j = 0; j < arrrh.size(); j++) {
//
//                                if (Vaccine.equals(Vaccin.get(j).vc)) {
//                                    System.out.println("Hospital Name " + arrrh.get(j).HospitalName);
//                                    System.out.println("Pincode " + arrrh.get(j).pincode);
//                                    System.out.println(j + " > Available qty " + Vaccin.get(j).qty + " Vaccine " + Vaccin.get(j).vc);
//                                    
//                                }
//                                
//                            }
                        ArrayList<Integer> arrtemp0 = new ArrayList<>();
                        for (int i = 0; i < Vaccin.size(); i++) {
                            if (Vaccine.equals(Vaccin.get(i).vc) && !arrtemp0.contains(Vaccin.get(i).HospitalId)) {
                                arrtemp0.add(Vaccin.get(i).HospitalId);
                                System.out.println(Vaccin.get(i).HospitalId + " " + Vaccin.get(i).HospName);
                            }

                        }
                        int HosId = sc.nextInt();
                        for (int i = 0; i < Vaccin.size(); i++) {
                            if (HosId == Vaccin.get(i).HospitalId && Vaccin.get(i).vc.equals(Vaccine)) {
                                System.out.println(i + " > "+ Vaccin.get(i).day +" Available qty " + Vaccin.get(i).qty + " Vaccine " + Vaccin.get(i).vc);

                            }
                        }
                        System.out.println("Choose slot");
                        

                        int ChooseSlot = sc.nextInt();
                        registered.Vaccine=Vaccin.get(ChooseSlot).vc;
                        registered.doses++;
                        Vaccin.get(ChooseSlot).qty--;
                        System.out.println(registered.name + " vaccinated with " + Vaccin.get(ChooseSlot).vc);
                        System.out.println("---------------------------------");
                        due = Vaccin.get(ChooseSlot).day;
                        

                    } else if (input == 3) {
                        System.out.println("---------------------------------");

                    }

                }
            } else if (n == 6) {
                System.out.println("Hospital Id");
                int hID = sc.nextInt();
                for (int i = 0; i < Vaccin.size(); i++) {
                    if (hID == Vaccin.get(i).HospitalId) {
                        System.out.println("Day " + Vaccin.get(i).day + " > Available qty " + Vaccin.get(i).qty + " Vaccine " + Vaccin.get(i).vc);
                    }

                }
                
            } else if (n == 7) {
                registerCitizen registered = null;
                System.out.println("Enter Citizen ID");
                String CiID = sc.next();
                int k;
                int flag=0;
                
                for( k=0;k<arr2.size();k++){
                    if(CiID.equals(arr2.get(k).uniqueID)){
                        registered=arr2.get(k);
                        flag=1;
                        break;
                    }
                }
                if(flag==0){  System.out.println("Citizen not registered");continue;}
                if(registered.Vaccine==null){
                    System.out.println("Citizen Registered");
                    System.out.println("---------------------------------");
                    continue;
                }
                AddVaccine vaccine=null;
                int j;
                for(j=0;j<arr.size();j++){
                    if(arr2.get(k).Vaccine.equals(arr.get(j).NameOfVaccine)){
                        vaccine=arr.get(j);
                        break;
                    }
                    
                }
                
//                for (int i = 0; i < arr2.size(); i++) {
                    
                    if (registered.doses >= vaccine.NoOfDoses) {
                        System.out.println("Fully Vaccinated");
                        System.out.println("Vaccine name : " +vaccine.NameOfVaccine);
                        System.out.println("---------------------------------");

                    } else if((registered.doses < vaccine.NoOfDoses && registered.doses > 0)) {
                        System.out.println("Partially vaccinated");
                        System.out.println("Vaccine name : " +vaccine.NameOfVaccine);
                        System.out.println("doses : " +registered.doses);
                        System.out.println("Due Date = "+(due + vaccine.Gap));
                        System.out.println("---------------------------------");
                    } 

//                     else {
//                        System.out.println("Citizen not registered");
//                    }

//                }
                
            } else if (n == 8) {
                System.out.println("---------------------------------");
                break;
               

            }

        }

    }

}

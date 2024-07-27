package janhavi;





class Encapsulation2{

        String name[];
        double salary[];
        String designation[];
        double per[];

        Encapsulation2(String[] Name, double[] Salary, String[] Designation,double[] Per) {
                name = Name;
                salary = Salary;
                designation = Designation;
                per=Per;
        }

        void get_all_data(){

                int size = name.length;
                System.out.println("Sn.no. | Name | Salary | Designation|AddSalary");
                for (int i = 0; i < size; i++) {

                        
                        System.out.println(i+1+" | "+name[i]+" | "+salary[i]+" | "+designation[i]+ "|" +(+salary[i]+per[i]));
                        
                }

        }

}   





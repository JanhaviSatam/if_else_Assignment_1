package janhavi;



public class  Encapsulation3{
    public static void main(String[] args) {

       String name1[] = {"joy","nishant","alok","omji"};
       double salary1[] = {45000,78000,90000,125000};
       String designation1[] = {"ios","HR","Tech","CA"};
       double per[]= {2300,4500,5600,6700};


       Encapsulation2 emp1 = new Encapsulation2(name1,salary1,designation1,per);
        emp1.get_all_data();
    }
}
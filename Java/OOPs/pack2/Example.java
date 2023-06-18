package pack2;

import pack1.student;

public class Example {
    public static void main(String[] args) {
        student s1 = new student() ;

        s1.setRollno(100);
        s1.setName("Ayush");

        System.out.println( "Roll no : " + s1.getRollno() );
        System.out.println( "Name : " + s1.getName() );
    }
}

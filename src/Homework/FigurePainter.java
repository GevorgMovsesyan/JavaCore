package Homework;

import java.sql.SQLOutput;

public class FigurePainter{

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int j = i; j <5 ; j++) {
                System.out.print(" * ");
            }
            System.out.println();

        }

        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();



        }


        int n=4;
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print("  ");

            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 1; i<=4 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >=i ; k--) {
                System.out.print( "*" );

            }
            System.out.println();

        }


        for (int i = 1; i <5 ; i++) {
            for (int j = 3; j >=i ; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < 5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 5-i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}


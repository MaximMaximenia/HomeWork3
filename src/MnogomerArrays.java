
import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class MnogomerArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("ВВЕДИТЕ РАЗМЕР МАТРИЦЫ: ");
        int x = s.nextInt();

        int y = x;
        Random random = new Random();
        int[][] mass = new int[x][y];
        int [][]mass2 = new int [x][y];
        System.out.println("МАТРИЦА : ");
        System.out.println();
        int sumChetDiog = 0;
        int sumPoboch=0;
        int ProizvMeinDiag = 1;
        int ProizvNeMeinDiag = 1;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                mass[i][j] = random.nextInt(50);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < x; i++) {
            if (mass[i][i] % 2 == 0) {
                sumChetDiog += mass[i][i];
            }


        }
        System.out.println();
        System.out.println("СУММА ЧЕТНЫХ ЭЛЕМЕНТОВ ГЛАВНОЙ ДИАГОНАЛИ : " + sumChetDiog);
        System.out.println();
        System.out.print("НЕЧЕТНЫЕ ЭЛЕМЕНТЫ ПОД ДИАГОНАЛЬЮ ВКЛЮЧИТЕЛЬНО : ");

        for (int i = 0; i < x; i++) {
            for (int j = 0; j <= i; j++) {
                if (mass[i][j] % 2 == 1) {
                    System.out.print(mass[i][j] + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i < x; i++) {
            ProizvMeinDiag *= mass[i][i];

        }
        for (int i = 0; i < x; i++){
            for (int j = 0; j < x; j++) {
                if (i + j == x - 1) {
                    ProizvNeMeinDiag *= mass[i][j];
                }
            }

        }
        if ( ProizvMeinDiag>ProizvNeMeinDiag){
            System.out.println("ПРОИЗВЕДЕНИЕ ЭЛЕМЕНТОВ ГЛАВНОЙ ДИАГОНАЛИ БОЛЬШЕ ПОБОЧНОЙ");
        }
        else if (ProizvMeinDiag<ProizvNeMeinDiag){
            System.out.println("ПРОИЗВЕДЕНИЕ ЭЛЕМЕНТОВ ПОБОЧНОЙ ДИАГОНАЛИ БОЛЬШЕ ГЛАВНОЙ");
        }
        else{
            System.out.println("ДИАГОНАЛИ РАВНЫ");
        }
        System.out.println();
        for (int i = 0;i<x;i++){
            for (int j =0 ; j <x-i-1;j++){
                if (mass[i][j]%2==0){
                    sumPoboch+=mass[i][j];

                }}
        }
        System.out.println();
        System.out.println("СУММА ЧЕТНЫХ ЭЛЕМЕНТОВ НАД ПОБОЧНОЙ ДИАГОНАЛЬЮ : "+sumPoboch);
        System.out.println();
        System.out.println("ТРАНСПОРТИРОВАННАЯ МАТРИЦА:");
        System.out.println();
        for (int i = 0;i<x;i++){
            for (int j =0 ; j <x;j++){
                mass2[i][j]=mass[j][i];
                System.out.print(mass2[i][j]+" ");
            }
            System.out.println();
        }}}

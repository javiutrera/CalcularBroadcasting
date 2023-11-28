/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calcularbroadcasting;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class CalcularBroadcasting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ip1;
        int ip2;
        int ip3;
        int ip4;
        int sub1;
        int sub2;
        int sub3;
        int sub4;
        String red1p="";
        String red2p="";
        String red3p="";
        String red4p="";
        String mask1="";
        String mask2="";
        String mask3="";
        String mask4="";
        String mask1p="";
        String mask2p="";
        String mask3p="";
        String mask4p="";
        
        System.out.println("Introduce el primer bloque IP");
        ip1=sc.nextInt();
        System.out.println("Introduce el segundo bloque IP");
        ip2=sc.nextInt();
        System.out.println("Introduce el tercer bloque IP");
        ip3=sc.nextInt();
        System.out.println("Introduce el cuarto bloque IP");
        ip4=sc.nextInt();
        System.out.println("Introduce el primer bloque MAC");
        sub1=sc.nextInt();
        System.out.println("Introduce el segundo bloque MAC");
        sub2=sc.nextInt();
        System.out.println("Introduce el tercer bloque MAC");
        sub3=sc.nextInt();
        System.out.println("Introduce el cuarto bloque MAC");
        sub4=sc.nextInt();
        
        String ip1b = Integer.toBinaryString(ip1);
        String ip2b = Integer.toBinaryString(ip2);
        String ip3b = Integer.toBinaryString(ip3);
        String ip4b = Integer.toBinaryString(ip4);
        String sub1b = Integer.toBinaryString(sub1);
        String sub2b = Integer.toBinaryString(sub2);
        String sub3b = Integer.toBinaryString(sub3);
        String sub4b = Integer.toBinaryString(sub4);
        //Aqui voy a leer con length el numero de posiciones que tiene mi variable String, y si tiene menos de 8
        while (ip1b.length() < 8) {
            ip1b = "0" + ip1b;//Va sumarle 0 a la izquierda hasta que el total de caracteres sume 8
        }
        while (ip2b.length() < 8) {
            ip2b = "0" + ip2b;
        }
        while (ip3b.length() < 8) {
            ip3b = "0" + ip3b;
        }
        while (ip4b.length() < 8) {
            ip4b = "0" + ip4b;
        }
        while (sub1b.length() < 8) {
            sub1b = "0" + sub1b;//Va sumarle 0 a la izquierda hasta que el total de caracteres sume 8
        }
        while (sub2b.length() < 8) {
            sub2b = "0" + sub2b;
        }
        while (sub3b.length() < 8) {
            sub3b = "0" + sub3b;
        }
        while (sub4b.length() < 8) {
            sub4b = "0" + sub4b;
        }
        System.out.println("Su direccion IP es " + ip1 + "." + ip2 + "." + ip3 + "." + ip4);
        System.out.println("Su direccion de Sub red es " + sub1 + "." + sub2 + "." + sub3 + "." + sub4);
        System.out.println("");
        System.out.println("");
        System.out.println("Su direccion IP es en binario " + ip1b + "." + ip2b + "." + ip3b + "." + ip4b);
        System.out.println("Su direccion de Sub red es en binario " + sub1b + "." + sub2b + "." + sub3b + "." + sub4b);
        System.out.println("");
        System.out.println("");
        if (ip1 <= 127 && ip2 <= 255 && ip3 <= 255 && ip4 <= 255) {
            System.out.println("Su clase de red es: CLASE A");
        } else if (ip1 >= 128 && ip1 <= 191 && ip2 <= 255 && ip3 <= 255 && ip4 <= 255) {
            System.out.println("Su clase de red es: CLASE B");
        } else if (ip1 >= 192 && ip1 <= 223 && ip2 <= 255 && ip3 <= 255 && ip4 <= 255) {
            System.out.println("Su clase de red es: CLASE C");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("La operacion AND entre la Mascara de Subred y la dirección Ip sera nuestra direccion Predeterminada de Red, y es la siguiente:");
        //Calculamos la direccion de red haciendo una operacion AND con cada bloque     
        for (int i = 0; i < ip1b.length(); i++) {
            if (sub1b.charAt(i) == '1' && ip1b.charAt(i) == '1') {
                red1p = red1p + "1";
            } else {
                red1p = red1p + "0";
            }
        }
        for (int i = 0; i < ip1b.length(); i++) {
            if (sub2b.charAt(i) == '1' && ip2b.charAt(i) == '1') {
                red2p = red2p + "1";
            } else {
                red2p = red2p + "0";
            }
        }
        for (int i = 0; i < ip1b.length(); i++) {
            if (sub3b.charAt(i) == '1' && ip3b.charAt(i) == '1') {
                red3p = red3p + "1";
            } else {
                red3p = red3p + "0";
            }
        }
        for (int i = 0; i < ip1b.length(); i++) {
            if (sub4b.charAt(i) == '1' && ip4b.charAt(i) == '1') {
                red4p = red4p + "1";
            } else {
                red4p = red4p + "0";
            }
        }
        System.out.println("Direccion predeterminada de RED " + red1p + "." + red2p + "." + red3p + "." + red4p);
        //Finalizo el calculo de la direccion de red predeterminada
        
        //Empiezo con los calculos de la mascara de sub red predeterminada
        //Hacemos la operacion NOT con la mascara de Sub Red
        for (int i = 0; i < sub1b.length(); i++) {
            if (sub1b.charAt(i) == '1') {
                mask1 = mask1 + "0";
            } else {
                mask1 = mask1 + "1";
            }
        }
        for (int i = 0; i < sub1b.length(); i++) {
            if (sub2b.charAt(i) == '1') {
                mask2 = mask2 + "0";
            } else {
                mask2 = mask2 + "1";
            }
        }
        for (int i = 0; i < sub1b.length(); i++) {
            if (sub3b.charAt(i) == '1') {
                mask3 = mask3 + "0";
            } else {
                mask3 = mask3 + "1";
            }
        }
        for (int i = 0; i < sub1b.length(); i++) {
            if (sub4b.charAt(i) == '1') {
                mask4 = mask4 + "0";
            } else {
                mask4 = mask4 + "1";
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Hacemos la operacion NOT de la mascara de Sub Red: ");
        System.out.println("NOT de Mascara de Sub Red " + mask1 + "." + mask2 + "." + mask3 + "." + mask4);
        System.out.println("");
        System.out.println("Y hacemos la operacion OR con la IP " + ip1b + "." + ip2b + "." + ip3b + "." + ip4b);
        for (int i = 0; i < ip1b.length(); i++) {
            if (mask1.charAt(i) == '1' || ip1b.charAt(i) == '1') {
                mask1p = mask1p + "1";
            } else {
                mask1p = mask1p + "0";
            }
        }
        for (int i = 0; i < ip1b.length(); i++) {
            if (mask2.charAt(i) == '1' || ip2b.charAt(i) == '1') {
                mask2p = mask2p + "1";
            } else {
                mask2p = mask2p + "0";
            }
        }
        for (int i = 0; i < ip1b.length(); i++) {
            if (mask3.charAt(i) == '1' || ip3b.charAt(i) == '1') {
                mask3p = mask3p + "1";
            } else {
                mask3p = mask3p + "0";
            }
        }
        for (int i = 0; i < ip1b.length(); i++) {
            if (mask4.charAt(i) == '1' || ip4b.charAt(i) == '1') {
                mask4p = mask4p + "1";
            } else {
                mask4p = mask4p + "0";
            }
        }
        System.out.println("La Mascara de Sub Red predeterminada es " + mask1p + "." + mask2p + "." + mask3p + "." + mask4p);           
    }
}

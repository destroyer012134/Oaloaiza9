import java.util.Scanner;

public class Ejercicio08{
	public static void main(String[] args) {
		
		// Variable de entrada
		Scanner entrada = new Scanner(System.in);

		System.out.print(" => Ingrese un numero (maximo 5 digitos): ");
		int numero = entrada.nextInt();

		if(numero>=0 && numero<=99999){

			int d1 = (numero/10000)%10;
			int d2 = (numero/1000)%10;
			int d3 = (numero/100)%10;
			int d4 = (numero/10)%10;
			int d5 = numero%10;

			// Algoritmo para validar Digito 1
			if (d1==0) {
				System.out.print("");
			}else if(d1==1){
				if (d2==0) {
					System.out.print("DIEZ MIL ");
				}else if(d2==1){
					System.out.print("ONCE MIL ");
				}else if(d2==2){
					System.out.print("DOCE MIL ");
				}else if(d2==3){
					System.out.print("TRECE MIL ");
				}else if(d2==4){
					System.out.print("CATORCE MIL ");
				}else if(d2==5){
					System.out.print("QUINCE MIL ");
				}else if(d2==6){
					System.out.print("DIECISEIS MIL ");
				}else if(d2==7){
					System.out.print("DIECISIETE MIL ");
				}else if(d2==8){
					System.out.print("DIECIOCHO MIL ");
				}else if(d2==9){
					System.out.print("DIECINUEVE MIL ");
				}
			}else if(d1==2){
				if (d2==0) {
					System.out.print("VEINTE MIL ");
				}else{
					System.out.print("VEINTI");
				}
			}else if(d1==3){
				if (d2==0) {
					System.out.print("TREINTA MIL ");
				}else{
					System.out.print("TREINTA Y ");
				}
			}else if(d1==4){
				if (d2==0) {
					System.out.print("CUARENTA MIL ");
				}else{
					System.out.print("CUARENTA Y ");
				}
			}else if(d1==5){
				if (d2==0) {
					System.out.print("CINCUENTA MIL ");
				}else{
					System.out.print("CINCUENTA Y ");
				}
			}else if(d1==6){
				if (d2==0) {
					System.out.print("SESENTA MIL ");
				}else{
					System.out.print("SESENTA Y ");
				}
			}else if(d1==7){
				if (d2==0) {
					System.out.print("SETENTA MIL ");
				}else{
					System.out.print("SETENTA Y ");
				}
			}else if(d1==8){
				if (d2==0) {
					System.out.print("OCHENTA MIL ");
				}else{
					System.out.print("OCHENTA Y ");
				}
			}else if(d1==9){
				if (d2==0) {
					System.out.print("NOVENTA MIL ");
				}else{
					System.out.print("NOVENTA Y ");
				}
			}

			// Algoritmo para validar Digito 2
			if (d2==0) {
				System.out.print("");
			}else if(d2==1){
				if (d1==0) {
					System.out.print("MIL ");
				}
				if (d1>=2 && d1<=9) {
					System.out.print("UN MIL ");
				}
			}else if(d2==2){
				if (d1!=1) {
					System.out.print("DOS MIL ");
				}
			}else if(d2==3){
				if (d1!=1) {
					System.out.print("TRES MIL ");
				}
			}else if(d2==4){
				if (d1!=1) {
					System.out.print("CUATRO MIL ");
				}
			}else if(d2==5){
				if (d1!=1) {
					System.out.print("CINCO MIL ");
				}
			}else if(d2==6){
				if (d1!=1) {
					System.out.print("SEIS MIL ");
				}
			}else if(d2==7){
				if (d1!=1) {
					System.out.print("SIETE MIL ");
				}
			}else if(d2==8){
				if (d1!=1) {
					System.out.print("OCHO MIL ");
				}
			}else if(d2==9){
				if (d1!=1) {
					System.out.print("NUEVE MIL ");
				}
			}

			// Algoritmo para validar Digito 3
			if (d3==0) {
				System.out.print("");
			}else if(d3==1){
				if(d4==0 && d5==0){
					System.out.print("CIEN");
				}else{
					System.out.print("CIENTO ");
				}
			}else if(d3==2){
				System.out.print("DOSCIENTOS ");
			}else if(d3==3){
				System.out.print("TRESCIENTOS ");
			}else if(d3==4){
				System.out.print("CUATROCIENTOS ");
			}else if(d3==5){
				System.out.print("QUINIENTOS ");
			}else if(d3==6){
				System.out.print("SEISCIENTOS ");
			}else if(d3==7){
				System.out.print("SETECIENTOS ");
			}else if(d3==8){
				System.out.print("OCHOCIENTOS ");
			}else if(d3==9){
				System.out.print("NOVECIENTOS ");
			}

			// Algoritmo para validar Digito 4
			
		}else{
			System.out.println(" => Numero invalido. ");
		}

	}
}
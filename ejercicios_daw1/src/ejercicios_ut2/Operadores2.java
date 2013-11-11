package ejercicios_ut2;
//Completa la siguiente tabla 
//(crea también un programa Java que muestre la tabla 
//realizando cada uno de los cálculos):
/*
a		b		a and b		b or b		not a		not b
3>5		12!8	false		true							
5>=6	3!=3
-7=8	2=2
21!=12	true
4=2		7>=9
*/

public class Operadores2 {

	public static void main(String[] args) {

	 boolean a,b;
	 a=(3>5);
	 b=(12 != 8);
	 
	 System.out.println("a\tb\ta and b\ta or b\tnot a\tnot b");
	 System.out.print("(3>5)\t(12!=8)\t"+(a&&b));
	 System.out.print("\t"+(a||b));
	 System.out.print("\t"+(!a));
	 System.out.print("\t"+(!b));
	 
	 a=(5>=6);
	 b=(3!=3);
	 System.out.println();
	 System.out.print("(3>5)\t(3!=3)\t"+(a&&b));
	 System.out.print("\t"+(a||b));
	 System.out.print("\t"+(!a));
	 System.out.print("\t"+(!b));
	 
	 a=(-7==8);
	 //b=22;
	 System.out.println();
	 System.out.print("-7=8\t(22)\t"+"(ERROR)");
	 System.out.print("\t"+"(ERROR)");
	 System.out.print("\t"+(!a));
	 System.out.print("\t"+"(ERROR)");
	 
	 a=(21!=12);
	 b=(true);
	 System.out.println();
	 System.out.print("21!=12\ttrue\t"+(a&&b));
	 System.out.print("\t"+(a||b));
	 System.out.print("\t"+(!a));
	 System.out.print("\t"+(!b));
	 
	 a=(4==2);
	 b=(7>=9);
	 System.out.println();
	 
	 System.out.print("(4=2)\t(7>=9)\t"+(a&&b));
	 System.out.print("\t"+(a||b));
	 System.out.print("\t"+(!a));
	 System.out.print("\t"+(!b));
	 
	 
			/*/ System.out.print(
					 System.out.print(
							 System.out.print(
									 System.out.print(
											 System.out.print(
	 
	*/
		
	}

}

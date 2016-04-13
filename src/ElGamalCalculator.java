import java.math.BigInteger;
import java.util.Scanner;

public class ElGamalCalculator {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter p: ");
		String input = sc.nextLine();
		BigInteger p = new BigInteger(input);
		System.out.print("Enter e1: ");
		input = sc.nextLine();
		BigInteger e1 = new BigInteger(input);
		System.out.print("Enter d: ");
		input = sc.nextLine();
		BigInteger d = new BigInteger(input);
		BigInteger e2 = e1.pow(d.intValue()).mod(p);
		System.out.println("p = "+p+"\ne1 = "+e1+"\ne2 = "+e2+"\nd = "+d);
		System.out.println("Encryption...");
		System.out.print("Enter r: ");
		input = sc.nextLine();
		BigInteger r = new BigInteger(input);
		System.out.print("Enter t: ");
		input = sc.nextLine();
		BigInteger t = new BigInteger(input);
		BigInteger c1 = e1.pow(r.intValue()).mod(p);
		BigInteger c2 = e2.pow(r.intValue()).multiply(t).mod(p);
		System.out.println("r = "+r+"\nc1 = "+c1+"\nc2 = "+c2);
		System.out.println("Decryption...");
		BigInteger power = p.subtract(new BigInteger("1")).subtract(d);
		BigInteger td = c2.multiply(c1.pow(power.intValue())).mod(p);
		System.out.println("td = "+td);
	}

}

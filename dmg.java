public class dmg {
public static void main (String [] args) {
	
	try {
	double base = Double.parseDouble(args[0]);
	double multi = Double.parseDouble(args[1]);
	double combo = Double.parseDouble(args[2]);
	double timing = Double.parseDouble(args[3]);
	double def = Double.parseDouble(args[4]);

	if (def < 0 ^ base < 0 ^ multi < 0 ^ combo < 0){
	System.out.println("The Defense/BaseAttack/Multiplier/Combo cannot be below 0");
				}
	 else{			
		if ((def-((base*multi)/combo) >= 0)){
		System.out.println("Total Damage is " + 1 + " | Your Total Attack is " + (base*multi));
									} 
			else{
			System.out.println("Total Damage is " + ((((base*multi/combo)-def)*combo)+((base*multi)*timing)) + " | Your Total Attack is " + (base*multi));
				}
		}}
			catch (java.lang.ArrayIndexOutOfBoundsException e){
			System.out.println("Put in 6 Numbers");
			System.out.println("For example:");
			System.out.println("java dmg 100 62.5 4 0.9 20");
			System.out.println("would mean:");
			System.out.println("100 BaseAttack");
			System.out.println("62.5 Multiplier");
			System.out.println("4 Combo | -1 yourself for Good | -2 for Great| -3 for Quickpush");
			System.out.println("0.9 TimingMultiplier |0 = Miss/QuickPush|0.33 = Good|0.66 = Great|0.9 = Perfect");
			System.out.println("20 Defense");
		
														  }
				catch (java.lang.NumberFormatException e){
				System.out.println("Put in 6 Numbers");
				System.out.println("For example:");
				System.out.println("java dmg 100 62.5 4 0.9 20");
				System.out.println("would mean:");
				System.out.println("100 BaseAttack");
				System.out.println("62.5 Multiplier");
				System.out.println("4 Combo | -1 yourself for Good | -2 for Great| -3 for Quickpush");
				System.out.println("0.9 TimingMultiplier |0 = Miss/QuickPush|0.33 = Good|0.66 = Great|0.9 = Perfect");
				System.out.println("20 Defense");
													 }
}}

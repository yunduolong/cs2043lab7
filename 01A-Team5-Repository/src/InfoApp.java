
public class InfoApp {

	private static InfoPrintKennedy printingKennedy = new InfoPrintKennedy();
  	private static InfoPrintKim printingKim = new InfoPrintKim();
  	private static InfoPrintKeirstead printingKeirstead = new InfoPrintKeirstead();
	private static InfoPrintLong printingLong = new InfoPrintLong();
  	private static InfoPrintMacfadyen printingMacfadyen = new InfoPrintMacfadyen();
  	private static InfoPrintLosier printingLosier = new InfoPrintLosier();
	public static void main(String[] args) {
		System.out.println("Section 1 Team 5 Member List");

		printingKim.printKim();
		printingKennedy.printKennedy();
    		printingKeirstead.printKeirstead();
		printingMacfadyen.printMacfadyen();
		printingLong.printLong();
		printingLosier.printLosier();

	}

}


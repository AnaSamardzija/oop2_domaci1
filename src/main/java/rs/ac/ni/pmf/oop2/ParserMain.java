package rs.ac.ni.pmf.oop2;

public class ParserMain
{
	public static void main(String[] args)
	{
		ParseAndStoreText text = new ParseAndStoreText();
		text.setEncoder(new UpperCaseEncoder());
		text.setStorage(new DatabaseStorage());

		text.parseAndStore("    avafadogjoidfv  fgkdfopgfdp    ");
	}
}

package rs.ac.ni.pmf.oop2;

public class ParseAndStoreText
{
	Encoder _encoder;
	Storage _strorage;

	public void setEncoder(Encoder encoder){
		_encoder = encoder;
	}
	public void setStorage(Storage strorage){
		_strorage = strorage;
	}
	private String parseText(String text)
	{
		String trimmed = text.trim();
        return _encoder.encode(trimmed);
	}
	private String storeText(String text)
	{
        return _strorage.store();
	}
	public void parseAndStore(String text){
		String parsedText = parseText(text);
		String storedText = storeText(parsedText);
		System.out.println(parsedText);
		System.out.println(storedText);
	}
}
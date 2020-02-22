package edu.wpi.cs3733.entity;

/**
 * Caesar cipher; you must implement the cipher and the observer pattern
 */
public class CaesarCipher implements Observer {
	private int SHIFT = 5;
	private String text;

	public void setText(String text) {
		this.text = "";
		int length = text.length();
		char c;

		for (int i = 0; i < length; i++) {
			c = text.charAt(i);
			if(Character.isLetter(c)) {
				c = (char) (text.charAt(i) - SHIFT);
				if((Character.isLowerCase(text.charAt(i)) && c < 'a') || (Character.isUpperCase(text.charAt(i)) && c < 'A')) {
					c = (char) (text.charAt(i) + (26 - SHIFT));
				}
				this.text += c;
			}
			if(Character.isSpaceChar(c)) {
				this.text += " ";
			}
		}
	}

	public String getText(){
		return text;
	}

	@Override
	public void notify(Object object) {
		if(object.toString().length() > 140) setText(object.toString().substring(0, 140));
		else setText(object.toString());
	}
}

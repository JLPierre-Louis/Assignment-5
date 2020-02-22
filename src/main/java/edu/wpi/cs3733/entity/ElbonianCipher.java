package edu.wpi.cs3733.entity;

/**
 * Elbonian cipher; you must implement the cipher and the observer pattern
 */
public class ElbonianCipher implements Observer {
	private String text;

	public void setText(String text){
		this.text = "";
		int length = text.length();
		char c;

		for (int i = 0; i < length; i++) {
			c = text.charAt(i);
			if(Character.isSpaceChar(c)) {
				this.text += "S";
			}
			else if (Character.isLetter(c) && Character.isUpperCase(c)) {
				int cInt = c - 'A' + 1;
				this.text += (cInt < 10) ? "0" + cInt : cInt;
			}
			else if (Character.isLetter(c) && Character.isLowerCase(c)) {
				int cInt = c - 'a' + 1;
				this.text += (cInt < 10) ? "0" + cInt : cInt;
			}
		}
	}

	public String getText(){
		return text;
	}

	@Override
	public void notify(Object object){
		setText(object.toString());
	}
}

package com.jesperapps.schoolmanagement.constants;

public class AnswerLableTypes {
	public static String paragraph = "p",
			bulletin="bulletin",
			gif="gif";
	
	public static String findAnswerLableType(String answerLabel) {
		if(answerLabel.indexOf("p") != -1) {
			return AnswerLableTypes.paragraph;
		}else if(answerLabel.indexOf("b") != -1) {
			return AnswerLableTypes.bulletin;
		}
		return AnswerLableTypes.gif;
	}
}

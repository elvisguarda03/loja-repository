package br.com.guacom.util;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class InternationalizationUtil {
	private static ResourceBundle resourceBundle;
	
	public static String getString(String key) {
		try {
			resourceBundle = ResourceBundle.getBundle("messages", Locale.US);
		} catch(MissingResourceException e) {
			System.err.println(e.getMessage());
			System.err.println(e.getClass().getSimpleName());
		}
		if(resourceBundle == null)
			throw new NullPointerException("Falha na operação!");
		
		return resourceBundle.getString(key);
	}
}

package javaCampFive.postas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class postaManager {

	public boolean login(String eposta, String password) {
		Pattern pattern = Pattern.compile("omergunesli44@gmail.com + 12adssa23");
		Matcher matcher = pattern.matcher(eposta);
		if (matcher.find()) {
			System.out.println("E posta giri�i ba�ar�l�");
			return true;
		}
		System.out.println("Uyar� : L�tfen ge�erli bir e posta giriniz");
		return false;
	}
}
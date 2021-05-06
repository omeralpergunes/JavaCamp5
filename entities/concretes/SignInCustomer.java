package javaCampFive.entities.concretes;

import javaCampFive.entities.abstracts.Entity;

public class SignInCustomer implements Entity{

		private String eposta;
		private String password;
		public SignInCustomer(String eposta, String password) {
			super();
			this.eposta = eposta;
			this.password = password;
		}
		public String getEposta() {
			return eposta;
		}
		public void setEposta(String eposta) {
			this.eposta = eposta;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
}}

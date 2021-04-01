
/**
 * Germ�n Iglesias Ramos
 * UO202549
 * SSI - Tarea Seminario APACHE COMMONS VALIDATORS
 * Validar un Email
 */

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.validator.routines.EmailValidator;

public class Validar {

	public static void main(String[] args) {

		// Creamos una instancia de EmailValidator
		EmailValidator emailValidator = EmailValidator.getInstance();

		// Creamos una lista de correos electr�nicos
		List<String> emails = new ArrayList<String>();

		// Emails v�lidos
		emails.add("german@iglesias.com");
		emails.add("german.iglesias@ramos.com");
		emails.add("german@iglesias.ramos.org");
		emails.add("german789.$#*@123iglesias.ramos.org");

		// Emails inv�lidos
		emails.add("german.iglesias.com"); // No contine "@"
		emails.add("german..iglesias@ramos.com"); // Puntos seguidos en la parte local
		emails.add("german@.iglesias.com"); // Inicio punto en el dominio
		emails.add("german@iglesias.ramos"); // En el dominio no existe un .com .es .org .net

		// Recorremos la lista
		for (String valor : emails) {
			System.out.println("La direcci�n de correo electr�nico: [" + valor + "] es "
					+ (emailValidator.isValid(valor) ? "v�lida" : "inv�lida"));
		} // emailValidator.isValid() = comprueba si las direcciones de correo electr�nico
			// son v�lidas mediante el m�todo isValid
	}
}

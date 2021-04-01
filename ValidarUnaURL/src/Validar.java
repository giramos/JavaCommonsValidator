
/**
 * Germán Iglesias Ramos
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

		// Creamos una lista de correos electrónicos
		List<String> emails = new ArrayList<String>();

		// Emails válidos
		emails.add("german@iglesias.com");
		emails.add("german.iglesias@ramos.com");
		emails.add("german@iglesias.ramos.org");
		emails.add("german789.$#*@123iglesias.ramos.org");

		// Emails inválidos
		emails.add("german.iglesias.com"); // No contine "@"
		emails.add("german..iglesias@ramos.com"); // Puntos seguidos en la parte local
		emails.add("german@.iglesias.com"); // Inicio punto en el dominio
		emails.add("german@iglesias.ramos"); // En el dominio no existe un .com .es .org .net

		// Recorremos la lista
		for (String valor : emails) {
			System.out.println("La dirección de correo electrónico: [" + valor + "] es "
					+ (emailValidator.isValid(valor) ? "válida" : "inválida"));
		} // emailValidator.isValid() = comprueba si las direcciones de correo electrónico
			// son válidas mediante el método isValid
	}
}

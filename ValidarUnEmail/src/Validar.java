
/**
 * Germ?n Iglesias Ramos
 * UO202549
 * SSI - Tarea Seminario APACHE COMMONS VALIDATORS
 * Validar una Tarjeta De Cr?dito VISA
 */

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.validator.routines.CreditCardValidator;

public class Validar {

	public static void main(String[] args) {

		// Creamos una tarjeta de credito VISA
		CreditCardValidator creditCardValidator = new CreditCardValidator(CreditCardValidator.VISA);

		// Creamos una lista de tarjetas de VISA
		List<String> urls = new ArrayList<String>();

		// VISAS v?lidos
		urls.add("4111111111111111");
		urls.add("4012888888881881");
		urls.add("4222222222222");


		// VISAS inv?lidos
		urls.add("5500000000000004"); // Pertenece a una MASTERCARD
		urls.add("4111 1111 1111 1111"); // No se permiten espacios
		urls.add("3787 3449 3671 000"); // Pertenece a una AMERICAN EXPRESS
		urls.add("41111111111111111"); // Demasiados d?gitos
		
		// Recorremos la lista
		for (String valor : urls) {
			System.out.println("La URL: [" + valor + "] es " + (creditCardValidator.isValid(valor) ? "v?lida" : "inv?lida"));
		} // creditCardValidator.isValid() = comprueba si las VISAS
			// son v?lidas mediante el m?todo isValid
	}
}

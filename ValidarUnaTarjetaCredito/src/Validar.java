
/**
 * Germ?n Iglesias Ramos
 * UO202549
 * SSI - Tarea Seminario APACHE COMMONS VALIDATORS
 * Validar una URL
 */

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.validator.routines.UrlValidator;

public class Validar {

	public static void main(String[] args) {

		// Creamos una instancia de UrlValidator
		UrlValidator urlValidator = UrlValidator.getInstance();

		// Creamos una lista de url
		List<String> urls = new ArrayList<String>();

		// Emails v?lidos
		urls.add("https://www.uniovi.es/");
		urls.add("http://www.uniovi.es/");
		urls.add("https://uniovi.es/");
		urls.add("https://www.uniovi.es/launiversidad/panoramica");
		urls.add("ftp://www.uniovi.es");

		// Emails inv?lidos
		urls.add("https://www.uniovi"); // No contiene el dominio .es .com .org .net
		urls.add("www.uniovi.es/"); // No tiene protocolo
		urls.add("https:/www.uniovi.es/"); // Le falta "/"
		urls.add("https:www.uniovi.es/"); // Le falta "//"
		urls.add("file://www.uniovi.es/"); // El protocolo debe ser http https ftp

		// Recorremos la lista
		for (String valor : urls) {
			System.out.println("La URL: [" + valor + "] es " + (urlValidator.isValid(valor) ? "v?lida" : "inv?lida"));
		} // urlValidator.isValid() = comprueba si las url
			// son v?lidas mediante el m?todo isValid
	}
}

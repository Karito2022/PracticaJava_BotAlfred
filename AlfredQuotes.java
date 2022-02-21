import java.util.Date;

public class AlfredQuotes {

    // Nota: estos saludos no se imprimen en la consola, pero retorna como una cadena para usar en el archivo de prueba.
    // Inputs: Ninguno
    // Tipo de retorno: String
    // Output: Devuelve un saludo genérico básico que Alfred podría decirle a cualquiera.
    public String basicGreeting() {
        return "Hola, encantado de verte. ¿Cómo estás?";
    }

    // Inputs: Nombre de cadena, Cadena: suponga "mañana", "tarde" o "noche".
    // Tipo de retorno:  String
    // Output: devuelve un saludo Alfred podría decir, que incluya el nombre de la persona en el saludo.
    public String guestGreeting(String dayPeriod, String name) {
        return String.format("Buenas %s, %s. Encantado de verte.", dayPeriod, name);
    }

    // Inputs: Ninguno
    // Tipo de retorno:  String
    // Output: Devuelve un anuncio de la fecha actual, de manera educada.
    public String dateAnnouncement() {
        return String.format("Es actualmente %s", new Date());
    }
    
    // Inputs: String (cualquier frase)
    // Tipo de retorno:  String
    // Output: Una respuesta (String)
    public String answeringBeforeAlexis(String phrase) {

        if(phrase.indexOf("Alexis") > -1) {
            return "Ella realmente no es de ayuda. ¿Qué puedo traerte?";
        }

        if (phrase.indexOf("Alfred") > -1) {
            return "A su servicio, naturalmente. ¿Cómo puedo ser de ayuda?";
        }

        return "Correcto. Y con eso me retiraré.";
    }
}
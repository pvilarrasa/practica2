package daaw.practica2.controllers.exception;

public class FilmNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public FilmNotFoundException() {
        super();
    }

    public FilmNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public FilmNotFoundException(final String message) {
        super(message);
    }

    public FilmNotFoundException(final Throwable cause) {
        super(cause);
    }
}
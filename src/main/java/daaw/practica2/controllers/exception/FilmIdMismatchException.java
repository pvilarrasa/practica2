package daaw.practica2.controllers.exception;

public class FilmIdMismatchException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public FilmIdMismatchException() {
        super();
    }

    public FilmIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public FilmIdMismatchException(final String message) {
        super(message);
    }

    public FilmIdMismatchException(final Throwable cause) {
        super(cause);
    }
}
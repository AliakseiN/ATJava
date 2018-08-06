public class CustomExceptions extends Exception {
    private String errorMessage;

    public CustomExceptions(String errorMessage){
        this.errorMessage = errorMessage;
    }

    @Override
    public String getMessage() {
        return errorMessage;
    }

}

class CustomValidationException extends Exception {
    public CustomValidationException(String message) {
        super(message);
    }
}

class Validator {
    public static void main(String[] args) {
        try {
            validateNumber(-1);
        } catch (CustomValidationException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    public static void validateNumber(int number) throws CustomValidationException {
        if (number < 0) {
            throw new CustomValidationException("Number is negative. Validation failed.");
        } else {
            System.out.println("Number is positive. Validation passed.");
        }
    }
}

package decrypt;

public class HDecrypt {
    private final StringDecryption decryption = new StringDecryption();

    public String decryptString(final String input) {
        return decryption.decryptString(input);
    }

    public String customDecryption(final String input) {
        return decryption.hStringDecrypt(input);
    }
}

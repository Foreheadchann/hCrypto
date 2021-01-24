package encrypt;

public class HEncrypt {
    private final StringEncryption encryptor = new StringEncryption();

    public String encryptString(final String input) {
        return encryptor.encryptString(input, true);
    }

    public String encryptString(final String input, final boolean reverseString) {
        return encryptor.encryptString(input, reverseString);
    }

    public String customEncryption(final String input, final String delimiter) {
        return encryptor.hStringEncrypt(input, delimiter);
    }
}
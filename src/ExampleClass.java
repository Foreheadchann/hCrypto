import decrypt.HDecrypt;
import encrypt.HEncrypt;

public class ExampleClass {
    // Encryption Class Examples
    private static final HEncrypt encryptor = new HEncrypt();
    private static final HDecrypt decryptor = new HDecrypt();

    public static void main(String[] args) {
        // EXAMPLES
        System.out.println(encryptor.encryptString("Encrypted String"));
        System.out.println(decryptor.decryptString(encryptor.encryptString("Encrypted String")));
        System.out.println(encryptor.customEncryption("Encrypted String", "Delimiter"));
        System.out.println(decryptor.customDecryption(encryptor.customEncryption("Encrypted String", "Delimiter")));
    }
}

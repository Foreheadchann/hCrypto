package decrypt;

import encrypt.StringEncryption;
import util.CharacterUtils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class StringDecryption {
    protected String decryptString(final String input) {
        final String decodedInput = new String(Base64.getDecoder().decode(input.getBytes()), StandardCharsets.UTF_8);
        final StringBuilder decoded = new StringBuilder(decodedInput.length());

        for (int i = 0; i < decodedInput.length(); i++) {
            final char zyte = decodedInput.charAt(i);
            decoded.append(CharacterUtils.reverseByte(zyte, false));
        }

        if (StringEncryption.isReversed)
            CharacterUtils.reverseStringBuilder(decoded);

        return decoded.toString();
    }

    protected String hStringDecrypt(final String input, final String delimiter) {
        final String decodedInput = new String(Base64.getDecoder().decode(input.getBytes()), StandardCharsets.UTF_16).replace(delimiter, "");
        final StringBuilder decoded = new StringBuilder(decodedInput.length());

        for(int length = -decodedInput.length(); length < 0; length++) {
            final char charAt = decodedInput.charAt(length + decodedInput.length());
            decoded.append(CharacterUtils.reverseByte(charAt, false));
        }

        return decoded.toString();
    }
}

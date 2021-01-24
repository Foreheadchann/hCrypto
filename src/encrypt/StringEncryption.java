package encrypt;

import util.CharacterUtils;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.StringJoiner;

public class StringEncryption {
    public static boolean isReversed;

    protected String encryptString(final String input, boolean reverseString) {
        final StringBuilder encoded = new StringBuilder(input.length());

        for (int i = 0; i < input.length(); i++) {
            final char zyte = input.charAt(i);
            encoded.append(CharacterUtils.reverseByte(zyte, true));
        }

        if(reverseString) {
            CharacterUtils.reverseStringBuilder(encoded);
            isReversed = true;
        } else { isReversed = false; }

        return Base64.getEncoder().encodeToString(encoded.toString().getBytes());
    }

    protected String hStringEncrypt(final String input, final String delimiter) {
        final StringJoiner stringJoiner = new StringJoiner(delimiter);

        for(int length = -input.length(); length < 0; length++) {
            final char charAt = input.charAt(length + input.length());
            stringJoiner.add(String.valueOf(CharacterUtils.reverseByte(charAt, true)));
        }

        return Base64.getEncoder().encodeToString(stringJoiner.toString().getBytes(StandardCharsets.UTF_16));
    }
}

package util;

public class CharacterUtils {
    public static char reverseByte(final char ch, final boolean encrypt) {
        if (encrypt) return (char) (((ch & 0xFF00) >> 8) | (ch << 8));
        else return (char) (((ch & 0xFF00) >> 8) | (ch << 8));
    }

    public static void reverseStringBuilder(StringBuilder sb) {
        sb.reverse();
    }
}

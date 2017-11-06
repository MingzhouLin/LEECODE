package contest56;

import java.util.LinkedHashMap;
import java.util.Map;
public class stringCompression {
    public static void main(String[] args) {
        new stringCompression().run();
    }

    public void run() {
        char[] chars = {'a'};
        System.out.println(compress(chars));
        for (char c : chars) {
            System.out.print(c);
        }
    }

    public int compress(char[] chars) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char deposit = chars[0];
        int count = 0;
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == deposit) {
                count++;
                    if (i == chars.length - 1) {
                        if (count == 1) {
                            chars[index] = chars[i];
                            index++;
                        } else {
                            chars[index] = chars[i];
                            index++;
                            if (count == 1000) {
                                for (int j = index; j < index + 4; j++) {
                                    if (j == index) {
                                        chars[index] = '1';
                                    } else {
                                        chars[index] = '0';
                                    }
                                    index = index + 4;
                                }
                            } else if (count >= 100) {
                                chars[index] = (char) (count / 100 + 48);
                                index++;
                                chars[index] = (char) ((count - count / 100 * 100) / 10 + 48);
                                index++;
                                chars[index] = (char) ((count - count / 10 * 10) + 48);
                                index++;
                            } else if (count >= 10) {
                                chars[index] = (char) (count / 10 + 48);
                                index++;
                                chars[index] = (char) ((count - count / 10 * 10) + 48);
                                index++;
                            } else {
                                chars[index] = (char) (count + 48);
                                index++;
                            }
                        }
                    }
                } else {
                    if (count == 1) {
                        chars[index] = deposit;
                        index++;
                    } else {
                        chars[index] = deposit;
                        index++;
                        if (count == 1000) {
                            for (int j = index; j < index + 4; j++) {
                                if (j == index) {
                                    chars[index] = '1';
                                } else {
                                    chars[index] = '0';
                                }
                                index = index + 4;
                            }
                        } else if (count >= 100) {
                            chars[index] = (char) (count / 100 + 48);
                            index++;
                            chars[index] = (char) ((count - count / 100 * 100) / 10 + 48);
                            index++;
                            chars[index] = (char) ((count - count / 10 * 10) + 48);
                            index++;
                        } else if (count >= 10) {
                            chars[index] = (char) (count / 10 + 48);
                            index++;
                            chars[index] = (char) ((count - count / 10 * 10) + 48);
                            index++;
                        } else {
                            chars[index] = (char) (count + 48);
                            index++;
                        }
                }
                deposit=chars[i];
                count=1;
                if (i == chars.length - 1) {
                    chars[index] = chars[i];
                    index++;
                }
            }
        }
    return index;
    }
}
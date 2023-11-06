package twentyThree;

public class duplicates {
    public static void deleteDuplicates(String str, int index, StringBuilder newStr, boolean map[]) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(index);
        if (map[currentChar - 'a'] == true) {
            deleteDuplicates(str, index+1, newStr, map);
        } else {
            map[currentChar - 'a'] = true;
            deleteDuplicates(str, index+1, newStr.append(currentChar), map);
        }
    }

    public static void main(String args[]) {
        String str = "appnacollege";
        deleteDuplicates(str, 0,new StringBuilder(" "), new boolean[26]);
    }
}

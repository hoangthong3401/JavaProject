
import java.util.Random;

public class BigNumber {

    private final Tool tool = new Tool();

    //Addtion the value to the left with the right.
    public String add(String a, String b) {
        String result = "";
        if (tool.check(a) && tool.check(b)) {
            if (a.length() >= b.length()) {
                b = tool.insert(b, a.length() - b.length());
            } else {
                a = tool.insert(a, b.length() - a.length());
            }
            int r = 0;
            for (int i = a.length() - 1; i >= 0; i--) {
                if (i == 0) {
                    result = tool.getValueAt(a, 0) + tool.getValueAt(b, 0) + r + result;
                    break;
                }
                if (tool.getValueAt(a, i) + tool.getValueAt(b, i) + r <= 9) {
                    result = tool.getValueAt(a, i) + tool.getValueAt(b, i) + r + result;
                    r = 0;
                } else {
                    result = tool.getValueAt(a, i) + tool.getValueAt(b, i) + r - 10 + result;
                    r = 1;
                }
            }
        } else if (tool.check(a) && !tool.check(b)) {
            result = sub(a, b.substring(1));
        } else if (!tool.check(a) && tool.check(b)) {
            result = sub(b, a.substring(1));
        } else {
            result = "-" + add(a.substring(1), b.substring(1));
        }
        return result;
    }

    //Substraction the value to the left with the right.
    public String sub(String a, String b) {
        String result = "";
        return result;
    }

    //Multiply the value to the left with the right.
    public String mul(String a, String b) {
        String result = "";
        return result;
    }

    //Multiply the value to the left with the right value.
    public String mul(String a, int b) {
        String result = "";
        return result;
    }

    //Divides left-hand operand by right-hand operand.
    public String div(String a, String b) {
        String result = "";
        return result;
    }

    //Divides left-hand operand by right-hand operand and returns remainder.
    public String mod(String a, String b) {
        String result = "";
        return result;
    }

    class Tool {

        /*Remove the zero digits of the input chain.
        For instance, "000036543" -> "36543", "001300315" -> "1300315". */
        public String trim(String parameter) {
            if (check(parameter)) {
                while (parameter.startsWith("0")) {
                    if (parameter.length() == 1) {
                        break;
                    }
                    parameter = parameter.substring(1);
                }
            } else {
                parameter = "-" + trim(parameter.substring(1));
            }
            return parameter;
        }

        //Add the number of Zero digits to the input stream.
        public String insert(String parameter, int amount) {
            for (int i = 0; i < amount; i++) {
                parameter = "0" + parameter;
            }
            return parameter;
        }

        /*Compare two numbers of type String, return 1 if a is greater than b, 
        equally returns 0, and -1 for the remaining cases.*/
        public int compare(String a, String b) {
            a = trim(a);
            b = trim(b);
            if (a.equals(b)) {
                return 0;
            }
            if (check(a) && !check(b)) {
                return 1;
            }
            if (!check(a) && check(b)) {
                return -1;
            }
            if (!check(a) && !check(b)) {
                return compare(a.substring(1), b.substring(1));
            }
            if (a.length() > b.length()) {
                return 1;
            }
            if (a.length() < b.length()) {
                return -1;
            }
            for (int i = 0; i < a.length(); i++) {
                if (getValueAt(a, i) > getValueAt(b, i)) {
                    return 1;
                }
            }
            return -1;
        }

        //This method returns the Integer located at the String's specified index.
        public int getValueAt(String parameter, int index) {
            return Character.getNumericValue(parameter.charAt(index));
        }

        //Check that some string types are negative or positive.
        public boolean check(String parameter) {
            if (parameter.startsWith("-")) {
                return false;
            } else {
                return true;
            }
        }

        //Random number, return a string
        public String randomNumber(int amount, boolean np) {
            String result = "";
            Random ran = new Random();
            for (int i = 0; i < amount; i++) {
                if (i == 0) {
                    if (np) {
                        int ra = ran.nextInt(2);
                        if (ra == 1) {
                            result = "-" + result;
                        }
                    }
                }
                int j = ran.nextInt(10);
                result += j;
            }
            return trim(result);
        }

    }
}

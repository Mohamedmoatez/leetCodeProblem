package Easy;

public class ExcelSheetColumnTitle {


    public static void main(String[] args) {
        int num = 701;
        System.out.println(convertToTitle(num));
    }

    //The mapping should be based on modulo 26 operations, not direct digit conversion
    //In the Excel column title problem, we need to convert a number into a base-26 system (where A=1, B=2, ..., Z=26). The modulo operation helps us find the correct letter for each position:
    //columnNumber % 26 gives the remainder, which maps to a letter (1 → A, 2 → B, ..., 0 → Z).
    //columnNumber /= 26 moves to the next higher place (like moving from units to tens in decimal)

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // Because 'A' corresponds to 1, not 0
            char c = (char) ('A' + columnNumber % 26);
            result.insert(0, c);
            columnNumber /= 26;
        }

        return result.toString();
    }


//    public static String convertToTitle(int columnNumber) {
//        String result;
//        StringBuilder stringBuilder = new StringBuilder();
//        String size = String.valueOf(columnNumber);
//        for (int i = 0 ; i < size.length() ; i++){
//            stringBuilder.append(getColumn(String.valueOf(size.charAt(i))));
//        }
//        System.out.println(stringBuilder);
//        result = stringBuilder.toString();
//        return result;
//    }


//    private static Character getColumn(String num) {
//        switch (num) {
//            case "1":
//                return 'A';
//            case "2":
//                return 'B';
//            case "3":
//                return 'C';
//            case 4:
//                return 'D';
//            case 5:
//                return 'E';
//            case 6:
//                return 'F';
//            case 7:
//                return 'G';
//            case 8:
//                return 'H';
//            case 9:
//                return 'I';
//            case 10:
//                return 'J';
//            case 11:
//                return 'K';
//            case 12:
//                return 'L';
//            case 13:
//                return 'M';
//            case 14:
//                return 'N';
//            case 15:
//                return 'O';
//            case 16:
//                return 'P';
//            case 17:
//                return 'Q';
//            case 18:
//                return 'R';
//            case 19:
//                return 'S';
//            case 20:
//                return 'T';
//            case 21:
//                return 'U';
//            case 22:
//                return 'V';
//            case 23:
//                return 'W';
//            case 24:
//                return 'X';
//            case 25:
//                return 'Y';
//            case 26:
//                return 'Z';
//            default:
//                return null; // or throw an exception for invalid input
//        }
//    }

//    private static Character getColumn(String num) {
//        switch (num) {
//            case "1":
//                return 'A';
//            case "2":
//                return 'B';
//            case "3":
//                return 'C';
//            case "4":
//                return 'D';
//            case "5":
//                return 'E';
//            case "6":
//                return 'F';
//            case "7":
//                return 'G';
//            case "8":
//                return 'H';
//            case "9":
//                return 'I';
//            case "10":
//                return 'J';
//            case "11":
//                return 'K';
//            case "12":
//                return 'L';
//            case "13":
//                return 'M';
//            case "14":
//                return 'N';
//            case "15":
//                return 'O';
//            case "16":
//                return 'P';
//            case "17":
//                return 'Q';
//            case "18":
//                return 'R';
//            case "19":
//                return 'S';
//            case "20":
//                return 'T';
//            case "21":
//                return 'U';
//            case "22":
//                return 'V';
//            case "23":
//                return 'W';
//            case "24":
//                return 'X';
//            case "25":
//                return 'Y';
//            case "26":
//                return 'Z';
//            default:
//                return null; // or throw IllegalArgumentException("Invalid column number")
//        }
//    }
}

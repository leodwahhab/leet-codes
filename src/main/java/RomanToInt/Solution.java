package RomanToInt;

class Solution {
    /**
     * Converts a Roman numeral string into its corresponding integer value.
     *
     * <p>Roman numerals are represented by the following seven symbols:</p>
     * <ul>
     *     <li>I = 1</li>
     *     <li>V = 5</li>
     *     <li>X = 10</li>
     *     <li>L = 50</li>
     *     <li>C = 100</li>
     *     <li>D = 500</li>
     *     <li>M = 1000</li>
     * </ul>
     *
     * <p>Roman numerals are usually written from largest to smallest from left to right.
     * However, in six specific cases, a smaller numeral precedes a larger one to indicate subtraction:</p>
     * <ul>
     *     <li>I before V or X (e.g., IV = 4, IX = 9)</li>
     *     <li>X before L or C (e.g., XL = 40, XC = 90)</li>
     *     <li>C before D or M (e.g., CD = 400, CM = 900)</li>
     * </ul>
     *
     * <p>Examples:</p>
     * <ul>
     *     <li>
     *         Input: s = "III"<br>
     *         Output: 3
     *     </li>
     *     <li>
     *         Input: s = "LVIII"<br>
     *         Output: 58 (L = 50, V = 5, III = 3)
     *     </li>
     *     <li>
     *         Input: s = "MCMXCIV"<br>
     *         Output: 1994 (M = 1000, CM = 900, XC = 90, IV = 4)
     *     </li>
     * </ul>
     *
     * @param s the Roman numeral string to convert (must contain only 'I', 'V', 'X', 'L', 'C', 'D', 'M'),
     *          where 1 <= s.length <= 15 and s represents a valid numeral in the range [1, 3999]
     * @return the integer value corresponding to the Roman numeral
     */
    public int romanToInt(String s) {
        int algarismoAtual;
        int algarismoProx;
        int num = 0;

        for(int i = 0; i < s.length(); i++) {
            algarismoAtual = this.converterParaInteiro(s.charAt(i));
            if(i == s.length()-1) {
                num += algarismoAtual;
                continue;
            }
            algarismoProx = this.converterParaInteiro(s.charAt(i+1));
            num += algarismoProx > algarismoAtual ? -algarismoAtual : algarismoAtual;
        }

        return num;
    }

    private int converterParaInteiro(char letra) {
        return switch (letra) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            default -> 1000;
        };
    }
}

//A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//        Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//
//
//
//        Example 1:
//
//        Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//        Output: true
//        Explanation: sentence contains at least one of every letter of the English alphabet.
//



public class Panagram {
    public static void main(String[] args) {
         String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {

        //not optimized
        // if(sentence.length() < 26){
        //     return false;
        // }else{
        //     for(char i='a'; i<='z'; i++){
        //         if(sentence.indexOf(i) < 0){
        //             return false;
        //         }
        //     }
        // }
        // return true;



        //OPTIMIZED

        //count array
        // int[] count = new int[26];


        // //loop and set values correcspondingly
        // for(int i=0; i<sentence.length(); i++){

        //     //ascii is 96
        //     count[sentence.charAt(i) - 'a']++;
        // }

        // //check any 0 in count
        // for(int i : count){
        //     if(i < 1) return false;
        // }

        // return true;


        //OPTIMIZED 2

        boolean[] letters  = new boolean[26];

        for(char c : sentence.toCharArray()) {
            letters[c - 'a'] = true;
        }

        //find any letter that not exist
        for(boolean existLetter : letters) {
            if(!existLetter) return false;
        }

        return true;


    }
}

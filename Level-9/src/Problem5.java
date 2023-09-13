public class Problem5 {
        public static void main(String[] args) {
            String sentence = "This is orange juice";
            String targetWord = "orange";
            boolean isPresent = false;
    
            String[] words = sentence.split(" ");
    
            for (String word : words) {
                if (word.equals(targetWord)) {
                    isPresent = true;
                    break; 
                }
            }
    
            if (isPresent) {
                System.out.println("The word 'orange' is present in the sentence.");
            } else {
                System.out.println("The word 'orange' is not present in the sentence.");
            }
        }
    }
    


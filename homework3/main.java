package hard;
import java.util.Random;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String[] word = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int arrayLength = word.length;//длина массива слов
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean flag= false;
        int index = random.nextInt(arrayLength);//сгенерированный случайный номер элемента массива
        String guessWord = word[index];// загаданное слово
        String userWord;//ответ пользователя
        do { System.out.println("Угадайте слово из предложенного набора: ");
        printArray(word);
        System.out.println();
         userWord = scanner.next();
        userWord = userWord.toLowerCase();// приводим все буквы слова к нижнему регистру
            int minArrLength = defineMinLength(guessWord,userWord );//наименьшее по длине слово
            String answer = compareWords(userWord, guessWord, minArrLength);
            boolean indexLetter = answer.contains("#");//проверка наличия в сравнении слов символа #
               if (indexLetter == false){
                System.out.println("Вы выиграли!");
                flag = true;
            }
            else{
                System.out.print(answer);
               System.out.println (addLengthArr(userWord));
                System.out.println("Попробуйте еще раз.");
            }
    }
        while (flag == false);

    }
   static void printArray(String[] arr)//Вывод массива
   {
      for (int i=0;i< arr.length;i++){
          System.out.print(arr[i]+" ");
      }
   }
   static String compareWords(String firstWord, String secondWord, int arrayLength ){// Проверка соответствия слов по буквам
   String printWord ="";
        for (int i = 0; i < arrayLength; i++)
       {
           char userLetter = firstWord.charAt(i);
           char guessLetter = secondWord.charAt(i);
           if (userLetter == guessLetter) {

               printWord+=userLetter;
           } else {
             printWord+="#";
           }
       }

        return printWord;
   }
   static int defineMinLength(String guess, String answer){//Проверка, какое слово меньше: загаданное или введенное пользователем
     int arrLength;
       if (answer.length()<guess.length()){
           arrLength =answer.length();
       }
       else{
           arrLength = guess.length();
       }
       return arrLength;
   }
   static String addLengthArr(String userWord){// Маскировка длины слова
       String answer="";
        for (int i = 0; i < (15 - userWord.length()); i++){
          answer+='#';
        }
        return answer;
   }
}
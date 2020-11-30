package baseball;

import utils.RandomUtils;

import java.util.Scanner;

public class Game {
    static final int MIN_NUMBER = 1;
    static final int MAX_NUMBER = 9;
    static final int MAX_LENGTH = 3;

    public static void playGame(Scanner scanner){
        String gameNumber = makeGameNumber();
        System.out.println(gameNumber);
        while (true){
            String a = scanner.nextLine();
            if (a.equals(gameNumber)){
                break;
            }
            System.out.println("aaa");
        }
    }

    // 1~9사이의 3자리 랜덤 숫자 생성
    public static String makeGameNumber(){
        String gameNumber = "";
        int countLength = 0;

        while (countLength < MAX_LENGTH) {
            int randomNumber = RandomUtils.nextInt(MIN_NUMBER, MAX_NUMBER);

            if (!gameNumber.contains(String.valueOf(randomNumber))) {
                gameNumber += randomNumber;
                countLength++;
            }
        }
        return gameNumber;
    }


}

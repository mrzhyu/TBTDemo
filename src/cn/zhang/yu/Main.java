package cn.zhang.yu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("请输入");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("exit")) {
            System.out.println("请继续输入");
            input = scanner.nextLine();
            if (input.equals("next")) {
                System.out.println("下一个");
            }
        }

    }
}

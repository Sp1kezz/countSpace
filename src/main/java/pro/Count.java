package pro;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Count {
    public static void main(String[] args){
        int spaceCounter = 0;
        for(;;)
            try {
                System.out.println("请输入（1-4）：1.输入字符串；2.统计空格数；3.空格数清零；4.退出");
                Scanner input = new Scanner(System.in);
                int number = Integer.parseInt(input.nextLine());
                int a=number;
                switch (a) {
                    case 1:
                        System.out.println("请输入待统计的字符串：");
                   //     Scanner scan = new Scanner(System.in);
                        String str = input.nextLine();
                        char[] charArray = str.toCharArray();
                        int i = 0;
                        while (i < charArray.length) {

                            if (Character.isSpaceChar(charArray[i])) {
                                spaceCounter++;
                            }
                            i++;
                        }
                        break;
                    case 2:
                        System.out.println("空格总数为:" + spaceCounter);
                        break;
                    case 3:
                        spaceCounter = 0;
                        break;
                    case 4:
                        input.close();
                        System.exit(1);
                        break;
                    default:
                        System.out.println("输入信息有误，请输入数字1-4！");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("输入信息有误，请输入数字");
            }catch (java.lang.NumberFormatException e){
                System.out.println("输入信息有误，请输入数字");
            }

        }

    }


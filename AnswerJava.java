// Java言語練習問題の答え
// 以下の問題の解答例です
import java.util.Arrays;

public class AnswerJava {
    
    // 問題1: 変数と基本的な計算
    // 2つの整数を受け取って、その合計を返すメソッド
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    // 問題2: 条件分岐
    // 数値が偶数か奇数かを判定するメソッド
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    
    // 問題3: ループ
    // 1からnまでの合計を計算するメソッド
    public static int sumToN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    // 問題4: 配列操作
    // 配列の中の最大値を求めるメソッド
    public static int findMax(int[] numbers) {
        if (numbers.length == 0) {
            return Integer.MIN_VALUE; // 空配列の場合
        }
        
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    
    // 問題5: クラスとオブジェクト
    // 学生の情報を表すクラスを定義し、平均点を計算するメソッド
    static class Student {
        private String name;
        private int[] scores;
        
        public Student(String name, int[] scores) {
            this.name = name;
            this.scores = scores;
        }
        
        public String getName() {
            return name;
        }
        
        public int[] getScores() {
            return scores;
        }
        
        public double calculateAverage() {
            if (scores.length == 0) {
                return 0.0;
            }
            
            int sum = 0;
            for (int score : scores) {
                sum += score;
            }
            return (double) sum / scores.length;
        }
    }
    
    // 問題6: 例外処理
    // 0で割り算をしようとした場合に例外を投げるメソッド
    public static double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("0で割り算できません");
        }
        return a / b;
    }
    
    // 問題7: 文字列操作
    // 文字列を逆順にするメソッド
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    
    // 問題8: 配列のソート
    // 配列を昇順にソートするメソッド（バブルソート）
    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // 交換
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== Java言語練習問題の答え ===");
        
        // 問題1のテスト
        System.out.println("\n問題1: 変数と基本的な計算");
        int result1 = addNumbers(5, 3);
        System.out.printf("5 + 3 = %d (期待値: 8)%n", result1);
        
        // 問題2のテスト
        System.out.println("\n問題2: 条件分岐");
        System.out.printf("10は偶数ですか? %s (期待値: true)%n", isEven(10));
        System.out.printf("7は偶数ですか? %s (期待値: false)%n", isEven(7));
        
        // 問題3のテスト
        System.out.println("\n問題3: ループ");
        int result3 = sumToN(5);
        System.out.printf("1から5までの合計: %d (期待値: 15)%n", result3);
        
        // 問題4のテスト
        System.out.println("\n問題4: 配列操作");
        int[] numbers = {3, 7, 2, 9, 1, 5};
        int max = findMax(numbers);
        System.out.printf("配列 %s の最大値: %d (期待値: 9)%n", Arrays.toString(numbers), max);
        
        // 問題5のテスト
        System.out.println("\n問題5: クラスとオブジェクト");
        Student student = new Student("田中太郎", new int[]{85, 92, 78, 96, 88});
        double average = student.calculateAverage();
        System.out.printf("%sの平均点: %.2f (期待値: 87.80)%n", student.getName(), average);
        
        // 問題6のテスト
        System.out.println("\n問題6: 例外処理");
        try {
            double result6 = divide(10, 2);
            System.out.printf("10 ÷ 2 = %.1f (期待値: 5.0)%n", result6);
        } catch (ArithmeticException e) {
            System.out.printf("エラー: %s%n", e.getMessage());
        }
        
        try {
            double result6Err = divide(10, 0);
            System.out.printf("10 ÷ 0 = %.1f%n", result6Err);
        } catch (ArithmeticException e) {
            System.out.printf("エラー: %s (期待値: 0で割り算できません)%n", e.getMessage());
        }
        
        // 問題7のテスト
        System.out.println("\n問題7: 文字列操作");
        String reversed = reverseString("Hello");
        System.out.printf("'Hello' を逆順にすると: '%s' (期待値: 'olleH')%n", reversed);
        
        // 問題8のテスト
        System.out.println("\n問題8: 配列のソート");
        int[] arrToSort = {5, 2, 8, 1, 9, 3};
        System.out.printf("ソート前: %s%n", Arrays.toString(arrToSort));
        sortArray(arrToSort);
        System.out.printf("ソート後: %s (期待値: [1, 2, 3, 5, 8, 9])%n", Arrays.toString(arrToSort));
        
        System.out.println("\n=== 練習問題の答え完了 ===");
        System.out.println("すべての期待値と一致しているはずです！");
        
        // 追加のテスト例
        System.out.println("\n=== 追加のテスト例 ===");
        
        // 空配列のテスト
        System.out.println("空配列の最大値: " + findMax(new int[]{}));
        
        // 文字列の逆順テスト
        System.out.println("'こんにちは' を逆順にすると: '" + reverseString("こんにちは") + "'");
        
        // 学生の平均点テスト（空のスコア）
        Student emptyStudent = new Student("空の学生", new int[]{});
        System.out.printf("空の学生の平均点: %.2f%n", emptyStudent.calculateAverage());
    }
} 
// Java言語練習問題
// 以下の問題を順番に解いてください
import java.util.Arrays;

public class Test {
    
    // 問題1: 変数と基本的な計算
    // 2つの整数を受け取って、その合計を返すメソッドを完成させてください
    public static int addNumbers(int a, int b) {
        // TODO: ここにコードを書いてください
        return 0;
    }
    
    // 問題2: 条件分岐
    // 数値が偶数か奇数かを判定するメソッドを完成させてください
    public static boolean isEven(int num) {
        // TODO: ここにコードを書いてください
        return false;
    }
    
    // 問題3: ループ
    // 1からnまでの合計を計算するメソッドを完成させてください
    public static int sumToN(int n) {
        // TODO: ここにコードを書いてください
        return 0;
    }
    
    // 問題4: 配列操作
    // 配列の中の最大値を求めるメソッドを完成させてください
    public static int findMax(int[] numbers) {
        // TODO: ここにコードを書いてください
        return 0;
    }
    
    // 問題5: クラスとオブジェクト
    // 学生の情報を表すクラスを定義し、平均点を計算するメソッドを完成させてください
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
            // TODO: ここにコードを書いてください
            return 0.0;
        }
    }
    
    // 問題6: 例外処理
    // 0で割り算をしようとした場合に例外を投げるメソッドを完成させてください
    public static double divide(double a, double b) throws ArithmeticException {
        // TODO: ここにコードを書いてください
        return 0.0;
    }
    
    // 問題7: 文字列操作
    // 文字列を逆順にするメソッドを完成させてください
    public static String reverseString(String str) {
        // TODO: ここにコードを書いてください
        return "";
    }
    
    // 問題8: 配列のソート
    // 配列を昇順にソートするメソッドを完成させてください（Arrays.sort()は使用禁止）
    public static void sortArray(int[] arr) {
        // TODO: ここにコードを書いてください
    }
    
    public static void main(String[] args) {
        System.out.println("=== Java言語練習問題 ===");
        
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
        
        System.out.println("\n=== 練習問題完了 ===");
        System.out.println("すべてのメソッドを完成させて、期待値と一致するようにしてください！");
    }
} 
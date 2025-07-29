// Go言語練習問題
// 以下の問題を順番に解いてください
package main

import (
	"fmt"
	"math"
)

// 問題1: 変数と基本的な計算
// 2つの整数を受け取って、その合計を返す関数を完成させてください
func addNumbers(a, b int) int {
	// TODO: ここにコードを書いてください
	return 0
}

// 問題2: 条件分岐
// 数値が偶数か奇数かを判定する関数を完成させてください
func isEven(num int) bool {
	// TODO: ここにコードを書いてください
	return false
}

// 問題3: ループ
// 1からnまでの合計を計算する関数を完成させてください
func sumToN(n int) int {
	// TODO: ここにコードを書いてください
	return 0
}

// 問題4: スライス操作
// スライスの中の最大値を求める関数を完成させてください
func findMax(numbers []int) int {
	// TODO: ここにコードを書いてください
	return 0
}

// 問題5: 構造体
// 学生の情報を表す構造体を定義し、平均点を計算する関数を完成させてください
type Student struct {
	Name   string
	Scores []int
}

func calculateAverage(student Student) float64 {
	// TODO: ここにコードを書いてください
	return 0.0
}

// 問題6: エラーハンドリング
// 0で割り算をしようとした場合にエラーを返す関数を完成させてください
func divide(a, b float64) (float64, error) {
	// TODO: ここにコードを書いてください
	return 0.0, nil
}

func main() {
	fmt.Println("=== Go言語練習問題 ===")
	
	// 問題1のテスト
	fmt.Println("\n問題1: 変数と基本的な計算")
	result1 := addNumbers(5, 3)
	fmt.Printf("5 + 3 = %d (期待値: 8)\n", result1)
	
	// 問題2のテスト
	fmt.Println("\n問題2: 条件分岐")
	fmt.Printf("10は偶数ですか? %t (期待値: true)\n", isEven(10))
	fmt.Printf("7は偶数ですか? %t (期待値: false)\n", isEven(7))
	
	// 問題3のテスト
	fmt.Println("\n問題3: ループ")
	result3 := sumToN(5)
	fmt.Printf("1から5までの合計: %d (期待値: 15)\n", result3)
	
	// 問題4のテスト
	fmt.Println("\n問題4: スライス操作")
	numbers := []int{3, 7, 2, 9, 1, 5}
	max := findMax(numbers)
	fmt.Printf("スライス %v の最大値: %d (期待値: 9)\n", numbers, max)
	
	// 問題5のテスト
	fmt.Println("\n問題5: 構造体")
	student := Student{
		Name:   "田中太郎",
		Scores: []int{85, 92, 78, 96, 88},
	}
	average := calculateAverage(student)
	fmt.Printf("%sの平均点: %.2f (期待値: 87.80)\n", student.Name, average)
	
	// 問題6のテスト
	fmt.Println("\n問題6: エラーハンドリング")
	result6, err := divide(10, 2)
	if err != nil {
		fmt.Printf("エラー: %v\n", err)
	} else {
		fmt.Printf("10 ÷ 2 = %.1f (期待値: 5.0)\n", result6)
	}
	
	result6Err, err := divide(10, 0)
	if err != nil {
		fmt.Printf("エラー: %v (期待値: 0で割り算できません)\n", err)
	} else {
		fmt.Printf("10 ÷ 0 = %.1f\n", result6Err)
	}
	
	fmt.Println("\n=== 練習問題完了 ===")
	fmt.Println("すべての関数を完成させて、期待値と一致するようにしてください！")
}

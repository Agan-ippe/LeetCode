package com.leetcode._2024.Mar._3rd_week;

/**
 * @author Aip
 * @version 1.0
 * @date 2024/3/15  12:07
 * @description 矩阵置零 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。
 */
public class Eq073 {
    public static void main(String[] args) {

        int[][] matrix = {{0,1,1},{5,4,7},{4,3,0}};

        // 使用标记法，判断当前行列是否出现零，如果是则进行标记,再将标记行列置零
        // 二维数组的行数列数
        int row = matrix.length, col = matrix[0].length;

        int[] rowIsZero = new int[row], colIsZero = new int[col];


        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // 换行，进入下一行
        }

        System.out.println("---------------开始置零---------------");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    rowIsZero[i] = 1;
                    colIsZero[j] = 1;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rowIsZero[i] == 1 || colIsZero[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // 换行，进入下一行
        }
    }
}

package com.leetcode._2024.Mar._2nd_week;

import java.util.Random;

/**
 * @author Aip
 * @version 1.0
 * @date 2024/3/10  18:19
 * @description 旋转二维矩阵
 */
public class Eq048 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        //二维数组的行数
        int rows = matrix.length;
        //列数
        int columns = matrix[0].length;
        int[][] newMatrix = new int[columns][rows];

        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < columns; ++j){
                matrix[i][j] = new Random().nextInt(100);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // 换行，进入下一行
        }

        System.out.println("---------------开始旋转---------------");

        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < columns; ++j){
                newMatrix[j][rows - i - 1] = matrix[i][j];
            }
        }

        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < columns; ++j){
                System.out.print(newMatrix[i][j] + " ");
            }
            System.out.println(); // 换行，进入下一行
        }

    }
}

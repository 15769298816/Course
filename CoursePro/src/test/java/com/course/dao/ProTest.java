/**
 * 
 */
package com.course.dao;

/**
 * 
 * @author  hujuhui
 * @version 2018年6月6日 下午4:07:24
 */
public class ProTest {
		public static void main(String[] args) {
			//1:从小到大排序  2:从大到小排序
			int score[] = {55,77,11,33,44,22,99,66,43,100};
			int type = 2;
			switch (type) {
			case 1:
				for (int i = 0; i < score.length; i++) {//i<9
					for (int j = i; j < score.length; j++) {
						if(score[i]>score[j]){
							int a = score[j];
							score[j] = score[i];
							score[i] = a;
						}
					}
				}
				for (int i = 0; i < score.length; i++) {
					System.out.print(score[i]+"--");
				}
				break;

			case 2:
				for (int i = 0; i < score.length; i++) {
					for (int j = i; j < score.length; j++) {
						if(score[i]<score[j]){
							int a = score[j];
							score[j] = score[i];
							score[i] = a;
						}
					}
				}
				for (int i = 0; i < score.length; i++) {
					System.out.print(score[i]+"--");
				}
				break;
			}
		}

}



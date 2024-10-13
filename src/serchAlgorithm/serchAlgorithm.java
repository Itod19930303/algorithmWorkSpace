package serchAlgorithm;

public class serchAlgorithm {
	/*線上アルゴリズム
	 * 一致している文字列を配列から取り除き、残っている文字列の数を出力する
	 */
	public int lineSerchAlgorithm() {
		int result = 0 ;
		String[] serch = {"A","B","A","B","C"};
		String[] find =serch;
		for (int i = 0; i < serch.length; i++) {
			String findValue =  find[i];
			int findCount = -1 ; 
			for (String serchValue : find) {
				if(serchValue.equals(findValue)&& 1<=findCount) {

				}else {
					findCount ++;
				}
			}
		}
		return result ;
	} 
}

package LCSequence;

public class LCS {

	public static void main(String[] args) {
//		String str1 = "ABCBDAB";
//      String str2 = "BDCABA";
//		String str1 = "AGCTTTGCATGGCTATAA";
//		String str2 = "ATTGCATAA";
		String str1 = "Abc";
		String str2 = "abc";
        System.out.println(str1 + "  "+ str1.length());
        System.out.println(str2 + "  "+ str2.length());
        System.out.println("LCS³¤¶È£º"+LCSequence.LCS(str1.toCharArray(),str2.toCharArray()));
        int[][] map = LCSequence.LCS_Map(str1.toCharArray(),str2.toCharArray());
        for(int i = 0 ;i<map.length;i++) {
        	for(int j = 0;j<map[0].length;j++) {
        		System.out.print(map[i][j] + " ");
        	}
        	System.out.println("");
        }
        StringBuffer sb = new StringBuffer();
        LCSequence.Subsque(str1.toCharArray(), str2.toCharArray(), map, str1.length(), str2.length(), sb);
        System.out.println(sb);
	}

}

package LCSequence;

public class LCSequence {
	//返回最长公共子序列的长度
	public static int LCS(char[] m,char[] n) {
        int[][] ret = new int[m.length+1][n.length+1];
        for(int i=0;i<ret.length;i++) {
            for(int j=0;j<ret[i].length;j++) {
                if(i==0 || j==0) {
                    ret[i][j] = 0;
                }else {
                    if(m[i-1] == n[j-1]) {
                        ret[i][j] = ret[i-1][j-1]+1;
                    }else {
                        ret[i][j] = Math.max(ret[i][j-1], ret[i-1][j]);
                    }
                }
            }
        }
        return ret[m.length][n.length];
    }
	
	//返回最长公共子序列的推导图
	public static int[][] LCS_Map(char[] m,char[] n) {
        int[][] ret = new int[m.length+1][n.length+1];
        for(int i=0;i<ret.length;i++) {
            for(int j=0;j<ret[i].length;j++) {
                if(i==0 || j==0) {
                    ret[i][j] = 0;
                }else {
                    if(m[i-1] == n[j-1]) {
                        ret[i][j] = ret[i-1][j-1]+1;
                    }else {
                        ret[i][j] = Math.max(ret[i][j-1], ret[i-1][j]);
                    }
                }
            }
        }
        return ret;
    }
	
     //输出最长公共子序列	
	 public static void Subsque(char[] m,char[] n,int[][] ret,int p,int q,StringBuffer sb) {
	        StringBuffer sb1 = new StringBuffer();
	        for(int i=p,j=q ; i!=0&&j!=0 ; ) {
	            if(m[i-1] == n[j-1]) {
	                sb.append(m[i-1]);
	                i--;
	                j--;
	            }else {
	                if(ret[i-1][j] == ret[i][j]) {
	                    sb1 = new StringBuffer(sb);
	                    Subsque(m,n,ret,--i,j,sb);
	                    sb=sb1;
	                    i++;
	                }
	                if(ret[i][j-1] == ret[i][j]) {
	                    sb1 = new StringBuffer(sb);
	                    Subsque(m,n,ret,i,--j,sb);
	                    sb=sb1;
	                    j++;
	                }
	                return;
	            }
	        }
	        System.out.println(sb.reverse());
	 }
}

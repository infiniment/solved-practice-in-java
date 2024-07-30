import java.util.Scanner;

public class P27445 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	int m = sc.nextInt();
    	int[] distances = new int[n + m - 1];
    	for(int i = 0; i < n + m - 1; i++) {
    		distances[i] = sc.nextInt();
    	}
    	
    	// 고라니 위치 찾기
    	int deerRow = 0, deerCol = 0;
    	boolean found = false;
    	
    	//가능한 모든 좌표에 대해 거리 체크
    	for(int r = 1; r <= n; r++) {
    		for(int c = 1; c <= m; c++) {
    			boolean valid = true;
    			
    			// 첫 번째 구간에서 거리가 맞는지 체크
    			for(int i = 0; i < n - 1; i++) {
    				int distance = Math.abs(r - (i+1)) + Math.abs(c - 1);
    				if(distance != distances[i]) {
    					valid = false;
    					break;
    				}
    			}
    			
    			if(valid) {
    				for(int j = 0; j < m; j++) {
    					int distance = Math.abs(r - n) + Math.abs(c - (j + 1));
    					if(distance != distances[n - 1 + j]) {
    						valid = false;
    						break;
    					}
    				}
    			}
    			
    			if(valid) {
    				deerRow = r;
    				deerCol = c;
    				found = true;
    				break;
    			}
    		}
    		if(found) break;
    	}
    	System.out.println(deerRow + " " + deerCol);
    	sc.close();
    }
}
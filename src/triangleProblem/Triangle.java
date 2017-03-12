package triangleProblem;

public class Triangle {
	private static boolean result = false;
	public boolean equilateral(int a,int b,int c){
		if(a==b && b==c){//等边三角形
			result = true;
			return result;
		}
		result = false;
		return result;
	}
	public boolean isosceles(int a,int b,int c){
		if(a==b || b==c || a==c){//等腰三角形
			result = true;
			return result;
		}
		result = false;
		return result;
	}
	public boolean scalene(int a,int b,int c){
		if(a!=b && b!=c && c!=a){//不等边三角形
			result = true;
			return result;
		}
		result = false;
		return result;
	}
    public void clear() {     // 将结果清零
        result = false;
    }
	
}

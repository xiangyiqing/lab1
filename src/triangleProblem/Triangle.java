package triangleProblem;

public class Triangle {
	private static boolean result = false;
	public boolean equilateral(int a,int b,int c){
		if(a==b && b==c){//�ȱ�������
			result = true;
			return result;
		}
		result = false;
		return result;
	}
	public boolean isosceles(int a,int b,int c){
		if(a==b || b==c || a==c){//����������
			result = true;
			return result;
		}
		result = false;
		return result;
	}
	public boolean scalene(int a,int b,int c){
		if(a!=b && b!=c && c!=a){//���ȱ�������
			result = true;
			return result;
		}
		result = false;
		return result;
	}
    public void clear() {     // ���������
        result = false;
    }
	
}

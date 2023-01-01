import java.util.*;
class SumElements{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int size,sum=0;
		System.out.println("Enter the size of array:");
		size=sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the elements of array:");
		for(int i=0;i<size;i++){
			int x=sc.nextInt();
			arr[i]=x;
			sum=sum+x;
			
		}
		System.out.println("sum of elements of array:"+sum);
	}
}


			
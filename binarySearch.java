import java.util.*;
public class binarySearch{
	public static int searching(int a[], int key){
		int l=0,h=a.length-1,mid=0;
		while(l<=h)
		{
			mid=(l+h)/2;
			if(key==a[mid]){
				return  mid;
			}
			else if(key<a[mid]){
				h=mid-1;
			}
			else{
			l=mid+1;
			}
		}
		return -1;
	}

	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);

		System.out.println("key: ");
		int key = s.nextInt();

		System.out.println(searching(arr,key));
	
	}
}
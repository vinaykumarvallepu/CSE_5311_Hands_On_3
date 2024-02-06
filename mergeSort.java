
public class mergeSort
{
	public static void main(String[] args) {
		int a[] = {5,2,4,7,1,3,2,6};
		int l=0,h=a.length-1;
		mergeSort(a,l,h);
		for(int x: a){
		    System.out.print(x + " ");
		}
	}
	static void mergeSort(int a[],int l,int h){
	    if(l<h){
	        int m = l +(h-l)/2;
	        mergeSort(a,l,m);
	        mergeSort(a,m+1,h);
	        merge(a,l,m,h);
	    }
	}
	static void merge(int a[],int l,int m,int h){
	    int n1=m-l+1, n2=h-m;
	    int left[] = new int[n1];
	    int right[] = new int[n2];
	    for(int i=0;i<n1;i++){
	        left[i] = a[i+l];
	    }
	    for(int j=0;j<n2;j++){
	        right[j]= a[m+1+j];
	    }
	    int i=0, j=0,k=l;
	    while(i<n1 && j<n2){
	        if(left[i] <= right[j]){
	            a[k++] = left[i++];
	        }
	        else{
	            a[k++] = right[j++];
	        }
	    }
	    while(i<n1){
	        a[k++]=left[i++];
	    }
	    while(j<n2){
	        a[k++]=right[j++];
	    }
	}
}


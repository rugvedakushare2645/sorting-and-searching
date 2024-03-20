#include<stdio.h>

void bubbleSort(int arr[],int n)
{
    int i,j;
    for(i=0;i<n-1;i++)
    {
        for(j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}


int main()
{
    int n,arr[20];
    printf("enter the number of array elements: ");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    bubbleSort(arr,n);
    printf("Sorted array: ");
    for(int i=0;i<n;i++)
    {
        printf("%d\t",arr[i]);
    }
    return 0;
}
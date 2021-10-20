#include<stdio.h>
#include"quick_sort.h"

int main(void)
{
	uint8 arr[] = {3,4,1,8,0,5,14,10,12,20,23,24,2,17,6,18,9,19};
	uint8 len = 18;
	quickSort(arr,0,len-1);
	return 0;
}





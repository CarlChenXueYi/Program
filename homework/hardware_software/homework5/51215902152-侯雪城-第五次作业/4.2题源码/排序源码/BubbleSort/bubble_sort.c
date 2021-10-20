#include"bubble_sort.h"

void bubble_sort(uint8 *arr,uint8 len){
	uint8 temp=0;
	for(uint8 i=0;i<len;i++){
		for(uint8 k=0;k<len-i;k++){
			if(arr[k]>arr[k+1]){
				temp=arr[k];
				arr[k]=arr[k+1];
				arr[k+1]=temp;
			}
		}
	}
}

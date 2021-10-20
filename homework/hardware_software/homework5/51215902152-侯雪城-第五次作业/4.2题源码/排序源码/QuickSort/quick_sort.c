#include"quick_sort.h"

struct node
{
	uint8 low,high;
};

uint8 partition(uint8 *arr,uint8 low,uint8 high)
{
	uint8 base = arr[low];
	while (low<high)
	{
		while (low<high && arr[high]>=base)
		{
			high--;
		}
		arr[low] = arr[high];
		while (low<high && arr[low]<=base)
		{
			low++;
		}
		arr[high] = arr[low];
	}
	arr[low] = base;
	return low;
}

void quickSort(uint8 *arr,uint8 low,uint8 high)
{
	struct node st[500];
	st[0].low=low;
	st[0].high=high;
	int8 top = 0;
	while(true)
	{
		if (top<0) break;
		low = st[top].low;
		high = st[top].high;
		top = top - 1;
		if (low < high)
		{
			uint8 base = partition(arr,low,high);

			if (base > low)
			{
				top++;
				st[top].low = low;
				st[top].high = base - 1;
			}
			if (base < high)
			{
				top++;
				st[top].low = base + 1;
				st[top].high = high;

			}
		}
	}
}

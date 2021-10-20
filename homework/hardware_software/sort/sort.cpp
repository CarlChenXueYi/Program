#include <iostream>
#include <string>
#include <unordered_map>
#include <unordered_set>
#include <vector>
#include <algorithm>
#include <stack> 

using namespace std;

int partition(int *arr,int low,int high);
void quickSort(int *arr,int low,int high);

struct node
{
  int low,high;
}st[10000];

int main()
{
  int arr[] = {5,4,9,11,2};
  int len = sizeof(arr)/sizeof(int);
  quickSort(arr,0,len-1);
  for (int i=0;i<len;i++)
  {
    cout << arr[i] << " ";
  }
  return 0;
}


int partition(int *arr,int low,int high)
{
  int base = arr[low];
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

void quickSort(int *arr,int low,int high)
{
  //stack<node> st;

  st[0] = node{low,high};
  int top = 0;
  while(top>=0)
  {
    low = st[top].low;
    high = st[top].high;
    top--;
    if (low < high)
    {
      int base = partition(arr,low,high);

      if (base > low)
      {
        top++;
        st[top].low = low;
        st[top].high = base - 1;
        //myTop = node{low,base-1};
        //st.push(myTop);
      }
      if (base < high)
      {
        top++;
        st[top].low = base + 1;
        st[top].high = high;
        //myTop = node{base+1,high};
        //st.push(myTop);
      }
    }
  }
}
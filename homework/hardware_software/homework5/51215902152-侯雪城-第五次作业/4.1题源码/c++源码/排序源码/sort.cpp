#include <iostream>
#include <string>
#include <unordered_map>
#include <unordered_set>
#include <vector>
#include <algorithm>
#include <ctime>
#include <chrono>
#include <cstring>
#include <climits>

using namespace std;
using namespace chrono;

void bubbleSort(int *, int);
void selectSort(int *, int);
void insertSort(int *, int);

void quickSort(int *, int, int);
int paritionArr(int *, int, int);
void passQuickSort(int *, int);

void checkTime(void (*pf)(int *, int), int *, int, string);

int main()
{
    int arr[] = {3, 4, 1, 8, 0, 5, 14, 10, 12, 20, 23, 24, 2, 17, 6, 18, 9, 19};
    int len = sizeof(arr) / sizeof(int);

    checkTime(bubbleSort, arr, len, "冒泡排序");
    checkTime(passQuickSort, arr, len, "快速排序");
    checkTime(selectSort, arr, len, "选择排序");
    checkTime(insertSort, arr, len, "插入排序");
    return 0;
}

void bubbleSort(int *arr, int len)
{
    int final = len - 1;
    for (int j = final; j >= 1; j--)
    {
        for (int i = 0; i < j; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                int temp;
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = temp;
            }
        }
    }
}

void passQuickSort(int *arr, int len)
{
    quickSort(arr, 0, len - 1);
}

void quickSort(int *arr, int low, int high)
{
    if (low < high)
    {
        int base = paritionArr(arr, low, high);
        quickSort(arr, low, base - 1);
        quickSort(arr, base + 1, high);
    }
}

int paritionArr(int *arr, int low, int high)
{
    int base = arr[low];
    while (low < high)
    {
        while (low < high && arr[high] >= base)
        {
            high--;
        }
        arr[low] = arr[high];
        while (low < high && arr[low] <= base)
        {
            low++;
        }
        arr[high] = arr[low];
    }
    arr[low] = base;
    return low;
}

void checkTime(void (*pf)(int *, int), int *arr, int len, string name)
{
    int max = 0, min = INT_MAX, average = 0;
    for (int i = 0; i < 10; i++)
    {
        int tempArr[len];
        memcpy(tempArr, arr, len * sizeof(int));
        auto start = high_resolution_clock::now();
        pf(tempArr, len);
        auto end = high_resolution_clock::now();
        auto elapsed_seconds = duration_cast<std::chrono::nanoseconds>(end - start);
        if (max < elapsed_seconds.count())
            max = elapsed_seconds.count();
        if (min > elapsed_seconds.count())
            min = elapsed_seconds.count();
        average += elapsed_seconds.count();
    }

    cout << name << "的最大时间是 " << fixed << max << " 纳秒; " << name << "的最小时间是 " << min << " 纳秒; " << name << " 的平均时间是 " << average / 10 << " 纳秒." << endl;
}

void selectSort(int *arr, int len)
{
    for (int i = 0; i < len - 1; i++)
    {
        int min = i;
        for (int j = i + 1; j < len; j++)
        {
            if (arr[j] < arr[min])
                min = j;
        }
        if (min != i)
        {
            int temp;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}

void insertSort(int *arr, int len)
{
    for (int i = 1; i < len; i++)
    {
        int temp = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > temp)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = temp;
    }
}

#include <iostream>
#include <string>
#include <unordered_map>
#include <unordered_set>
#include <vector>
#include <algorithm>
#include <chrono>

using namespace std;
using namespace chrono;

int main()
{
    int  sum   = 0;
    auto start = high_resolution_clock::now();
    for (int i=1;i<=10000;i++)
    {
        sum += i;
    }
    auto end             = high_resolution_clock::now();
    auto elapsed_seconds = duration_cast<std::chrono::nanoseconds>(end-start);
    cout << "求和的时间是 " << fixed << elapsed_seconds.count() << " 纳秒" << endl;
    return 0;
}

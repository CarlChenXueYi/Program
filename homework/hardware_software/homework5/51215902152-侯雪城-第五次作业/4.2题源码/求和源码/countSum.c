#include"countSum.h"


uint64 countSum(uint64 len)
{
	uint64 sum = 0;
	for (uint64 i=1;i<=len;i++)
	{
		sum += i;
	}
	return sum;
}

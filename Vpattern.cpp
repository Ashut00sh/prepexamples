#include <bits/stdc++.h>
using namespace std;

int main()
{
    //write your code here
    for (int i = 1; i <= 5; i++)
    {
        for (int j = 1; j <= 5; j++)
        {
            if (i >= j)
            {
                cout << j;
            }
            else
            {
                cout << " ";
            }
        }
        for (int j = 5; j > 0; j--)
        {
            if (i >= j)
            {
                cout << j;
            }
            else
            {
                cout << " ";
            }
        }
        cout << endl;
    }
    return 0;
}
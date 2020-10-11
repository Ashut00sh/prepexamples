#include <bits/stdc++.h>
using namespace std;

int main()
{
    //writ your code here
    int a, b, sum = 0;
    cin >> a;
    while (a--)
    {
        cin >> b;
        for (int i = 1; i < b; i++)
        {
            if (b % i == 0)
            {
                sum = sum + i;
            }
        }
        // cout<<"sum"<<sum<<b<<endl;

        if (sum == b)
        {
            cout << "true" << endl;
        }
        else
        {
            cout << "false" << endl;
        }
    }
    return 0;
}
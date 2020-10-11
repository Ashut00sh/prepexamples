#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a;
    cin >> a;
    int rem = 1, d = 0;
    while (a > 0)
    {
        rem = a % 10;
        d = d * 10 + rem;
        a = a / 10;
    }
    cout << d;
    return 0;
}
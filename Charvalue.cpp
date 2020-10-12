#include <bits/stdc++.h>
using namespace std;

int main()
{
    //write your code here
    char a;
    cin >> a;
    if (a == 'p' || a == 'P')
    {
        cout << " PrepBytes" << endl;
    }
    else if (a == 'z' || a == 'Z')
    {
        cout << "Zenith" << endl;
    }
    else if (a == 'e' || a == 'E')
    {
        cout << "Expert Coder" << endl;
    }
    else
    {
        cout << "Data Structure" << endl;
    }

    return 0;
}
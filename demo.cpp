#include <bits/stdc++.h>
using namespace std;
int main()
{
    int a, ct = 0, rem;
    cin >> a;

    while (a--)
    {
        int b;
        cin >> b;
        ct = 0;
        while (b != 0)
        {
            rem = b % 10;
            b = b / 10;
            if (rem == 5)
            {
                ct++;
                //cout << "inside if" << endl;
            }

            //cout << "into second while" << endl;
        }
        cout << ct << endl;
        //cout << "good going" << endl;
    }
}
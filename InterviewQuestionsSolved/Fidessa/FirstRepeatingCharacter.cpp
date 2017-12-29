/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>
#include <string>

using namespace std;

int main()
{
    string str;
    int a[52]={0};
    int n;
    cout<<"Enter a string: ";
    cin>>str;
    for(int i=0;i<str.length(); i++)
    {
        n=str[i];
        if(n>=97 && n<123)
        {
            a[n - 97]++;
        }
        if(n>=65 && n< 91)
        {
            a[n-38]++;
        }
    }
    for(int i=0; i<str.length();i++)
    {
        n=str[i];
        if(n>=97 && n<123)
        {
            if(a[n-97]> 1)
            {
                cout<<str[i];
                return 0;
            }
        }
        if(n>=65 && n<91)
        {
            if(a[n-38]>1)
            {
                cout<<str[i];
                return 0;
            }
        }
        
    }
    return 0;
}
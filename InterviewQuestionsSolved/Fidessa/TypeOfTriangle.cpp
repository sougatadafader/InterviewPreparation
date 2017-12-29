
#include <iostream>

using namespace std;

int main()
{
    int n;
    cout<<"Enter number of inputs: ";
    cin>>n;
    int size=n*3;
    int a[size];
    
    int i=0;
    for(int j=0;j<n;j++)
    {
        cout<<"Enter a, b, c : ";
        cin>>a[i++];
        cin>>a[i++];
        cin>>a[i++];
    }
    
    i =0;
    for(int j=0;j<n;j++)
    {
        if(a[i] + a[i+1]> a[i+2] && a[i+1] + a[i+2] > a[i] && a[i+2] + a[i]> a[i+1])
        {
            
            if(a[i]==a[i+1] && a[i] == a[i+2] )
            {
                cout<<"\nEquilateral Triangle";
            }
            else if(a[i]==a[i+1] || a[i] == a[i+2] || a[i+1]==a[i+2])
            {
                cout<<"\nIsosceles Triangle";
            }
            else
                cout<<"\nNone of these";
            i=i+3;
        }
        else
        {
            cout<<"\nNone of these";
            i+=3;
        }
    }
    return 0;
}
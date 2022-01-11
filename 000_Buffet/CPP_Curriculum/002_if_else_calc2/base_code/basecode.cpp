// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"Please enter the first number ";
	int x;
	cin>>x;
	cout<<"Please enter the operator ";
	char op;
	cin>>op;
	cout<<"Please enter the second number ";
	int y;
	cin>>y;
	char mult;
	mult = '*';
	char div;
	div = '/';
	char sub;
	sub = '-';
	char add;
	add = '+';
	if (op == mult ){
		cout<< x*y;
	}
	else if (op == div){
		cout<<x/y;
		
	}
	else if (op == sub){
		cout<<x-y;
	}
	else if (op == add){
		cout<<x+y;
		
	}
	
	
}

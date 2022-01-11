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
		cout<< x*y<<endl;
	}
	else if (op == div){
		cout<<x/y<<endl;
		
	}
	else if (op == sub){
		cout<<x-y<<endl;
	}
	else if (op == add){
		cout<<x+y<<endl;
		
	}
	
	cout<<"Press q to quit calculation. Press any other key to continue ";
	char a = 'q';
	cin>>a;
	while(a != 'q'){
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
			cout<< x*y<<endl;
		}
		else if (op == div){
			cout<<x/y<<endl;
		
		}
		else if (op == sub){
			cout<<x-y<<endl;
		}
		else if (op == add){
			cout<<x+y<<endl;
		}
		cout<<"Press q to quit calculation. Press any other key to continue ";
		cin>>a;
	
	if(a == 'q'){
		cout<<"the calculation has ended";
	break;
	}
	//end code
}
}



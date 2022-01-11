// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"enter your snowflake ";
	char flake;
	cin>>flake;

	
	
	
	int s;
	for(int s=0; s<10; s=s+1){
		
		gotoxy(40,5+s);
		
		cout<<flake<<endl;
		sleep(1);
		
		gotoxy(40,5+s);
		cout<<" "<<endl;
		
		
	}
	gotoxy(40, 16);
	cout<<flake;
	
		
	
	

}

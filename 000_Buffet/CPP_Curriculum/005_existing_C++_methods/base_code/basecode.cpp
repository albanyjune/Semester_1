// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"Please enter the symbol ";
	char symbol;
	cin>>symbol;
	cout<<"Please enter the length ";
	int x;
	cin>>x;
	cout<<"Enter 'h' for horizontal. Enter 'v' for vertical. Enter 'd' for diagonal ";
	char dir;
	cin>>dir;
	if (dir == 'h')
	{
	int y;
	for(y=0;y<x;y++)
	{
		cout<<symbol;
	}
	}
	else if (dir == 'v'){
		
	int y;
	for(y=0;y<x;y++)
	{
		cout<<symbol<<endl;
	}
	}
	cout<<endl;
	if(dir == 'd'){
			int y;
			for(y=1;y<=x;y=y+1){
				
				gotoxy(y,y+4);
				cout<<symbol<<endl;
			}
		}
		
	

}

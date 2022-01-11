// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here

	cout<<"make it snow!";
	cout<<"what character do you want it snow? ";
	char sym;
	cin>>sym;
	
	for( int snow = 0; snow <10; snow++){
		gotoxy(30,3+snow);
		cout<<sym<<endl;
		
		gotoxy(35, 9+snow);
		cout<<sym<<endl;
		
		gotoxy(20, 10+snow);
		cout<<sym<<endl;
		
		gotoxy(random (70), random(40));
		cout<<sym<<endl;
		
		
		
		for(int z=0; z<9; z++){
			
			gotoxy(30, 3+z);
			cout<<' ';
			gotoxy(35,9+z);
			cout<<' ';
			gotoxy(20, 10+z);
			cout<<' ';
			
			
		}
		sleep(1);
	}
	
	//basically some of the snow is falling. the rest is just...scattered. 
}

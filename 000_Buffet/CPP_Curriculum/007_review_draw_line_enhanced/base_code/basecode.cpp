// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"Please enter line length ";
	int length;
	cin>>length;
	cout<<"Please enter line symbol ";
	char sym;
	cin>>sym;
	cout<<"Please enter line x coordinate ";
	int x;
	cin>>x;
	cout<<"Please enter line y coordinate ";
	int y;
	cin>>y;
	
	gotoxy(x,y+5);
	
	int g;
	for (g=0; g<length; g=g+1){
	
	
	cout<<sym;
	}
	
	
	
	

}

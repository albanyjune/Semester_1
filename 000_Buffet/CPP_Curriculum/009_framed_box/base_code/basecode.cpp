// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"please enter box width ";
	int width;
	cin>>width;
	cout<<"please enter border char ";
	char border;
	cin>>border;
	cout<<"please enter box height ";
	int height;
	cin>>height;
	
	int x;
	for(int x =0; x<width; x=x+1){
		cout<<border;
		
	}
	
	int g;
	for (int g=0; g<height-1; g=g+1){
		
		gotoxy(1, g+6);
		cout<<border<<endl;
		gotoxy(width,g+6);
		cout<<border<<endl;
	
	}
	int h; 
	for(int h=0; h<width; h=h+1){
		cout<<border;
		
}
}

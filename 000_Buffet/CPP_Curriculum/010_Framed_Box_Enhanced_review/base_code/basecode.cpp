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
	cout<<"please enter box x coordinate ";
	int x;
	cin>>x;
	cout<<"please enter box y coordinate ";
	int y;
	cin>>y;
	
	int g;
	for(int g=0;g<width; g=g+1){
		gotoxy(x+g, y+6);
		cout<<border;
	}
	int h;
	for(h=0; h<height-1;h=h+1){
		gotoxy(x, y+6+h);
		cout<<border<<endl;
		gotoxy(width+x-1, y+6+h);
		cout<<border<<endl;
		
		
	}
	int d;
	for(d=0; d<width; d=d+1){
		gotoxy(x+d, y+5+height);
		cout<<border;
		
	}
	
}

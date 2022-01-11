// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	cout<<"Please enter box width ";
	int width;
	cin>>width;
	cout<<"Please enter border char ";
	char border;
	cin>>border;
	cout<<"Please enter box height ";
	int height;
	cin>>height;
	cout<<"Please enter box x coordinate ";
	int x;
	cin>>x;
	cout<<"Please enter box y coordinate ";
	int y;
	cin>>y;
	
	
	int g;
	for (int g=0; g<height; g=g+1){
		gotoxy(x, y+5+g);
		int h;
		for (int h=0; h<width; h=h+1){
			cout<<border;
		
		}
		cout<<endl;
	}
	
}

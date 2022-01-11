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
	
	
	int y;
	for (int y=0; y<height;y=y+1){
		
		
		int g;
		for (int g=0; g<width; g=g+1){
		cout<<border;
		}
		cout<<endl;
	}
	
	
	
	

}

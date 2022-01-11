// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int x;
	x = 5;
	while(x <= 25){
		cout<<x<<endl;
		
		x = x + 1;
	}
	cout<<endl;
	for (int i = 5; i <= 25; i = i + 1){
		cout<<i<<endl;
	}
	cout<<endl;
	int y;
	y=15;
	while(true){
		cout<<y<<endl;
		if(y==5){
			break;
		}
		y = y -1;
	}
	cout<<endl;
	
	for(int g = 15; g >= 5; g = g-1 ){
		cout<<g<<endl;
	}

}


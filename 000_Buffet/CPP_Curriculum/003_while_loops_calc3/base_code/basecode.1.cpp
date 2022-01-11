// base code file
#include "./hfiles/poole.h"

///////////////////////////////////////////////////////////////////////

main(){
	srand(time(NULL));
	// write code here
	int x = 0;
	char y = 'x';
	while(true){
		cout<<"You've been gnomed! ";
		
		cin>>y;
		if (y == 'q'){
			cout<<"HELP";
		
			break;
		}
		if (x == 100){
			break;
		}
		x = x + 1;
	}
}




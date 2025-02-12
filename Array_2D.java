class  Array_2D
{
	public static void main(String[] args) 
	{
int a[][]={{9,4,7},{6,1,3},{11,3,-1}};
for(int i=0;i<a.length-1;i++)
		{
	if(i%2==0)
			{
		for(int j=0;j<=a[i].length-1;j++)
				{
			for(int k=0;k<a[i].length-1;k++)
					{
			  if(a[i][k]>a[i][k+1])
			 		{
			    int c=a[i][k];
				  a[i][k]=a[i][k+1];
				  a[i][k+1]=c;
                }
            }
		}
	}
}


//**********************************************************************************************

			for (int z=0;z<=(a.length)-1;z++)
			{
				for (int y=0;y<=(a[z].length)-1;y++)
				{
System.out.print(a[z][y]+",");
				}
				System.out.print(" ");
			}
	}
}








	
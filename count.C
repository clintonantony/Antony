void main()
{
 int N,s,count=0;
 scanf("%d",&N);
 if(N>0)
 {
  while(N!=0)
  {
   s+=(N%10);
   count+=1;
   N=N/10;
   }
   printf("count of N is %d",count);
 }
} 

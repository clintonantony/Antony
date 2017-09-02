void main()
{
 int N,s;
 scanf("%d",&N);
 while(N!=0)
 {
  s+=(N%10);
  N=N/10;
  }
  printf("sum of N is %d",s);
}

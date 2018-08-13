package com.cprograms.mprojectnextstudio.cprograms;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Detail extends AppCompatActivity {
    int item_id;
    int group_id;
    String title;
    TextView tv;
    WebView webview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setElevation(4);

        title = getIntent().getExtras().getString("title_KEY");
        getSupportActionBar().setTitle(title);


        webview=(WebView)findViewById(R.id.webView);
        webview.setInitialScale(135);
        webview.getSettings().setBuiltInZoomControls(true);
        //ftech data from assets folder
        webview.loadUrl("file:///android_asset/" + title + ".html");


        tv = (TextView) findViewById(R.id.text_detail);
        tv.setMovementMethod(new ScrollingMovementMethod());
        group_id = getIntent().getExtras().getInt("group_Key");
        item_id = getIntent().getExtras().getInt("child_key");
        tv.setText("Detail" + item_id);

        if(group_id==0){

            if (item_id==0){
                tv.setText("#include<stdio.h>\n" +
                        "\n" +
                        "int  main()\n" +
                        "{\n" +
                        "  printf(\"Hello world\\n\");\n" +
                        "   \n" +
                        "  return 0;\n" +
                        "   \n" +
                        "}\n");
            }

            else if (item_id==1){tv.setText("#include<stdio.h>\t\n" +
                    "void main()\n" +
                    "{\n" +
                    "int a,b,s;\n" +
                    "printf(\"Enter two no's: \");\n" +
                    "scanf(\"%d%d\",&a,&b);\n" +
                    "s=a+b;\n" +
                    "printf(\"sum=%d\",s);\n" +
                    "}\n");
            }
            else if (item_id==2){tv.setText("#include<stdio.h>\n" +
                    "int main(){\n" +
                    "    int num,r,reverse=0;\n" +
                    "    printf(\"Enter any number: \");\n" +
                    "    scanf(\"%d\",&num);\n" +
                    "    while(num){\n" +
                    "         r=num%10;\n" +
                    "         reverse=reverse*10+r;\n" +
                    "         num=num/10;\n" +
                    "    }\n" +
                    "    printf(\"Reversed number is: %d\",reverse);\n" +
                    "    return 0;\n" +
                    "}\n");






            }

            else if (item_id==3){tv.setText("#include<stdio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "void swap(int,int);\n" +
                    "int a,b,r;\n" +
                    "printf(\"enter value for a&b: \");\n" +
                    "scanf(\"%d%d\",&a,&b);\n" +
                    "swap(a,b);\n" +
                    "}\n" +
                    "void swap(int a,int b)\n" +
                    "{\n" +
                    "int temp;\n" +
                    "temp=a;\n" +
                    "a=b;\n" +
                    "b=temp;\n" +
                    "printf(\"after swapping the value for a & b is : %d %d\",a,b);\n" +
                    "}\n");}
            else if (item_id==4){tv.setText("#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void check (int);\n" +
                    "void main()\n" +
                    "{\n" +
                    " int a;\n" +
                    "  printf(\"enter any integer\");\n" +
                    "   scanf(\"%d\",&a);\n" +
                    "\tcheck(a);\n" +
                    "}\n" +
                    "void check(int a)\n" +
                    "{\n" +
                    "if(a%2==0)\n" +
                    "\tprintf(\"%d is even\",a);\n" +
                    "else\n" +
                    "\tprintf(\"%d is odd\",a);     \n" +
                    "} \n");}
            else if (item_id==5){tv.setText("#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "int r;\n" +
                    "float pi=3.14,area,cu;\n" +
                    "printf(\"enter radius of circle:\");\n" +
                    "scanf(\"%d\",&r);\n" +
                    "area=pi*r*r;\n" +
                    "printf(\"area of circle=%f\",area);\n" +
                    "cu=2*pi*r;\n" +
                    "printf(\"\\ncircumference=%f\",cu);\n" +
                    "}\n");}
            else if (item_id==6){tv.setText("#include<stdio.h>\n" +
                    "void main()\n" +
                    " {\n" +
                    "   int x=10,y=8,z=7;\n" +
                    "  float s=0.0;\n" +
                    "  double area=0;\n" +
                    "  s=(x+y+z)/2.0;\n" +
                    "  area=(s*(s-x)*(s-y)*(s-z));\n" +
                    "  printf(\"\\nArea of triangle = %lf\",area);\n" +
                    "}\n" +
                    "\n");}
            else if (item_id==7){tv.setText("#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "void table();\n" +
                    "table();\n" +
                    "getch();\n" +
                    "} \n" +
                    "void table()\n" +
                    "{\n" +
                    "int n,i,r;\n" +
                    "printf(\"enter a no for which to generate table: \");\n" +
                    "scanf(\"%d\",&n);\n" +
                    "for(i=1;i<=10;i++)\n" +
                    "{\n" +
                    "r=n*i;\n" +
                    "printf(\"%d*%d=%d\\n\",n,i,r);\n" +
                    "}\n" +
                    "}\n");}

            else if (item_id==8){tv.setText("#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "int a,b,n,s,m,su,d;\n" +
                    "printf(\"enter two no. : \");\n" +
                    "scanf(\"%d%d\",&a,&b);\n" +
                    "printf(\"enter 1 for sum, 2 for multiply, 3 for subtraction 4 for division:\");\n" +
                    "scanf(\"%d\",&n);\n" +
                    "switch(n)\n" +
                    "{\n" +
                    "case 1:\n" +
                    "s=a+b;\n" +
                    "printf(\"sum=%d\",s);\n" +
                    "break;\n" +
                    "case 2:\n" +
                    "m=a*b;\n" +
                    "printf(\"multiply=%d\",m);\n" +
                    "break;\n" +
                    "case 3:\n" +
                    "su=a-b;\n" +
                    "printf(\"subtraction=%d\",su);\n" +
                    "break;\n" +
                    "case 4:\n" +
                    "d=a/b;\n" +
                    "printf(\"divission=%d\",d);\n" +
                    "break; \n" +
                    "default:\n" +
                    "printf(\"wrong input\");\n" +
                    "break;\n" +
                    "}\n" +
                    "}\n");}






        }//end of group 0 basic


        //Start of group 1 number

        else if (group_id==1){

            if (item_id==0){tv.setText("#include<stdio.h>\n" +
                    "void main(){\n" +
                    "int num,r,sum=0,temp;\n" +
                    "printf(\"Enter a number: \");\n" +
                    "scanf(\"%d\",&num);\n" +
                    "for(temp=num;num!=0;num=num/10){\n" +
                    "    r=num%10;\n" +
                    "    sum=sum+(r*r*r);\n" +
                    "    }\n" +
                    "if(sum==temp)\n" +
                    "     printf(\"%d is an Armstrong number\",temp);\n" +
                    "else\n" +
                    "    printf(\"%d is not an Armstrong number\",temp);\n" +
                    "}\n");}

            else if (item_id==1){tv.setText("#include<stdio.h>\n" +
                    "int fact(int);\n" +
                    "int main(){\n" +
                    "int i,factorial,num;\n" +
                    "  printf(\"Enter a number: \");\n" +
                    "  scanf(\"%d\",&num);\n" +
                    "  factorial = fact(num);\n" +
                    "  printf(\"Factorial of %d is: %d\",num,factorial);\n" +
                    "return 0;\n" +
                    "}\n" +
                    "int fact(int num){\n" +
                    "  int i,f=1;\n" +
                    "  for(i=1;i<=num;i++)\n" +
                    "  f=f*i;\n" +
                    "    return f;\n" +
                    "}\n");}
            else if (item_id==2){tv.setText("#include<stdio.h>\n" +
                    "int main(){\n" +
                    " int k=2,r;\n" +
                    "long int i=0l,j=1,f;\n" +
                    "printf(\"Enter the range:\");\n" +
                    "scanf(\"%d\",&r);\n" +
                    "printf(\"Fibonacci series is: %ld %ld\",i,j);\n" +
                    "while(k<r){\n" +
                    "f=i+j;\n" +
                    " i=j;\n" +
                    " j=f;\n" +
                    "  printf(\" %ld\",j);\n" +
                    "          k++;  }\n" +
                    "return 0;\n" +
                    "}\n");}
            else if (item_id==3){tv.setText("\n" +
                    "#include<stdio.h>\n" +
                    "int main(){\n" +
                    "int num,i,count=0;\n" +
                    "   printf(\"Enter a number: \");\n" +
                    "   scanf(\"%d\",&num);\n" +
                    "  for(i=2;i<=num/2;i++){\n" +
                    "    if(num%i==0){\n" +
                    "      count++;\n" +
                    "      break;\n" +
                    "        }\n" +
                    "    }\n" +
                    "if(count==0 && num!= 1)\n" +
                    "   printf(\"%d is a prime number\",num);\n" +
                    "else\n" +
                    "   printf(\"%d is not a prime number\",num);\n" +
                    "return 0;\n" +
                    "}\n");}
            else if (item_id==4){tv.setText("#include<stdio.h>\n" +
                    "void main(){\n" +
                    "int num,i,count;\n" +
                    "for(num = 1;num<=50;num++){\n" +
                    "  count = 0;\n" +
                    "  for(i=2;i<=num/2;i++){\n" +
                    "  if(num%i==0){\n" +
                    "  count++;\n" +
                    "  break; }\n" +
                    "    }\n" +
                    "  if(count==0 && num!= 1)\n" +
                    "    printf(\"%d \",num); }\n" +
                    "   ");}
            else if (item_id==5){tv.setText("\n" +
                    "#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "int a,b,t1,t2,lcm,gcd;\n" +
                    "printf(\"Enter two number: \");\n" +
                    "scanf(\"%d%d\",&a,&b);\n" +
                    "t1=a;\n" +
                    "t2=b;\n" +
                    "while(t1!=t2)\n" +
                    "{\n" +
                    "if(t1>t2)\n" +
                    "{\n" +
                    "t1=t1-t2;\n" +
                    "}\n" +
                    "else\n" +
                    "{\n" +
                    "t2=t2-t1;\n" +
                    "}\n" +
                    "}\n" +
                    "gcd=t1;\n" +
                    "lcm=(a*b)/gcd;\n" +
                    "printf(\"LCM = %d , GCD= %d\",lcm,gcd);\n" +
                    "return 0;\n" +
                    "}\n");}
            else if (item_id==6){tv.setText("#include<stdio.h>\n" +
                    "void main(){\n" +
                    "int num,r,sum=0,temp;\n" +
                    "printf(\"Enter a number: \");\n" +
                    "scanf(\"%d\",&num);\n" +
                    "temp=num;\n" +
                    "while(num){\n" +
                    "r=num%10;\n" +
                    "num=num/10;\n" +
                    "sum=sum*10+r;\n" +
                    "    }\n" +
                    "if(temp==sum)\n" +
                    "    printf(\"%d is a palindrome\",temp);\n" +
                    "else\n" +
                    "    printf(\"%d is not a palindrome\",temp);\n" +
                    "    \n" +
                    "}");}
            else if (item_id==7){tv.setText("#include<stdio.h>\n" +
                    "void main(){\n" +
                    "int n,i=1,sum=0;\n" +
                    "printf(\"Enter a number: \");\n" +
                    "scanf(\"%d\",&n);\n" +
                    "while(i<n){\n" +
                    "   if(n%i==0)\n" +
                    "   sum=sum+i;\n" +
                    "    i++;}\n" +
                    " if(sum==n)\n" +
                    "    printf(\"%d is a perfect number\",i);\n" +
                    "  else\n" +
                    "    printf(\"%d is not a perfect number\",i);\n" +
                    "  }\n");}
            else if (item_id==8){tv.setText("#include<stdio.h>\n" +
                    "void  main(){\n" +
                    "int num,i,f,r,sum=0,temp;\n" +
                    "printf(\"Enter a number: \");\n" +
                    "scanf(\"%d\",&num);\n" +
                    "temp=num;\n" +
                    "while(num){\n" +
                    "  i=1,f=1;\n" +
                    "  r=num%10;\n" +
                    "while(i<=r){\n" +
                    "f=f*i;\n" +
                    "i++;}\n" +
                    "sum=sum+f;\n" +
                    "num=num/10;  }\n" +
                    "if(sum==temp)\n" +
                    "   printf(\"%d is a strong number\",temp);\n" +
                    "else\n" +
                    "    printf(\"%d is not a strong number\",temp);\n" +
                    "}\n");}

            else if (item_id==9){tv.setText("#include<stdio.h>\n" +
                    "void main(){\n" +
                    "  int pow,num,i=1;\n" +
                    "  long int sum=1;\n" +
                    "  printf(\"\\nEnter a number: \");\n" +
                    "  scanf(\"%d\",&num);\n" +
                    "  printf(\"\\nEnter power: \");\n" +
                    "  scanf(\"%d\",&pow);\n" +
                    "  while(i<=pow){\n" +
                    "            sum=sum*num;\n" +
                    "            i++;\n" +
                    "  }\n" +
                    "  printf(\"\\n%d power %d is: %ld\",num,pow,sum);\n" +
                    "}\n");}

            else if(item_id==10){tv.setText("#include<stdio.h>\n" +
                    "void LeapYear(int);\n" +
                    "void main()\n" +
                    "{\n" +
                    "int year;\n" +
                    "printf(\"\\n Enter the year : \");\n" +
                    "scanf(\"%d\",&year);\n" +
                    "LeapYear(year);\n" +
                    "}\n" +
                    "void LeapYear(int yr)\n" +
                    "{\n" +
                    "int rem1,rem2;\n" +
                    "rem1 = yr%4 ;\n" +
                    "rem2 = yr%100;\n" +
                    "if((rem1 == 0) && (rem2!=0) || yr%400 == 0)\n" +
                    "{\n" +
                    "    printf(\"\\n The given year %d is Leap Year \",yr);\n" +
                    "}\n" +
                    "    else\n" +
                    "{\n" +
                    "    printf(\"\\n The given year %d is Not Leap Year \",yr);\n" +
                    "}\n" +
                    "    \n" +
                    "}\n");}
        }//end of group 1 number

        //start group 2 Conversions

        else if (group_id==2){

            if (item_id==0){tv.setText("#include<stdio.h>\n" +
                    "void main(){\n" +
                    "long int bn,dn=0,j=1,remainder;\n" +
                    "printf(\"Enter any binary number: \");\n" +
                    "    scanf(\"%ld\",&bn);\n" +
                    "while(bn!=0){\n" +
                    "    remainder=bn%10;\n" +
                    "    dn=dn+remainder*j;\n" +
                    "j=j*2;\n" +
                    "bn=bn/10;\n" +
                    "}\n" +
                    "printf(\"Equivalent decimal value: %ld\",dn); \n" +
                    "}\n");}

            else if (item_id==1){tv.setText("#include<stdio.h>\n" +
                    "void main(){\n" +
                    "  long int dn,remainder,q;\n" +
                    "  int i=1,j,temp;\n" +
                    "  char hn[100];\n" +
                    "  printf(\"Enter any decimal number: \");\n" +
                    "  scanf(\"%ld\",&dn);\n" +
                    "  q= dn;\n" +
                    "  while(q!=0){\n" +
                    "     temp = q % 16;\n" +
                    "    if( temp < 10)\n" +
                    "      temp =temp + 48;\n" +
                    "    else\n" +
                    "      temp = temp + 55;\n" +
                    "      hn [i++]= temp;\n" +
                    "      q = q/ 16;\n" +
                    "  }\n" +
                    "    printf(\"Equivalent hexadecimal value of decimal number %d: \",dn); \n" +
                    "  for(j = i -1 ;j> 0;j--) \n" +
                    "    printf(\"%c\",hn[j]);\n" +
                    "}\n" +
                    "\n");}

            else if (item_id==2){tv.setText("#include<stdio.h>\n" +
                    "void  main(){\n" +
                    "  long int dn,remainder,q;\n" +
                    "  int on[100],i=1,j;\n" +
                    "  printf(\"Enter any decimal number:\");\n" +
                    "  scanf(\"%ld\",&dn);\n" +
                    "  q = dn;\n" +
                    "  while(q!=0){\n" +
                    "      on[i++]= q % 8;\n" +
                    "      q = q/ 8;\n" +
                    "  }\n" +
                    "  printf(\"Equivalent octal value  %d: \",dn);\n" +
                    "  for(j = i -1 ;j> 0;j--)\n" +
                    "      printf(\"%d\",on[j]);\n" +
                    "}\n");}

            else if (item_id==3){tv.setText("#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    " float km;\n" +
                    " int v;\n" +
                    " float ans;\n" +
                    "\n" +
                    " printf(\"Enter distance in K.M. : \");\n" +
                    " scanf(\"%f\",&km);\n" +
                    " printf(\"1 for meter 2 for centimeter 3 for mm : \");\n" +
                    " fflush(stdin);\n" +
                    " scanf(\"%d\",&v);\n" +
                    " if(v==1)\n" +
                    "  ans=km*1000;\n" +
                    " if(v==2)\n" +
                    "  ans=km*100000;\n" +
                    " if(v==3)\n" +
                    "  ans=km*1000000;\n" +
                    " printf(\" : %.2f\",ans);\n" +
                    " return 0;\n" +
                    "}\n" +
                    "\n");}

            else if (item_id==4){tv.setText("#include<stdio.h>\n" +
                    "int main()\n" +
                    "{ \n" +
                    "float c,f;\n" +
                    "printf(\"Enter Temprature in centigrade:\");\n" +
                    "scanf(\"%f\",&c);\n" +
                    "f=(1.8*c)+32;\n" +
                    "printf(\"Temprature in fahrenheit=%f\",f);\n" +
                    "}\n");}

            else if (item_id==5){tv.setText("#include<stdio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "  int ts,h,m,s;\n" +
                    "  printf(\" Enter total sec: \");\n" +
                    "  scanf(\"%d\",&ts); \n" +
                    "  h=ts/3600;\n" +
                    "  ts=ts%3600;\n" +
                    "  m=ts/60;\n" +
                    "  s=ts%60; \n" +
                    "   printf(\"%d hour, %d minutes and %d seconds\",h,m,s);\n" +
                    "}\n");}

        }//end of group 2 Conversions

        //start group 3 pattern

        else if (group_id==3){
            if (item_id==0){tv.setText("#include<stdio.h>\n" +
                    "void  main()\n" +
                    " {\n" +
                    "  int num,r,c,sp;\n" +
                    "  printf(\"Enter number of rows : \");\n" +
                    "  scanf(\"%d\",&num);\n" +
                    "  for(r=1; r<=num; r++)\n" +
                    "  {\n" +
                    "    for(sp=num-r; sp>=1; sp--)\n" +
                    "        printf(\" \");\n" +
                    "    for(c=1; c<=r; c++)\n" +
                    "        printf(\"%d\",c);\n" +
                    "    for(c=r-1; c>=1; c--)\n" +
                    "        printf(\"%d\",c);\n" +
                    "    printf(\"\\n\");\n" +
                    "  }\n" +
                    "  for(r=1; r<=num; r++)\n" +
                    "  {\n" +
                    "    for(sp=r; sp>=1; sp--)\n" +
                    "        printf(\" \");\n" +
                    "    for(c=1; c<=(num-r); c++)\n" +
                    "        printf(\"%d\",c);\n" +
                    "    for(c=num-r-1; c>=1; c--)\n" +
                    "        printf(\"%d\",c);\n" +
                    "    printf(\"\\n\");\n" +
                    "  }\n" +
                    " }\n");}

            else if (item_id==1){tv.setText("\n" +
                    "#include<stdio.h>\n" +
                    "void main(){\n" +
                    "int i,j,r,k=1;\n" +
                    "printf(\"Enter the range: \");\n" +
                    "scanf(\"%d\",&r);\n" +
                    "printf(\"floyd's triangle pattern:\\n\\n\");\n" +
                    "  for(i=1;i<=r;i++){\n" +
                    "  for(j=1;j<=i;j++,k++)\n" +
                    "  printf(\" %d\",k);\n" +
                    "  printf(\"\\n\");\n" +
                    "   }\n" +
                    " }\n");}

            else if (item_id==2){tv.setText("#include <stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    " int i, j;\n" +
                    " for(i=1;i<=5;i++)\n" +
                    " {\n" +
                    "   for(j=0;j<i;j++)\n" +
                    "   {\n" +
                    "     printf(\"%c\",'A' + j);\n" +
                    "   }\n" +
                    "     printf(\"\\n\");\n" +
                    " }\n" +
                    "   return 0;\n" +
                    "}\n");}

            else if (item_id==3){tv.setText("#include <stdio.h>\n" +
                    "int main()\n" +
                    " {\n" +
                    "    int i, j;\n" +
                    "    for(i=0;i<=4;i++)\n" +
                    "  {\n" +
                    "    for(j=0;j<=i;j++)\n" +
                    "    {\n" +
                    "    printf(\"%c\",'A' + i);\n" +
                    "  }\n" +
                    "    printf(\"\\n\");\n" +
                    "    }\n" +
                    "return 0;\n" +
                    " } \n");}

            else if (item_id==4){tv.setText("#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "int i,j,n;\n" +
                    "printf(\"Enter value of n: \");\n" +
                    "scanf(\"%d\",&n);\n" +
                    "for(i=1;i<=n;i++)\n" +
                    "{\n" +
                    "for(j=i;j<=n;j++){\n" +
                    "  printf(\" \");\n" +
                    "}\n" +
                    "for(j=1;j<=i;j++)\n" +
                    "{\n" +
                    "  printf(\"* \");\n" +
                    "}\n" +
                    "  printf(\"\\n\");\n" +
                    "}\n" +
                    "return 0;\n" +
                    "}\n");}

            else if (item_id==5){tv.setText("#include<stdio.h>\n" +
                    "\n" +
                    "void main()\n" +
                    " {\n" +
                    "\n" +
                    "int i, j, k;\n" +
                    "\n" +
                    "for(i=1;i<=5;i++)\n" +
                    "{\n" +
                    " for(j=1;j<=6-i;j++)\n" +
                    "{\n" +
                    "printf(\"*\");\n" +
                    "}\n" +
                    "for(k=1;k<i;k++)\n" +
                    "{\n" +
                    "printf(\"  \");\n" +
                    "}\n" +
                    " for(j=1;j<=6-i;j++)\n" +
                    "{\n" +
                    " printf(\"*\");\n" +
                    "}\n" +
                    "printf(\"\\n\");\n" +
                    "}\n" +
                    "for(i=2;i<=5;i++)\n" +
                    "{\n" +
                    "for(j=1;j<=i;j++)\n" +
                    "{\n" +
                    "printf(\"*\");\n" +
                    "}\n" +
                    "for(k=1;k<=5-i;k++)\n" +
                    "{\n" +
                    " printf(\"  \");\n" +
                    "}\n" +
                    "for(j=1;j<=i;j++)\n" +
                    "{\n" +
                    "printf(\"*\");\n" +
                    "}\n" +
                    "printf(\"\\n\");\n" +
                    " }\n" +
                    " }\n");}

        }//end group 3 pattern

        //start group 4 Strings

        else if (group_id==4){

            if (item_id==0){tv.setText("#include <stdio.h>\n" +
                    "#include <stdlib.h>\n" +
                    "#include <string.h>\n" +
                    "\n" +
                    "int main()\n" +
                    "{\n" +
                    "   char str1[100],str2[100];\n" +
                    "\n" +
                    "   printf(\"enter first string: \");\n" +
                    "   gets(str1);\n" +
                    "\n" +
                    "   printf(\"enter second string: \");\n" +
                    "   gets(str2);\n" +
                    "\n" +
                    "   printf(\"Result: \");\n" +
                    "   strcat(str1,str2);\n" +
                    "   \n" +
                    "   puts(str1);\n" +
                    "   \n" +
                    "   \n" +
                    "   return 0;\n" +
                    "}\n");}

            else if (item_id==1){tv.setText("#include<stdio.h>\n" +
                    "#include<string.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "  char str[100];\n" +
                    "  int len;\n" +
                    "  printf(\"\\nEnter the String : \");\n" +
                    "  gets(str);\n" +
                    "  len = strlen(str);\n" +
                    "  printf(\"\\nLength of Given String : %d\",len);\n" +
                    "}\n");}

            else if (item_id==2){tv.setText("#include<stdio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    " char str[100];\n" +
                    " int len;\n" +
                    "\n" +
                    " printf(\"\\nEnter String : \");\n" +
                    " gets(str);\n" +
                    " len = 0;\n" +
                    " while(str[len]!='\\0')\n" +
                    "      len++;\n" +
                    " printf(\"\\nLength of the String is : %d\",len);\n" +
                    "}\n");}

            else if (item_id==3){tv.setText("#include<stdio.h>\n" +
                    "\n" +
                    "int main(){ \n" +
                    "\n" +
                    "  char c; \n" +
                    "\n" +
                    "  printf(\"Enter any character: \");\n" +
                    "  scanf(\"%c\",&c); \n" +
                    "\n" +
                    "  printf(\"ASCII value of given character: %d\",c);\n" +
                    "  \n" +
                    "  return 0;\n" +
                    "}\n");}

            else if (item_id==4){tv.setText("#include<stdio.h>\n" +
                    "void check(char);\n" +
                    "void main()\n" +
                    "{\n" +
                    "char ch;\n" +
                    "printf(\"enter any character:\");\n" +
                    "scanf(\"%c\",&ch);\n" +
                    "   check(ch);\t\n" +
                    "}\n" +
                    "void check(char c)\n" +
                    "{\n" +
                    "if(c>=65&&c<=90)\n" +
                    "  printf(\"upper case\");\n" +
                    "else if\n" +
                    "(c>=97&&c<=122)\n" +
                    "  printf(\"lower case\");\n" +
                    "\t\n" +
                    "}\n");}

            else if (item_id==5){tv.setText("#include<stdio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    " char str[100];\n" +
                    " int i;\n" +
                    "\n" +
                    " printf(\"\\nEnter String : \");\n" +
                    " gets(str);\n" +
                    " for(i=0;i<str[i]!='\\0';i++)\n" +
                    " {\n" +
                    " if(str[i]>=97&&str[i]<=122)\n" +
                    " str[i]=str[i]-32;\n" +
                    " }\n" +
                    " printf(\"%s\",str);\n" +
                    "}\n");}

        }//end group 4 strings

        //start group 5 Arrays

        else if (group_id==5){

            if (item_id==0){tv.setText("#include<stdio.h>\t\n" +
                    "#define MAX 100\n" +
                    "void main()\n" +
                    "{\n" +
                    "int arr[MAX],n,i;\n" +
                    "printf(\"Enter size of Array: \"); \n" +
                    "scanf(\"%d\",&n);\n" +
                    "printf(\"Enter %d positive elements\\n\",n);\n" +
                    "for(i=0;i<n;i++)\n" +
                    "{\n" +
                    "     scanf(\"%d\",&arr[i]);\n" +
                    "     }\n" +
                    "printf(\"Even numbers: \");\n" +
                    "     \n" +
                    " for(i=0;i<n;i++)\n" +
                    "     {\n" +
                    "     if(arr[i]%2==0)\n" +
                    "     {\n" +
                    "     \t\tprintf(\"%d  \",arr[i]);\n" +
                    "     }\n" +
                    "     }\n" +
                    "printf(\"\\nOdd numbers: \");\n" +
                    "for(i=0;i<n;i++)\n" +
                    "     {\n" +
                    "     if(arr[i]%2!=0)\n" +
                    "     {\n" +
                    "     \tprintf(\"%d  \",arr[i]);\n" +
                    "     }\n" +
                    "     }\n" +
                    "}\n");}

            else if (item_id==1){tv.setText("#include<stdio.h>\n" +
                    "void main()\n" +
                    "{\n" +
                    "int a[5],max,i;\n" +
                    "printf(\"enter element for the array: \");\n" +
                    "for(i=0;i<5;i++)\n" +
                    "scanf(\"%d\",&a[i]);\n" +
                    "max=a[0];\n" +
                    "for(i=1;i<5;i++)\n" +
                    "{\n" +
                    "if(max<a[i])\n" +
                    "max=a[i]; \n" +
                    "}\n" +
                    "printf(\"maximum no= %d\",max);\n" +
                    "}\n");}

            else if (item_id==2){tv.setText("#include<stdio.h>\n" +
                    "#define MAX 100\n" +
                    "void main()\n" +
                    "{\n" +
                    "int arr[MAX],n,i,temp;\n" +
                    "printf(\"Enter size of Array: \"); \n" +
                    "scanf(\"%d\",&n);\n" +
                    "printf(\"Enter %d elements\\n\",n);\n" +
                    " for(i=0;i<n;i++)\n" +
                    "     {\n" +
                    "scanf(\"%d\",&arr[i]);\n" +
                    "     }\n" +
                    "for(i=0;i<n/2;i++)\n" +
                    "     {\n" +
                    "temp=arr[i];\n" +
                    "arr[i]=arr[n-i-1];\n" +
                    "arr[n-i-1]=temp;\n" +
                    "     }\n" +
                    "printf(\"Array after reversing : \");\n" +
                    "for(i=0;i<n;i++)\n" +
                    "{\n" +
                    " printf(\"%d\\t\\n\",arr[i]);;\n" +
                    "}\n" +
                    "}\n");}

            else if (item_id==3){tv.setText("#include<stdio.h>\n" +
                    "void main(){\n" +
                    "  int a[5],b[5],c[5],i;\n" +
                    "  printf(\"Enter First array->\");\n" +
                    "  for(i=0;i<5;i++)\n" +
                    "  scanf(\"%d\",&a[i]);\n" +
                    "  printf(\"\\nEnter Second array->\");\n" +
                    "  for(i=0;i<5;i++)\n" +
                    "    scanf(\"%d\",&b[i]);\n" +
                    "  printf(\"Arrays before swapping\");\n" +
                    "  printf(\"\\nFirst array->\");\n" +
                    "  for(i=0;i<5;i++){\n" +
                    "    printf(\"%d\",a[i]);\n" +
                    "  }\n" +
                    "  printf(\"\\nSecond array->\");\n" +
                    "  for(i=0;i<5;i++){\n" +
                    "     printf(\"%d\",b[i]);\n" +
                    "  }\n" +
                    "  for(i=0;i<5;i++){\n" +
                    "    c[i]=a[i];\n" +
                    "    a[i]=b[i];\n" +
                    "    b[i]=c[i];\n" +
                    "  }\n" +
                    "  printf(\"\\nArrays after swapping\");\n" +
                    "  printf(\"\\nFirst array->\");\n" +
                    "  for(i=0;i<5;i++){\n" +
                    "     printf(\"%d\",a[i]);\n" +
                    "  }\n" +
                    "  printf(\"\\nSecond array->\");\n" +
                    "  for(i=0;i<5;i++){\n" +
                    "     printf(\"%d\",b[i]);\n" +
                    "  }\n" +
                    "}\n" +
                    "\n");}

            else if (item_id==4){tv.setText("#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "main()\n" +
                    "{\n" +
                    "int m1[10][10],i,j,k,m2[10][10],mult[10][10],r1,c1,r2,c2; \n" +
                    "printf(\"Enter number of rows and columns of first matrix \\n\");\n" +
                    " scanf(\"%d%d\",&r1,&c1); \n" +
                    "printf(\"Enter number of rows and columns of second matrix \\n\");\n" +
                    "scanf(\"%d%d\",&r2,&c2); \n" +
                    "if(r2==c1) \n" +
                    "{\n" +
                    "printf(\"Enter rows and columns of First matrix \\n\");\n" +
                    "printf(\"Row wise\\n\");\n" +
                    " for(i=0;i<r1;i++)\n" +
                    " for(j=0;j<c1;j++)\n" +
                    " scanf(\"%d\",&m1[i][j]); \n" +
                    " printf(\"First Matrix is :\\n\");\n" +
                    "  for(i=0;i<r1;i++)\n" +
                    "{\n" +
                    "for(j=0;j<c1;j++)\n" +
                    "printf(\"%d\",m1[i][j]); \n" +
                    "printf(\"\\n\");\n" +
                    "}\n" +
                    "  printf(\"Enter rows and columns of Second matrix \\n\");\n" +
                    "  printf(\"Row wise\\n\");\n" +
                    "  for(i=0;i<r2;i++)\n" +
                    "  for(j=0;j<c2;j++)\n" +
                    "scanf(\"%d\",&m2[i][j]); \n" +
                    "  printf(\"Second Matrix is:\\n\");\n" +
                    "for(i=0;i<r2;i++)\n" +
                    "{\n" +
                    "for(j=0;j<c2;j++)\n" +
                    "  printf(\"%d\",m2[i][j]); \n" +
                    "printf(\"\\n\");\n" +
                    " }\n" +
                    "   printf(\"Multiplication of the Matrices:\\n\");\n" +
                    "   for(i=0;i<r1;i++)\n" +
                    "{\n" +
                    "for(j=0;j<c2;j++)\n" +
                    "{\n" +
                    "mult[i][j]=0; \n" +
                    "  for(k=0;k<r1;k++)\n" +
                    "mult[i][j]+=m1[i][k]*m2[k][j]; \n" +
                    "printf(\"%d\",mult[i][j]); \n" +
                    "  }\n" +
                    "  printf(\"\\n\");\n" +
                    "}\n" +
                    "}\n" +
                    "else\n" +
                    "{\n" +
                    " printf(\"Matrix multiplication cannot be done\");\n" +
                    "}\n" +
                    "return 0; \n" +
                    "\n" +
                    "}\n");}

            else if (item_id==5){tv.setText("#include<stdio.h>\n" +
                    "void  main(){\n" +
                    "  int a[3][3],b[3][3],c[3][3],i,j;\n" +
                    "  printf(\"Enter the First matrix: \");\n" +
                    "  for(i=0;i<3;i++)\n" +
                    "    for(j=0;j<3;j++)\n" +
                    "      scanf(\"%d\",&a[i][j]);\n" +
                    "  printf(\"\\nEnter the Second matrix: \");\n" +
                    "  for(i=0;i<3;i++)\n" +
                    "    for(j=0;j<3;j++)\n" +
                    "      scanf(\"%d\",&b[i][j]);\n" +
                    "   for(i=0;i<3;i++)\n" +
                    "    for(j=0;j<3;j++)\n" +
                    "       c[i][j]=a[i][j]-b[i][j];\n" +
                    "   printf(\"\\nThe Subtraction of two matrix is\\n\");\n" +
                    "   for(i=0;i<3;i++){\n" +
                    "    printf(\"\\n\");\n" +
                    "    for(j=0;j<3;j++)\n" +
                    "      printf(\"%d\\t\",c[i][j]);\n" +
                    "   }\n" +
                    "}\n");}

            else if (item_id==6){tv.setText("#include<stdio.h>\n" +
                    "void main(){\n" +
                    "  int a[10][10],i,j,sum=0,m,n;\n" +
                    "  printf(\"\\nEnter the no of rows and columns of matrix: \");\n" +
                    "  scanf(\"%d%d\",&m,&n);\n" +
                    "  printf(\"\\nEnter the elements of matrix: \");\n" +
                    "  for(i=0;i<m;i++)\n" +
                    "      for(j=0;j<n;j++)\n" +
                    "           scanf(\"%d\",&a[i][j]);\n" +
                    "  printf(\"\\nThe matrix is\\n\");\n" +
                    "  for(i=0;i<m;i++){\n" +
                    "      printf(\"\\n\");\n" +
                    "      for(j=0;j<m;j++){\n" +
                    "      printf(\"%d\\t\",a[i][j]);\n" +
                    "      }\n" +
                    " }\n" +
                    " for(i=0;i<m;i++){\n" +
                    "     for(j=0;j<n;j++){\n" +
                    "          if(i==j)\n" +
                    "              sum=sum+a[i][j];\n" +
                    "     }\n" +
                    " }\n" +
                    " printf(\"\\nSum of the diagonal elements of a matrix are: %d\",sum);\n" +
                    "}\n");}
        }//end group 5 Arrays

        //start group 6 Files

        else if (group_id==6){

            if (item_id==0){tv.setText("#include <stdio.h>\n" +
                    "#include<stdlib.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "   char ch[100];\n" +
                    "   FILE *fptr;\n" +
                    "\n" +
                    "   if ((fptr=fopen(\"program.txt\",\"r\"))==NULL){\n" +
                    "       printf(\"Error! opening file\");\n" +
                    "       exit(0);         \n" +
                    "   }\n" +
                    "\n" +
                    "   \n" +
                    "   printf(\"Enter a sentence:\\n\",ch);\n" +
                    "   gets(ch);\n" +
                    "   fprintf(fptr,\"%s\",ch);\n" +
                    "   fclose(fptr);\n" +
                    "   \n" +
                    "   return 0;\n" +
                    "}\n");}

            else if (item_id==1){tv.setText("#include <stdio.h>\n" +
                    "#include<stdlib.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "   char ch[100];\n" +
                    "   FILE *fptr;\n" +
                    "\n" +
                    "   if ((fptr=fopen(\"file1.txt\",\"r\"))==NULL){\n" +
                    "       printf(\"Error! opening file\");\n" +
                    "       exit(0);         \n" +
                    "   }\n" +
                    "\n" +
                    "   fscanf(fptr,\"%[^\\n]\",ch);\n" +
                    "   printf(\"Data from file:\\n%s\",ch);\n" +
                    "   fclose(fptr);\n" +
                    "   return 0;\n" +
                    "}\n");}

            else if (item_id==2){tv.setText("#include<stdio.h> \n" +
                    "#include<stdlib.h> \n" +
                    " \n" +
                    "int main()\n" +
                    "{\n" +
                    "   FILE *fs1, *fs2, *ft;\n" +
                    " \n" +
                    "   char ch, file1[20], file2[20], file3[20];\n" +
                    " \n" +
                    "   printf(\"Enter name of first file\\n\");\n" +
                    "   gets(file1);\n" +
                    " \n" +
                    "   printf(\"Enter name of second file\\n\");\n" +
                    "   gets(file2);\n" +
                    " \n" +
                    "   printf(\"Enter name of file which will store contents of two files\\n\");\n" +
                    "   gets(file3);\n" +
                    " \n" +
                    "   fs1 = fopen(file1,\"r\");\n" +
                    "   fs2 = fopen(file2,\"r\");\n" +
                    " \n" +
                    "   if( fs1 == NULL || fs2 == NULL )\n" +
                    "   {\n" +
                    "      \n" +
                    "      printf(\"ERROR\\n\");\n" +
                    "      exit(0);\n" +
                    "   }\n" +
                    " \n" +
                    "   ft = fopen(file3,\"w\");\n" +
                    " \n" +
                    "   if( ft == NULL )\n" +
                    "   {\n" +
                    "      \n" +
                    "      printf(\"ERROR\\n\");\n" +
                    "      exit(0);\n" +
                    "   }\n" +
                    " \n" +
                    "   while( ( ch = fgetc(fs1) ) != EOF )\n" +
                    "      fputc(ch,ft);\n" +
                    " \n" +
                    "   while( ( ch = fgetc(fs2) ) != EOF )\n" +
                    "      fputc(ch,ft);\n" +
                    " \n" +
                    "   printf(\"Two files merged into %s file successfully.\\n\",file3);\n" +
                    " \n" +
                    "   fclose(fs1);\n" +
                    "   fclose(fs2);\n" +
                    "   fclose(ft);\n" +
                    " \n" +
                    "   return 0;\n" +
                    "}");}

        }//end group 6 Files

        //start group 7 Sorting

        else if (group_id==7){

            if (item_id==0){tv.setText("#include<stdio.h>\n" +
                    "void bubble_sort(long [], long);\n" +
                    "int  main()\n" +
                    "{\n" +
                    "long array[100], n, c, d, swap;\n" +
                    " printf(\"Enter number of elements\\n\");\n" +
                    "scanf(\"%ld\", &n);\n" +
                    " printf(\"Enter %ld integers\\n\", n);\n" +
                    "  for(c = 0; c < n; c++)\n" +
                    "scanf(\"%ld\", &array[c]);\n" +
                    "bubble_sort(array, n);\n" +
                    " printf(\"Sorted list in ascending order:\\n\");\n" +
                    "  for ( c = 0 ; c < n ; c++ )\n" +
                    " printf(\"%ld\\n\", array[c]);\n" +
                    " return 0;\n" +
                    "}\n" +
                    " \n" +
                    "void bubble_sort(long list[], long n)\n" +
                    "{\n" +
                    "long c, d, t;\n" +
                    " for (c = 0 ; c < ( n - 1 ); c++)\n" +
                    "{\n" +
                    "  for (d = 0 ; d < n - c - 1; d++)\n" +
                    "{\n" +
                    "  if (list[d] > list[d+1])\n" +
                    "{\n" +
                    "    t= list[d];\n" +
                    "    list[d]= list[d+1];\n" +
                    "     list[d+1] = t;\n" +
                    "       }\n" +
                    "     }\n" +
                    "   }\n" +
                    "}\n");}

            else if (item_id==1){tv.setText("#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "\n" +
                    "int n, array[1000], i, d, t;\n" +
                    "\n" +
                    "printf(\"Enter number of elements\\n\");\n" +
                    "scanf(\"%d\", &n);\n" +
                    "\n" +
                    "printf(\"Enter %d integers\\n\", n); \n" +
                    "\n" +
                    "for(i = 0; i< n; i++) \n" +
                    "{\n" +
                    "scanf(\"%d\", &array[i]);\n" +
                    "}\n" +
                    " \n" +
                    "for(i = 1 ; i < = n - 1; i++) {\n" +
                    " d = i;\n" +
                    "\n" +
                    "while( d > 0 && array[d] < array[d-1]) {\n" +
                    "\n" +
                    "t= array[d];\n" +
                    "array[d] = array[d-1];\n" +
                    "array[d-1] = t; \n" +
                    "d--;\n" +
                    "}\n" +
                    "}\n" +
                    "\n" +
                    "printf(\"Sorted list in ascending order:\\n\");\n" +
                    "\n" +
                    "for(i = 0; i <= n - 1; i++) \n" +
                    "{\n" +
                    "\n" +
                    "printf(\"%d\\n\", array[i]);\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "return 0;\n" +
                    "\n" +
                    "}\n");}

            else if (item_id==2){tv.setText("#include<stdio.h>\n" +
                    "\n" +
                    "int main()\n" +
                    "{\n" +
                    "\n" +
                    "int array[100], n, c, d, position, swap;\n" +
                    " \n" +
                    "printf(\"Enter number of elements\\n\");\n" +
                    "scanf(\"%d\", &n);\n" +
                    "\n" +
                    "printf(\"Enter %d integers\\n\", n);\n" +
                    "\n" +
                    "for ( c = 0 ; c < n ; c++ )\n" +
                    "scanf(\"%d\", &array[c]);\n" +
                    " \n" +
                    "for ( c = 0 ; c < ( n - 1 ) ; c++ )\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    " position = c;\n" +
                    "\n" +
                    "for ( d = c + 1 ; d < n ; d++ )\n" +
                    "{\n" +
                    "\n" +
                    "if ( array[position] > array[d] )\n" +
                    "\n" +
                    " position = d;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "if ( position != c )\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "swap = array[c];\n" +
                    "array[c] = array[position];\n" +
                    "array[position] = swap;\n" +
                    "\n" +
                    "}\n" +
                    "}\n" +
                    "\n" +
                    "printf(\"Sorted list in ascending order:\\n\");\n" +
                    "\n" +
                    "for ( c = 0 ; c < n ; c++ )\n" +
                    "printf(\"%d\\n\", array[c]);\n" +
                    " \n" +
                    "return 0;\n" +
                    "}\n" +
                    "\n" +
                    "\n");}

            else if (item_id==3){tv.setText("#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "#define MAX 20\n" +
                    "void mergeSort(int arr[],int low,int mid,int high); \n" +
                    "void partition(int arr[],int low,int high); \n" +
                    "int main()\n" +
                    "{\n" +
                    "int merge[MAX],i,n; \n" +
                    "printf(\"Enter the total number of elements: \");\n" +
                    "scanf(\"%d\",&n);\n" +
                    " printf(\"Enter the elements : \"); \n" +
                    "  for(i=0;i<n;i++)\n" +
                    "{\n" +
                    " scanf(\"%d\",&merge[i]);\n" +
                    " \n" +
                    " }\n" +
                    " partition(merge,0,n-1); \n" +
                    "  printf(\"After merge sorting elements are: \");\n" +
                    "for(i=0;i<n;i++)\n" +
                    " {\n" +
                    "printf(\"%d \",merge[i]);\n" +
                    "}\n" +
                    "return 0;\n" +
                    "  }\n" +
                    " \n" +
                    " void partition(int arr[],int low,int high)\n" +
                    " { \n" +
                    " \n" +
                    " int mid; \n" +
                    "if(low<high)\n" +
                    " {\n" +
                    "  mid=(low+high)/2; \n" +
                    "  partition(arr,low,mid); \n" +
                    "  partition(arr,mid+1,high); \n" +
                    "  mergeSort(arr,low,mid,high);\n" +
                    "\n" +
                    "  }\n" +
                    "\n" +
                    "}\n" +
                    " void mergeSort(int arr[],int low,int mid,int high)\n" +
                    " { \n" +
                    "int i,m,k,l,temp[MAX]; \n" +
                    "l=low; \n" +
                    "i=low; \n" +
                    "m=mid+1; \n" +
                    "while((l<=mid)&&(m<=high))\n" +
                    "{ \n" +
                    "if(arr[l]<=arr[m])\n" +
                    "{\n" +
                    "  temp[i]=arr[l]; \n" +
                    "l++;\n" +
                    "  \n" +
                    " }\n" +
                    " else\n" +
                    " {\n" +
                    "temp[i]=arr[m]; \n" +
                    "m++; \n" +
                    " }  \n" +
                    "  i++;\n" +
                    " }\n" +
                    "  if(l>mid)\n" +
                    "{ \n" +
                    "for(k=m;k<=high;k++)\n" +
                    "{\n" +
                    " temp[i]=arr[k]; \n" +
                    " i++;\n" +
                    "\n" +
                    " }\n" +
                    "}\n" +
                    " else\n" +
                    "{\n" +
                    "for(k=l;k<=mid;k++)\n" +
                    " {\n" +
                    " temp[i]=arr[k]; \n" +
                    "  i++;\n" +
                    " \n" +
                    " }\n" +
                    "\n" +
                    "}\n" +
                    "for(k=low;k<=high;k++)\n" +
                    "{\n" +
                    "arr[k]=temp[k]; \n" +
                    " \n" +
                    "}\n" +
                    "  return 0;\n" +
                    "\n" +
                    "}"
                    );}

            else if (item_id==4){tv.setText("\n" +
                    "#include<stdio.h>\n" +
                    "\n" +
                    "void sort(int elements[], int left, int right); \n" +
                    "\n" +
                    "int elements[10]; \n" +
                    "\n" +
                    "int main()\n" +
                    "{\n" +
                    "int i, n; \n" +
                    "printf(\"\\nEnter the number of elements you want to sort: \");\n" +
                    "scanf(\"%d\",&n); \n" +
                    "\n" +
                    "printf(\"\\nEnter the values: \");\n" +
                    "\n" +
                    "for (i = 0; i < n; i++)\n" +
                    "{\n" +
                    "printf (\"\\nEnter element %i :\",i); \n" +
                    "scanf(\"%d\",&elements[i]); \n" +
                    "}\n" +
                    "\n" +
                    "printf(\"\\n Array before sorting:\\n\");\n" +
                    "\n" +
                    "for (i = 0; i < n; i++)\n" +
                    "printf(\"[%i], \",elements[i]); \n" +
                    "printf (\"\\n\");\n" +
                    "\n" +
                    "sort(elements, 0, n - 1); \n" +
                    "\n" +
                    "printf(\"\\n Array after sorting:\\n\");\n" +
                    "for (i = 0; i < n; i++)\n" +
                    "printf(\"[%i], \", elements[i]); \n" +
                    "}\n" +
                    "\n" +
                    "void sort(int elements[], int left, int right)\n" +
                    "{\n" +
                    "int pivot, l, r; \n" +
                    "l = left; \n" +
                    "r = right; \n" +
                    "pivot = elements[left]; \n" +
                    "while (left < right) \n" +
                    "{\n" +
                    "while ((elements[right] >= pivot) && (left < right)) \n" +
                    "right--;\n" +
                    "if (left != right) \n" +
                    "{\n" +
                    "elements[left] = elements[right]; \n" +
                    "left++;\n" +
                    "}\n" +
                    "while ((elements[left] <= pivot) && (left < right)) \n" +
                    "left++;\n" +
                    "if(left != right) \n" +
                    "{\n" +
                    "\n" +
                    "elements[right] = elements[left]; \n" +
                    "right--;\n" +
                    "\t}\n" +
                    "}\n" +
                    "elements[left] = pivot; \n" +
                    "pivot = left; \n" +
                    "left = l; \n" +
                    "right = r; \n" +
                    "if (left < pivot) \n" +
                    "sort(elements, left, pivot - 1); \n" +
                    "if (right > pivot) \n" +
                    "sort(elements, pivot + 1, right); \n" +
                    "\n" +
                    "}\n");}

            else if (item_id==5){tv.setText("#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "#define MAX 20\n" +
                    "#define S \n" +
                    "\n" +
                    "void Display(int *a, int n) \n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "int i;\n" +
                    "for (i = 0; i < n; i++)\n" +
                    "printf(\"%d\\t;\", a[i]);\n" +
                    "\n" +
                    "} \n" +
                    "\n" +
                    "void radix_sort(int *a, int n) \n" +
                    "\n" +
                    "{\n" +
                    "int i, b[MAX], m = 0, exp = 1;\n" +
                    "for (i = 0; i < n; i++) \n" +
                    "{\n" +
                    "  if (a[i] > m)\n" +
                    "   m = a[i];\n" +
                    " }\n" +
                    "   while (m / exp > 0) \n" +
                    " {\n" +
                    "  int box[10] = { 0 };\n" +
                    "  for (i = 0; i < n; i++)\n" +
                    " box[a[i] / exp % 10]++;\n" +
                    "  for (i = 1; i < 10; i++)\n" +
                    " box[i] += box[i - 1];\n" +
                    "  for (i = n - 1; i >= 0; i--)\n" +
                    " b[--box[a[i] / exp % 10]] = a[i];\n" +
                    "  for (i = 0; i < n; i++)\n" +
                    " a[i] = b[i];\n" +
                    "exp *= 10;\n" +
                    " \n" +
                    "#ifdef S\n" +
                    "\n" +
                    "  printf(\"\\n\\nPASS   : \");\n" +
                    "\n" +
                    "  Display(a, n);\n" +
                    "\n" +
                    "#endif\n" +
                    "}\n" +
                    "} \n" +
                    "int main() \n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "int arr[MAX];\n" +
                    "int i, num;\t \n" +
                    "\n" +
                    "printf(\"\\nEnter no of elements : \", MAX);\n" +
                    "\n" +
                    "scanf(\"%d\", &num);\n" +
                    "\n" +
                    "printf(\"\\n Enter %d Elements : \", num);\n" +
                    "\n" +
                    "for (i = 0; i < num; i++)\n" +
                    "\n" +
                    "scanf(\"%d\", &arr[i]);\n" +
                    "\n" +
                    "printf(\"\\n ARRAY  : \");\n" +
                    "\n" +
                    "Display(&arr[0], num);\n" +
                    "\n" +
                    "radix_sort(&arr[0], num);\n" +
                    "\n" +
                    "printf(\"\\n\\n SORTED  : \");\n" +
                    "\n" +
                    "Display(&arr[0], num);\n" +
                    " \n" +
                    "return 0;\n" +
                    "}\n");}

        }//end of group 7 Sorting

        //start group 8 Searching

        else if (group_id==8){

            if (item_id==0){tv.setText("#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    " int array[100], search, c, n;\n" +
                    " printf(\"Enter the number of elements in array\\n\");\n" +
                    " scanf(\"%d\",&n);\n" +
                    " printf(\"Enter %d integers\\n\", n); \n" +
                    " for (c = 0; c < n; c++)\n" +
                    " scanf(\"%d\", &array[c]);\n" +
                    " printf(\"Enter the number to search\\n\");\n" +
                    " scanf(\"%d\", &search);\n" +
                    " for (c = 0; c < n; c++)\n" +
                    "{\n" +
                    "if (array[c] == search){ \n" +
                    "printf(\"%d is present at location %d.\\n\", search, c+1);\n" +
                    "break;\n" +
                    " }\n" +
                    "}\n" +
                    " if (c == n)\n" +
                    "printf(\"%d is not present in array.\\n\", search);\n" +
                    " \n" +
                    " return 0;\n" +
                    "}\n");}

            else if (item_id==1){tv.setText("#include<stdio.h>\n" +
                    "int main()\n" +
                    "{\n" +
                    "int a[10],i,n,m,c,l,u; \n" +
                    "printf(\"Enter the size of an array: \");\n" +
                    "scanf(\"%d\",&n); \n" +
                    "printf(\"Enter the elements of the array: \" ); \n" +
                    "for(i=0;i<n;i++)\n" +
                    "{\n" +
                    "scanf(\"%d\",&a[i]); \n" +
                    "}\n" +
                    "printf(\"Enter the number to be search: \");\n" +
                    "scanf(\"%d\",&m); \n" +
                    " l=0,u=n-1; \n" +
                    "c=binary_search(a,n,m,l,u); \n" +
                    "if(c==0) \n" +
                    "printf(\"Number is not found.\"); \n" +
                    "else\n" +
                    " printf(\"Number is found.\"); \n" +
                    "return 0; \n" +
                    " }\n" +
                    "int binary_search(int a[],int n,int m,int l,int u)\n" +
                    "{ \n" +
                    "int mid,c=0; \n" +
                    " if(l<=u)\n" +
                    "{ \n" +
                    " mid=(l+u)/2; \n" +
                    " if(m==a[mid])\n" +
                    "{ \n" +
                    "c=1; \n" +
                    " }\n" +
                    " else if(m<a[mid])\n" +
                    "{ \n" +
                    "return binary_search(a,n,m,l,mid-1); \n" +
                    "}\n" +
                    "else\n" +
                    " return binary_search(a,n,m,mid+1,u); \n" +
                    "}\n" +
                    " else\n" +
                    "return c; \n" +
                    "}\n");}

            else if (item_id==2){tv.setText("#include<stdio.h>\n" +
                    "#include<stdlib.h>\n" +
                    "#define MAX 200\n" +
                    " int  interpolation_search(int a[], int bottom, int top, int item) \n" +
                    "{\n" +
                    "int mid;\n" +
                    " while (bottom <= top) \n" +
                    "{\n" +
                    " mid = bottom + (top - bottom)* ((item - a[bottom]) / (a[top] - a[bottom]));\n" +
                    " if (item == a[mid])\n" +
                    "return mid + 1;\n" +
                    " if (item < a[mid])\n" +
                    "top = mid - 1;\n" +
                    " else\n" +
                    "bottom = mid + 1;\n" +
                    " }\n" +
                    "return -1;\n" +
                    "}\n" +
                    "  int  main() {\n" +
                    "int arr[MAX];\n" +
                    "int i, num;\n" +
                    " int item, pos;\n" +
                    " printf(\"\\nEnter total elements: \", MAX);\n" +
                    " scanf(\"%d\", &num);\n" +
                    " printf(\"Enter %d Elements : \", num);\n" +
                    "for (i = 0; i < num; i++)\n" +
                    " scanf(\"%d\", &arr[i]); \n" +
                    " printf(\"\\n ELEMENTS ARE\\n: \");\n" +
                    "for (i = 0; i < num; i++)\n" +
                    " printf(\"%d   \", arr[i]);\n" +
                    " printf(\"\\n Search for : \");\n" +
                    " scanf(\"%d\", &item);\n" +
                    "pos =  interpolation_search(&arr[0], 0, num, item);\n" +
                    " if (pos == -1)\n" +
                    " printf(\"\\n Element %d not found \\n\", item);\n" +
                    " else\n" +
                    " printf(\"\\n Element %d found at position %d \\n\", item, pos); \n" +
                    "return 0;\n" +
                    "}\n" +
                    "\n");}
        }//end of group 8 Searching

        //start group 9 DataStructure

        else if (group_id==9){

            if (item_id==0){tv.setText("#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "#define size 20\n" +
                    "int stack[size];\n" +
                    "int top=-1;\n" +
                    "void push()\n" +
                    "{\n" +
                    "int n;\n" +
                    "printf(\"\\n Enter item in stack:\");\n" +
                    "scanf(\"%d\",&n);\n" +
                    "if(top==size-1)\n" +
                    "{\n" +
                    "printf(\"\\nStack is Full\");\n" +
                    "}\n" +
                    "else\n" +
                    "{\n" +
                    "top=top+1;\n" +
                    "stack[top]=n;\n" +
                    "}\n" +
                    "}\n" +
                    "void pop()\n" +
                    "{\n" +
                    "int item;\n" +
                    "if(top==-1)\n" +
                    "{\n" +
                    "printf(\"\\n Stack is empty\");\n" +
                    "}\n" +
                    "else\n" +
                    "{\n" +
                    "item=stack[top];\n" +
                    "printf(\"\\n item popped is=%d\", item);\n" +
                    "top--;\n" +
                    "}\n" +
                    "}\n" +
                    "void display()\n" +
                    "{\n" +
                    "int i;\n" +
                    "printf(\"\\n items in stack are:\");\n" +
                    "for(i=0; i<=top; i++)\n" +
                    "printf(\"\\n %d\", stack[i]);\n" +
                    "}\n" +
                    "void main()\n" +
                    "{\n" +
                    "char ch,ch1;\n" +
                    "ch ='y';\n" +
                    "ch1='y';\n" +
                    "top=-1;\n" +
                    "while(ch!='n')\n" +
                    "{\n" +
                    "push();\n" +
                    "printf(\"\\n Do you want to push any item in stack y/n\");\n" +
                    "ch=getch();\n" +
                    "}\n" +
                    "display();\n" +
                    "while(ch1!='n')\n" +
                    "{\n" +
                    "printf(\"\\n Do you want to delete any item in stack y/n\");\n" +
                    "ch1=getch();\n" +
                    "pop();\n" +
                    "}\n" +
                    "display();\n" +
                    "getch();\n" +
                    "}\n");}

            else if (item_id==1){tv.setText("#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "#include<malloc.h>\n" +
                    "\n" +
                    "struct node\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "int item;\n" +
                    " struct node *next;\n" +
                    "};\n" +
                    "\n" +
                    "struct node *top;\n" +
                    "void push()\n" +
                    "\n" +
                    " {\n" +
                    "\n" +
                    "int n;\n" +
                    "struct node *pt;\n" +
                    "pt=(struct node*)malloc(sizeof(struct node));\n" +
                    "\n" +
                    "printf(\"\\n Enter item in stack:\");\n" +
                    "scanf(\"%d\",&n);\n" +
                    "\n" +
                    "pt->item=n;\n" +
                    "pt->next=0;\n" +
                    "\n" +
                    "if(top==0)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    " top=pt;\n" +
                    "\n" +
                    "}\n" +
                    "else\n" +
                    "{\n" +
                    " pt->next=top;\n" +
                    " top=pt;\n" +
                    "}\n" +
                    "}\n" +
                    "\n" +
                    "void pop()\n" +
                    "\n" +
                    "{\n" +
                    "int item;\n" +
                    "struct node *ptr;\n" +
                    "\n" +
                    "if(top==0)\n" +
                    "{\n" +
                    "\n" +
                    "  printf(\"\\n Stack is empty\");\n" +
                    "\n" +
                    "}\n" +
                    "else\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "item=top->item;\n" +
                    "ptr=top;\n" +
                    "printf(\"\\n item popped is=%d\", item);\n" +
                    "\n" +
                    "top=top->next;\n" +
                    "free(ptr);\n" +
                    "}\n" +
                    "}\n" +
                    "\n" +
                    " void display()\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "struct node *ptr;\n" +
                    "\n" +
                    "printf(\"\\n item in stack are\");\n" +
                    "\n" +
                    "for(ptr=top; ptr!=0; ptr=ptr->next)\n" +
                    "printf(\"\\n %d\", ptr->item);\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " void main()\n" +
                    "{\n" +
                    "\n" +
                    " char ch,ch1;\n" +
                    " ch ='y';\n" +
                    " ch1='y';\n" +
                    " top=0;\n" +
                    "\n" +
                    "while(ch!='n')\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    " push();\n" +
                    "\n" +
                    " printf(\"\\n Do you want to push any item in stack y/n\");\n" +
                    " ch=getch();\n" +
                    "}\n" +
                    "display();\n" +
                    "while(ch1!='n')\n" +
                    "{\n" +
                    " printf(\"\\n Do you want to delete  any item in stack y/n\");\n" +
                    " ch1=getch();\n" +
                    "\n" +
                    " pop();\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "display();\n" +
                    "\n" +
                    "getch();\n" +
                    "\n" +
                    "}\n");}

            else if (item_id==2){tv.setText("#include<stdio.h>\n" +
                    "void towers(int, char, char, char);\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "int main()\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "int num;\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "printf(\"Enter the number of disks : \");\n" +
                    "\n" +
                    "scanf(\"%d\", &num);\n" +
                    "\n" +
                    "printf(\"The sequence is:\\n\");\n" +
                    "\n" +
                    "towers(num, 'A', 'C', 'B');\n" +
                    "\n" +
                    "return 0;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "void towers(int num, char frompeg, char topeg, char auxpeg)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "if (num == 1)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "printf(\"\\n Move disk 1 from peg %c to peg %c\", frompeg, topeg);\n" +
                    "\n" +
                    "return;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "towers(num - 1, frompeg, auxpeg, topeg);\n" +
                    "\n" +
                    "printf(\"\\n Move disk %d from peg %c to peg %c\", num, frompeg, topeg);\n" +
                    "\n" +
                    "towers(num - 1, auxpeg, topeg, frompeg);\n" +
                    "\n" +
                    "}\n");}

            else if (item_id==3){tv.setText("#include<ctype.h>\n" +
                    "#define SIZE 100\n" +
                    "            \n" +
                    "\n" +
                    "char s[SIZE];\n" +
                    "int top = -1; \n" +
                    " \n" +
                    "push(char data) \n" +
                    "{ \n" +
                    " s[++top] = data;\n" +
                    "}\n" +
                    " \n" +
                    "char pop()\n" +
                    " { \n" +
                    " return (s[top--]);\n" +
                    "}\n" +
                    " \n" +
                    "int ca(char data) {\n" +
                    " switch (data) {\n" +
                    " case '#':\n" +
                    "  return 0;\n" +
                    " case '(':\n" +
                    "  return 1;\n" +
                    " case '+':\n" +
                    " case '-':\n" +
                    "  return 2;\n" +
                    " case '*':\n" +
                    " case '/':\n" +
                    "  return 3;\n" +
                    " }\n" +
                    "}\n" +
                    " \n" +
                    "int main() { \n" +
                    " char infix[100], postfix[100], ch, data;\n" +
                    " int i = 0, k = 0;\n" +
                    " printf(\"Enter the Infix Expression: \");\n" +
                    " scanf(\"%s\", infix);\n" +
                    " push('#');\n" +
                    " while ((ch = infix[i++]) != '\\0') \n" +
                    " {\n" +
                    "  if (ch == '(')\n" +
                    "\n" +
                    "   push(ch);\n" +
                    "  else if (isalnum(ch))\n" +
                    "\n" +
                    "   postfix[k++] = ch;\n" +
                    "  else if (ch == ')') {\n" +
                    "   while (s[top] != '(')\n" +
                    "    postfix[k++] = pop();\n" +
                    "   data = pop(); /* Remove ( */\n" +
                    "  } else \n" +
                    "  {\n" +
                    "   while (ca(s[top]) >= ca(ch))\n" +
                    "  postfix[k++] = pop();\n" +
                    "   push(ch);\n" +
                    "\n" +
                    "  }\n" +
                    " }\n" +
                    "\n" +
                    " while (s[top] != '#') \n" +
                    " postfix[k++] = pop();\n" +
                    " postfix[k] = '\\0';\n" +
                    "\n" +
                    " printf(\"\\n Infix Expression: %s  Postfix Expression: %s\\n\", infix, postfix);\n" +
                    "}\n");}

            else if (item_id==4){tv.setText("#define SIZE 50\n" +
                    "#include<ctype.h>\n" +
                    "            \n" +
                    "\n" +
                    "int s[SIZE];\n" +
                    "int top=-1;       \n" +
                    "\n" +
                    "push(int data)\n" +
                    "{                       \n" +
                    " s[++top]=data;\n" +
                    "}\n" +
                    "\n" +
                    "int pop()\n" +
                    "{                      \n" +
                    " return(s[top--]);\n" +
                    "}\n" +
                    "\n" +
                    "int main()\n" +
                    "{                         \n" +
                    " char postfix[50],ch;\n" +
                    " int i=0,op1,op2;\n" +
                    " printf(\"Enter the Postfix Expression: \");\n" +
                    " scanf(\"%s\",postfix);\n" +
                    " while( (ch=postfix[i++]) != '\\0')\n" +
                    " {\n" +
                    "  if(isdigit(ch)) push(ch-'0'); \n" +
                    "  else\n" +
                    "  {        \n" +
                    "   op2=pop();\n" +
                    "   op1=pop();\n" +
                    "   switch(ch)\n" +
                    "   {\n" +
                    "   case '+':push(op1+op2);\n" +
                    "   break;\n" +
                    "   case '-':push(op1-op2);\n" +
                    "   break;\n" +
                    "   case '*':push(op1*op2);\n" +
                    "   break;\n" +
                    "   case '/':push(op1/op2);\n" +
                    "   break;\n" +
                    "   }\n" +
                    "  }\n" +
                    " }\n" +
                    " printf(\"\\nPostfix Expression is: %s\\n\",postfix);\n" +
                    " printf(\"\\nAfter Evaluation: %d\\n\",s[top]);\n" +
                    "}\n" +
                    "\n" +
                    "\n" +
                    "\n");}

            else if (item_id==5){tv.setText("\n" +
                    "#include<stdio.h>\n" +
                    "#define Max 30\n" +
                    "\n" +
                    "int queue_arr[Max];\n" +
                    "int rear = -1;\n" +
                    "int front = -1;\n" +
                    "main()\n" +
                    "{\n" +
                    "int choice;\n" +
                    "while(1){\n" +
                    "printf(\"1.Insert\n" +
                    "\");\n" +
                    "printf(\"2.Delete\");\n" +
                    "printf(\"3.Display\");\n" +
                    "printf(\"4.Quit\");\n" +
                    "printf(\"\\nEnter your choice : \");\n" +
                    "scanf(\"%d\",&choice);\n" +
                    "switch(choice){\n" +
                    "case 1 :\n" +
                    "insert();\n" +
                    "break;\n" +
                    "case 2 :\n" +
                    "del();\n" +
                    "break;\n" +
                    "case 3:\n" +
                    "display();\n" +
                    "break;\n" +
                    "case 4:\n" +
                    "exit(1);\n" +
                    "default:\n" +
                    "printf(\"Wrong choice\");\n" +
                    "}/*End of switch*/\n" +
                    "}/*End of while */\n" +
                    "}/*End of main()\n" +
                    "*/\n" +
                    "insert()\n" +
                    "{\n" +
                    "int added_item;\n" +
                    "if (rear==Max-1)\n" +
                    "\n" +
                    "printf(\"Queue Overflow\");\n" +
                    "else\n" +
                    "{\n" +
                    "if (front==-1)  /*if queue is initially empty */\n" +
                    "front=0;\n" +
                    "printf(\"Enter the element : \");\n" +
                    "scanf(\"%d\", &added_item);\n" +
                    "rear=rear+1;\n" +
                    "queue_arr[rear] = added_item ;\n" +
                    "}\n" +
                    "}/*End of insert()*/\n" +
                    "del(){\n" +
                    "if (front == -1 || front > rear)\n" +
                    "{\n" +
                    "printf(\"Queue Underflow\");\n" +
                    "return ;\n" +
                    "}\n" +
                    "else\n" +
                    "{\n" +
                    "printf(\"Element deleted from queue is : %d\", queue_arr[front]);\n" +
                    "front=front+1;\n" +
                    "}\n" +
                    "}\n" +
                    "/*End of del() */\n" +
                    "display()\n" +
                    "{\n" +
                    "int i;\n" +
                    "if (front == -1)\n" +
                    "printf(\"Queue is empty\");\n" +
                    "else\n" +
                    "{\n" +
                    "printf(\"Queue is :\");\n" +
                    "for(i=front;i<= rear;i++)\n" +
                    "printf(\"%d  \",queue_arr[i]);\n" +
                    "printf(\"\n" +
                    "\");\n" +
                    "}}\n");}

            else if (item_id==6){tv.setText("#include<stdio.h>  \n" +
                    "#include<stdlib.h>  \n" +
                    " \n" +
                    "struct node\n" +
                    "{\n" +
                    "    int info;\n" +
                    "    struct node *ptr;\n" +
                    "}*front,*rear,*temp,*front1;\n" +
                    " \n" +
                    "int frontelement();\n" +
                    "void enq(int data);\n" +
                    "void deq();\n" +
                    "void empty();\n" +
                    "void display();\n" +
                    "void create();\n" +
                    "void queuesize();\n" +
                    " \n" +
                    "int count = 0;\n" +
                    " \n" +
                    "void main()\n" +
                    "{\n" +
                    "    int no, ch, e;\n" +
                    " \n" +
                    "    printf(\"\\n 1 - Enque\");\n" +
                    "    printf(\"\\n 2 - Deque\");\n" +
                    "    printf(\"\\n 3 - Front element\");\n" +
                    "    printf(\"\\n 4 - Empty\");\n" +
                    "    printf(\"\\n 5 - Exit\");\n" +
                    "    printf(\"\\n 6 - Display\");\n" +
                    "    printf(\"\\n 7 - Queue size\");\n" +
                    "    create();\n" +
                    "    while (1)\n" +
                    "    {\n" +
                    "        printf(\"\\n Enter choice : \");\n" +
                    "        scanf(\"%d\", &ch);\n" +
                    "        switch (ch)\n" +
                    "        {\n" +
                    "        case 1:\n" +
                    "            printf(\"Enter data : \");\n" +
                    "            scanf(\"%d\", &no);\n" +
                    "            enq(no);\n" +
                    "            break;\n" +
                    "        case 2:\n" +
                    "            deq();\n" +
                    "            break;\n" +
                    "        case 3:\n" +
                    "            e = frontelement();\n" +
                    "            if (e != 0)\n" +
                    "                printf(\"Front element : %d\", e);\n" +
                    "            else\n" +
                    "                printf(\"\\n No front element in Queue! queue empty\");\n" +
                    "            break;\n" +
                    "        case 4:\n" +
                    "            empty();\n" +
                    "            break;\n" +
                    "        case 5:\n" +
                    "            exit(0);\n" +
                    "        case 6:\n" +
                    "            display();\n" +
                    "            break;\n" +
                    "        case 7:\n" +
                    "            queuesize();\n" +
                    "            break;\n" +
                    "        default:\n" +
                    "            printf(\"Wrong choice, Please enter correct choice  \");\n" +
                    "            break;\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    " \n" +
                    "\n" +
                    "void create()\n" +
                    "{\n" +
                    "    front = rear = NULL;\n" +
                    "}\n" +
                    " \n" +
                    "\n" +
                    "void queuesize()\n" +
                    "{\n" +
                    "    printf(\"\\n Queue size : %d\", count);\n" +
                    "}\n" +
                    " \n" +
                    "\n" +
                    "void enq(int data)\n" +
                    "{\n" +
                    "    if (rear == NULL)\n" +
                    "    {\n" +
                    "        rear = (struct node *)malloc(1*sizeof(struct node));\n" +
                    "        rear->ptr = NULL;\n" +
                    "        rear->info = data;\n" +
                    "        front = rear;\n" +
                    "    }\n" +
                    "    else\n" +
                    "    {\n" +
                    "        temp=(struct node *)malloc(1*sizeof(struct node));\n" +
                    "        rear->ptr = temp;\n" +
                    "        temp->info = data;\n" +
                    "        temp->ptr = NULL;\n" +
                    " \n" +
                    "        rear = temp;\n" +
                    "    }\n" +
                    "    count++;\n" +
                    "}\n" +
                    " \n" +
                    "\n" +
                    "void display()\n" +
                    "{\n" +
                    "    front1 = front;\n" +
                    " \n" +
                    "    if ((front1 == NULL) && (rear == NULL))\n" +
                    "    {\n" +
                    "        printf(\"Queue empty\");\n" +
                    "        return;\n" +
                    "    }\n" +
                    "    while (front1 != rear)\n" +
                    "    {\n" +
                    "        printf(\"%d \", front1->info);\n" +
                    "        front1 = front1->ptr;\n" +
                    "    }\n" +
                    "    if (front1 == rear)\n" +
                    "        printf(\"%d\", front1->info);\n" +
                    "}\n" +
                    " \n" +
                    "\n" +
                    "void deq()\n" +
                    "{\n" +
                    "    front1 = front;\n" +
                    " \n" +
                    "    if (front1 == NULL)\n" +
                    "    {\n" +
                    "        printf(\"\\n No elements to display\");\n" +
                    "        return;\n" +
                    "    }\n" +
                    "    else\n" +
                    "        if (front1->ptr != NULL)\n" +
                    "        {\n" +
                    "            front1 = front1->ptr;\n" +
                    "            printf(\"\\n Dequed data : %d\", front->info);\n" +
                    "            free(front);\n" +
                    "            front = front1;\n" +
                    "        }\n" +
                    "        else\n" +
                    "        {\n" +
                    "            printf(\"\\n Dequed data : %d\", front->info);\n" +
                    "            free(front);\n" +
                    "            front = NULL;\n" +
                    "            rear = NULL;\n" +
                    "        }\n" +
                    "        count--;\n" +
                    "}\n" +
                    " \n" +
                    "\n" +
                    "int frontelement()\n" +
                    "{\n" +
                    "    if ((front != NULL) && (rear != NULL))\n" +
                    "        return(front->info);\n" +
                    "    else\n" +
                    "        return 0;\n" +
                    "}\n" +
                    " \n" +
                    "\n" +
                    "void empty()\n" +
                    "{\n" +
                    "     if ((front == NULL) && (rear == NULL))\n" +
                    "        printf(\"\\n Queue empty\");\n" +
                    "    else\n" +
                    "       printf(\"Queue is not empty\");\n" +
                    "\n" +
                    "}\n");}

            else if (item_id==7){tv.setText("#include<stdio.h>\n" +
                    "#include<conio.h>\n" +
                    "#define MAX 10\n" +
                    "\n" +
                    "\n" +
                    "void insert_by_priority(int);\n" +
                    "\n" +
                    "void delete_by_priority(int);\n" +
                    "\n" +
                    "void create();\n" +
                    "\n" +
                    "void check(int);\n" +
                    "\n" +
                    "void display();\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "int priority_queue[MAX];\n" +
                    "\n" +
                    "int front, rear;\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "void main()\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "int n, ch;\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "printf(\"\\n1 - Insert \");\n" +
                    "\n" +
                    "printf(\"\\n2 - Delete \");\n" +
                    "\n" +
                    "printf(\"\\n3 - Display \");\n" +
                    "\n" +
                    "printf(\"\\n4 - Exit\");\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "create();\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "while (1)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "printf(\"\\nEnter your choice : \");\n" +
                    "\n" +
                    "scanf(\"%d\", &ch);\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "switch (ch)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "case 1: \n" +
                    "\n" +
                    "printf(\"\\nEnter value to be inserted : \");\n" +
                    "\n" +
                    "scanf(\"%d\",&n);\n" +
                    "\n" +
                    "insert_by_priority(n);\n" +
                    "\n" +
                    "break;\n" +
                    "\n" +
                    "case 2:\n" +
                    "\n" +
                    "printf(\"\\nEnter value to delete : \");\n" +
                    "\n" +
                    "scanf(\"%d\",&n);\n" +
                    "\n" +
                    "delete_by_priority(n);\n" +
                    "\n" +
                    "break;\n" +
                    "\n" +
                    "case 3: \n" +
                    "\n" +
                    "display();\n" +
                    "\n" +
                    "break;\n" +
                    "\n" +
                    "case 4: \n" +
                    "\n" +
                    "exit(0);\n" +
                    "\n" +
                    "default: \n" +
                    "\n" +
                    "printf(\"\\nChoice is incorrect, Enter a correct choice\");\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "\n" +
                    "void create()\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "front = rear = -1;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "\n" +
                    "void insert_by_priority(int data)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "if (rear >= MAX - 1)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "printf(\"\\nQueue overflow no more elements can be inserted\");\n" +
                    "\n" +
                    "return;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "if ((front == -1) && (rear == -1))\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "front++;\n" +
                    "\n" +
                    "rear++;\n" +
                    "\n" +
                    "priority_queue[rear] = data;\n" +
                    "\n" +
                    "return;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "else\n" +
                    "\n" +
                    "check(data);\n" +
                    "\n" +
                    "rear++;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "void check(int data)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "int i,j;\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "for (i = 0; i <= rear; i++)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "if (data >= priority_queue[i])\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "for (j = rear + 1; j > i; j--)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "priority_queue[j] = priority_queue[j - 1];\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "priority_queue[i] = data;\n" +
                    "\n" +
                    "return;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "priority_queue[i] = data;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "void delete_by_priority(int data)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "int i;\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "if ((front==-1) && (rear==-1))\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "printf(\"\\nQueue is empty\");\n" +
                    "\n" +
                    "return;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "for (i = 0; i <= rear; i++)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "if (data == priority_queue[i])\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "for (; i < rear; i++)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "priority_queue[i] = priority_queue[i + 1];\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "priority_queue[i] = -99;\n" +
                    "\n" +
                    "rear--;\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "if (rear == -1) \n" +
                    "\n" +
                    "front = -1;\n" +
                    "\n" +
                    "return;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "printf(\"\\n%d not found in queue to delete\", data);\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "void display()\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "if ((front == -1) && (rear == -1))\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "printf(\"\\nQueue is empty\");\n" +
                    "\n" +
                    "return;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "for (; front <= rear; front++)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "printf(\" %d \", priority_queue[front]);\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "front = 0;\n" +
                    "\n" +
                    "}\n");}


            else if (item_id==8){tv.setText("#include<stdio.h>\n" +
                    "#define SIZE 5            \n" +
                    "int Circularqueue[SIZE], front = -1, rear = -1; \n" +
                    "\n" +
                    "Enque(int data) { \n" +
                    "if (full())\n" +
                    "\n" +
                    "printf(\"\\n Overflow\\n\");\n" +
                    "\n" +
                    "else \n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "if (front == -1)\n" +
                    "\n" +
                    "front = 0;\n" +
                    "rear = (rear + 1) % SIZE;\n" +
                    "Circularqueue[rear] = data;\n" +
                    "\n" +
                    "}\n" +
                    "}\n" +
                    "\n" +
                    "int Deque()\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "int data;\n" +
                    "\n" +
                    "if (empty()) \n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "printf(\"\\nUnderflow\\n\");\n" +
                    "\n" +
                    "return (-1);\n" +
                    "\n" +
                    "} \n" +
                    "\n" +
                    "else {\n" +
                    "data = Circularqueue[front];\n" +
                    "\n" +
                    "if (front == rear) {\n" +
                    "   front = -1;\n" +
                    "   rear = -1;\n" +
                    "\n" +
                    "} \n" +
                    "\n" +
                    "else\n" +
                    "front = (front + 1) % SIZE;\n" +
                    "return (data);\n" +
                    "\n" +
                    " }\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    "int full() { /*  Checks if Circular Queue is Full */\n" +
                    "\n" +
                    "if ((front == rear + 1) || (front == 0 && rear == SIZE - 1))\n" +
                    "return 1;\n" +
                    "\n" +
                    "return 0;\n" +
                    "}\n" +
                    "\n" +
                    "int empty() { /* Function to Check Circular Queue Empty */\n" +
                    "if (front == -1)\n" +
                    "return 1;\n" +
                    "return 0;\n" +
                    "}\n" +
                    "\n" +
                    "display() { /* Function to print Circular Queue */\n" +
                    "\n" +
                    "int i;\n" +
                    "if (empty())\n" +
                    "printf(\" \\n Empty Queue\\n\");\n" +
                    "else {\n" +
                    "printf(\"Front[%d]->\", front);\n" +
                    "for (i = front; i != rear; i = (i + 1) % SIZE)\n" +
                    "printf(\"%d \", Circularqueue[i]);\n" +
                    "printf(\"%d \", Circularqueue[i]);\n" +
                    "printf(\"<-[%d]Rear\", rear);\n" +
                    "}\n" +
                    "}\n" +
                    "\n" +
                    "main() \n" +
                    "{ \n" +
                    " int option, data;\n" +
                    "\n" +
                    " do {\n" +
                    "printf(\"\\n Press 1-Insert, 2-Delete,3-Display,4-Exit\\n\");\n" +
                    "\n" +
                    "scanf(\"%d\", &option);\n" +
                    "  switch (option) { \n" +
                    "  case 1:\n" +
                    "  printf(\"\\nEnter the element to be Inserted:\");\n" +
                    "   scanf(\"%d\", &data);\n" +
                    "   Enque(data);\n" +
                    "   break;\n" +
                    "\n" +
                    "  case 2:\n" +
                    "   data = Deque();\n" +
                    "   if (data != -1)\n" +
                    "    printf(\"\\nDeleted Element is %d \\n\", data);\n" +
                    "   break;\n" +
                    "\n" +
                    "  case 3:\n" +
                    "   printf(\"\\nCircular Queue is:\\n\\n\");\n" +
                    "   display();\n" +
                    "   break;\n" +
                    "\n" +
                    "  case 4:\n" +
                    "   exit(0);\n" +
                    "   break;\n" +
                    "\n" +
                    "  default:\n" +
                    "   printf(\"\\nInvalid Option  \\n\\n\");\n" +
                    "   break;\n" +
                    "\n" +
                    "  }\n" +
                    "\n" +
                    "\n" +
                    "} \n" +
                    "while (option != 4);\n" +
                    "}\n");}

            else if (item_id==9){tv.setText("#include<stdio.h>  \n" +
                    "#include<stdlib.h> \n" +
                    "#include<malloc.h> \n" +
                    " \n" +
                    "\n" +
                    "void main()\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "    struct node\n" +
                    "\n" +
                    "    {\n" +
                    "\n" +
                    "        int num;\n" +
                    "\n" +
                    "        struct node *ptr;\n" +
                    "\n" +
                    "    };\n" +
                    "\n" +
                    "    typedef struct node NODE;\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "    NODE *head, *first, *temp = 0;\n" +
                    "\n" +
                    "    int count = 0;\n" +
                    "\n" +
                    "    int choice = 1;\n" +
                    "\n" +
                    "    first = 0;\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "    while (choice)\n" +
                    "\n" +
                    "    {\n" +
                    "\n" +
                    "        head  = (NODE *)malloc(sizeof(NODE));\n" +
                    "\n" +
                    "        printf(\"Enter the data:\\n\");\n" +
                    "\n" +
                    "        scanf(\"%d\", &head-> num);\n" +
                    "\n" +
                    "        if (first != 0)\n" +
                    "\n" +
                    "        {\n" +
                    "\n" +
                    "            temp->ptr = head;\n" +
                    "\n" +
                    "            temp = head;\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "        else\n" +
                    "\n" +
                    "        {\n" +
                    "\n" +
                    "            first = temp = head;\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "        fflush(stdin);\n" +
                    "\n" +
                    "        printf(\"Do you want to continue(Type 0 or 1)?\\n\");\n" +
                    "\n" +
                    "        scanf(\"%d\", &choice);\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "    temp->ptr = 0;\n" +
                    "\n" +
                    "    /*  reset temp to the beginning */\n" +
                    "\n" +
                    "    temp = first;\n" +
                    "\n" +
                    "    printf(\"\\nlinked list is:\\n\");\n" +
                    "\n" +
                    "    while (temp != 0)\n" +
                    "\n" +
                    "    {\n" +
                    "\n" +
                    "        printf(\"%d=>\", temp->num);\n" +
                    "\n" +
                    "        count++;\n" +
                    "\n" +
                    "        temp = temp -> ptr;\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "    printf(\"NULL\\n\");\n" +
                    "\n" +
                    "    printf(\"No. of nodes in the list = %d\\n\", count);\n" +
                    "\n" +
                    "}\n");}

            else if (item_id==10){tv.setText("#include<stdio.h>\n" +
                    "#include<stdlib.h>\n" +
                    "\n" +
                    "struct node\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "    int num;\n" +
                    "\n" +
                    "    struct node *next;\n" +
                    "\n" +
                    "};\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "void create(struct node **);\n" +
                    "\n" +
                    "void reverse(struct node **);\n" +
                    "\n" +
                    "void release(struct node **);\n" +
                    "\n" +
                    "void display(struct node *);\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "int main()\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "    struct node *p = NULL;\n" +
                    "\n" +
                    "    int n;\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "    create(&p);\n" +
                    "\n" +
                    "    printf(\"Linked list is:\\n\");\n" +
                    "\n" +
                    "    display(p);\n" +
                    "\n" +
                    "    \n" +
                    "\n" +
                    "    reverse(&p);\n" +
                    "\n" +
                    "    printf(\"reversed list is:\\n\");\n" +
                    "\n" +
                    "    display(p);\n" +
                    "\n" +
                    "    release(&p);\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "    return 0;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "void reverse(struct node **head)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "    struct node *p, *q, *r;\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "    p = q = r = *head;\n" +
                    "\n" +
                    "    p = p->next->next;\n" +
                    "\n" +
                    "    q = q->next;\n" +
                    "\n" +
                    "    r->next = NULL;\n" +
                    "\n" +
                    "    q->next = r;\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "    while (p != NULL)\n" +
                    "\n" +
                    "    {\n" +
                    "\n" +
                    "        r = q;\n" +
                    "\n" +
                    "        q = p;\n" +
                    "\n" +
                    "        p = p->next;\n" +
                    "\n" +
                    "        q->next = r;\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "    *head = q;\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "void create(struct node **head)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "    int c, ch;\n" +
                    "\n" +
                    "    struct node *temp, *rear;\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "    do\n" +
                    "\n" +
                    "    {\n" +
                    "\n" +
                    "        printf(\"Enter data: \");\n" +
                    "\n" +
                    "        scanf(\"%d\", &c);\n" +
                    "\n" +
                    "        temp = (struct node *)malloc(sizeof(struct node));\n" +
                    "\n" +
                    "        temp->num = c;\n" +
                    "\n" +
                    "        temp->next = NULL;\n" +
                    "\n" +
                    "        if (*head == NULL)\n" +
                    "\n" +
                    "        {\n" +
                    "\n" +
                    "            *head = temp;\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "        else\n" +
                    "\n" +
                    "        {\n" +
                    "\n" +
                    "            rear->next = temp;\n" +
                    "\n" +
                    "        }\n" +
                    "\n" +
                    "        rear = temp;\n" +
                    "\n" +
                    "        printf(\"1 to continue 0 to exit: \");\n" +
                    "\n" +
                    "        scanf(\"%d\", &ch);\n" +
                    "\n" +
                    "    } while (ch != 0);\n" +
                    "\n" +
                    "    printf(\"\\n\");\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "void display(struct node *p)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "    while (p != NULL)\n" +
                    "\n" +
                    "    {\n" +
                    "\n" +
                    "        printf(\"%d\\t\", p->num);\n" +
                    "\n" +
                    "        p = p->next;\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "    printf(\"\\n\");\n" +
                    "\n" +
                    "}\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "void release(struct node **head)\n" +
                    "\n" +
                    "{\n" +
                    "\n" +
                    "    struct node *temp = *head;\n" +
                    "\n" +
                    "    *head = (*head)->next;\n" +
                    "\n" +
                    "    while ((*head) != NULL)\n" +
                    "\n" +
                    "    {\n" +
                    "\n" +
                    "        free(temp);\n" +
                    "\n" +
                    "        temp = *head;\n" +
                    "\n" +
                    "        (*head) = (*head)->next;\n" +
                    "\n" +
                    "    }\n" +
                    "\n" +
                    "}\n");}

            else if (item_id==11){tv.setText("#include<stdio.h>  \n" +
                    "#include<stdlib.h> \n" +
                    " \n" +
                    "struct node\n" +
                    "{\n" +
                    "    struct node *prev;\n" +
                    "    int n;\n" +
                    "    struct node *next;\n" +
                    "}*h,*temp,*temp1,*temp2,*temp4;\n" +
                    " \n" +
                    "void insert1();\n" +
                    "void insert2();\n" +
                    "void insert3();\n" +
                    "void traversebeg();\n" +
                    "void traverseend(int);\n" +
                    "void sort();\n" +
                    "void search();\n" +
                    "void update();\n" +
                    "void delete();\n" +
                    " \n" +
                    "int count = 0;\n" +
                    " \n" +
                    "void main()\n" +
                    "{\n" +
                    "    int ch;\n" +
                    " \n" +
                    "    h = NULL;\n" +
                    "    temp = temp1 = NULL;\n" +
                    " \n" +
                    "    printf(\"\\n 1 - Insert at beginning\");\n" +
                    "    printf(\"\\n 2 - Insert at end\");\n" +
                    "    printf(\"\\n 3 - Insert at position i\");\n" +
                    "    printf(\"\\n 4 - Delete at i\");\n" +
                    "    printf(\"\\n 5 - Display from beginning\");\n" +
                    "    printf(\"\\n 6 - Display from end\");\n" +
                    "    printf(\"\\n 7 - Search for element\");\n" +
                    "    printf(\"\\n 8 - Sort the list\");\n" +
                    "    printf(\"\\n 9 - Update an element\");\n" +
                    "    printf(\"\\n 10 - Exit\");\n" +
                    " \n" +
                    "    while (1)\n" +
                    "    {\n" +
                    "        printf(\"\\n Enter choice : \");\n" +
                    "        scanf(\"%d\", &ch);\n" +
                    "        switch (ch)\n" +
                    "        {\n" +
                    "        case 1:\n" +
                    "            insert1();\n" +
                    "            break;\n" +
                    "        case 2:\n" +
                    "            insert2();\n" +
                    "            break;\n" +
                    "        case 3:\n" +
                    "            insert3();\n" +
                    "            break;\n" +
                    "        case 4:\n" +
                    "            delete();\n" +
                    "            break;\n" +
                    "        case 5:\n" +
                    "            traversebeg();\n" +
                    "            break;\n" +
                    "        case 6:\n" +
                    "            temp2 = h;\n" +
                    "            if (temp2 == NULL)\n" +
                    "                printf(\"\\n Error : List empty to display \");\n" +
                    "            else\n" +
                    "            {\n" +
                    "                printf(\"\\n Reverse order of linked list is : \");\n" +
                    "                traverseend(temp2->n);\n" +
                    "            }\n" +
                    "            break;\n" +
                    "        case 7:\n" +
                    "            search();\n" +
                    "            break;\n" +
                    "        case 8:\n" +
                    "            sort();\n" +
                    "            break;\n" +
                    "        case 9:\n" +
                    "            update();\n" +
                    "            break;\n" +
                    "        default:\n" +
                    "            exit(0);\n" +
                    "        \n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    " \n" +
                    "/* TO create an empty node */\n" +
                    "void create()\n" +
                    "{\n" +
                    "    int data;\n" +
                    " \n" +
                    "    temp =(struct node *)malloc(1*sizeof(struct node));\n" +
                    "    temp->prev = NULL;\n" +
                    "    temp->next = NULL;\n" +
                    "    printf(\"\\n Enter value to node : \");\n" +
                    "    scanf(\"%d\", &data);\n" +
                    "    temp->n = data;\n" +
                    "    count++;\n" +
                    "}\n" +
                    " \n" +
                    "/*  TO insert at beginning */\n" +
                    "void insert1()\n" +
                    "{\n" +
                    "    if (h == NULL)\n" +
                    "    {\n" +
                    "        create();\n" +
                    "        h = temp;\n" +
                    "        temp1 = h;\n" +
                    "    }\n" +
                    "    else\n" +
                    "    {\n" +
                    "        create();\n" +
                    "        temp->next = h;\n" +
                    "        h->prev = temp;\n" +
                    "        h = temp;\n" +
                    "    }\n" +
                    "}\n" +
                    " \n" +
                    "/* To insert at end */\n" +
                    "void insert2()\n" +
                    "{\n" +
                    "    if (h == NULL)\n" +
                    "    {\n" +
                    "        create();\n" +
                    "        h = temp;\n" +
                    "        temp1 = h;\n" +
                    "    }\n" +
                    "    else\n" +
                    "    {\n" +
                    "        create();\n" +
                    "        temp1->next = temp;\n" +
                    "        temp->prev = temp1;\n" +
                    "        temp1 = temp;\n" +
                    "    }\n" +
                    "}\n" +
                    " \n" +
                    "/* To insert at any position */\n" +
                    "void insert3()\n" +
                    "{\n" +
                    "    int pos, i = 2;\n" +
                    " \n" +
                    "    printf(\"\\n Enter position to be inserted : \");\n" +
                    "    scanf(\"%d\", &pos);\n" +
                    "    temp2 = h;\n" +
                    " \n" +
                    "    if ((pos < 1) || (pos >= count + 1))\n" +
                    "    {\n" +
                    "        printf(\"\\n Position out of range to insert\");\n" +
                    "        return;\n" +
                    "    }\n" +
                    "    if ((h == NULL) && (pos != 1))\n" +
                    "    {\n" +
                    "        printf(\"\\n Empty list cannot insert other than 1st position\");\n" +
                    "        return;\n" +
                    "    }\n" +
                    "    if ((h == NULL) && (pos == 1))\n" +
                    "    {\n" +
                    "        create();\n" +
                    "        h = temp;\n" +
                    "        temp1 = h;\n" +
                    "        return;\n" +
                    "    }\n" +
                    "    else\n" +
                    "    {\n" +
                    "        while (i < pos)\n" +
                    "        {\n" +
                    "            temp2 = temp2->next;\n" +
                    "            i++;\n" +
                    "        }\n" +
                    "        create();\n" +
                    "        temp->prev = temp2;\n" +
                    "        temp->next = temp2->next;\n" +
                    "        temp2->next->prev = temp;\n" +
                    "        temp2->next = temp;\n" +
                    "    }\n" +
                    "}\n" +
                    " \n" +
                    "/* To delete an element */\n" +
                    "void delete()\n" +
                    "{\n" +
                    "    int i = 1, pos;\n" +
                    " \n" +
                    "    printf(\"\\n Enter position to be deleted : \");\n" +
                    "    scanf(\"%d\", &pos);\n" +
                    "    temp2 = h;\n" +
                    " \n" +
                    "    if ((pos < 1) || (pos >= count + 1))\n" +
                    "    {\n" +
                    "        printf(\"\\n Error : Position out of range to delete\");\n" +
                    "        return;\n" +
                    "    }\n" +
                    "    if (h == NULL)\n" +
                    "    {\n" +
                    "        printf(\"\\n Error : Empty list no elements to delete\");\n" +
                    "        return;\n" +
                    "    }\n" +
                    "    else\n" +
                    "    {\n" +
                    "        while (i < pos)\n" +
                    "        {\n" +
                    "            temp2 = temp2->next;\n" +
                    "            i++;\n" +
                    "        }\n" +
                    "        if (i == 1)\n" +
                    "        {\n" +
                    "            if (temp2->next == NULL)\n" +
                    "            {\n" +
                    "                printf(\"Node deleted from list\");\n" +
                    "                free(temp2);\n" +
                    "                temp2 = h = NULL;\n" +
                    "                return;\n" +
                    "            }\n" +
                    "        }\n" +
                    "        if (temp2->next == NULL)\n" +
                    "        {\n" +
                    "            temp2->prev->next = NULL;\n" +
                    "            free(temp2);\n" +
                    "            printf(\"Node deleted from list\");\n" +
                    "            return;\n" +
                    "        }\n" +
                    "        temp2->next->prev = temp2->prev;\n" +
                    "        if (i != 1)\n" +
                    "            temp2->prev->next = temp2->next;    /* Might not need this statement if i == 1 check */\n" +
                    "        if (i == 1)\n" +
                    "            h = temp2->next;\n" +
                    "        printf(\"\\n Node deleted\");\n" +
                    "        free(temp2);\n" +
                    "    }\n" +
                    "    count--;\n" +
                    "}\n" +
                    " \n" +
                    "/* Traverse from beginning */\n" +
                    "void traversebeg()\n" +
                    "{\n" +
                    "    temp2 = h;\n" +
                    " \n" +
                    "    if (temp2 == NULL)\n" +
                    "    {\n" +
                    "        printf(\"List empty to display \\n\");\n" +
                    "        return;\n" +
                    "    }\n" +
                    "    printf(\"\\n Linked list elements from begining : \");\n" +
                    " \n" +
                    "    while (temp2->next != NULL)\n" +
                    "    {\n" +
                    "        printf(\" %d \", temp2->n);\n" +
                    "        temp2 = temp2->next;\n" +
                    "    }\n" +
                    "    printf(\" %d \", temp2->n);\n" +
                    "}\n" +
                    " \n" +
                    "/* To traverse from end recursively */\n" +
                    "void traverseend(int i)\n" +
                    "{\n" +
                    "    if (temp2 != NULL)\n" +
                    "    {\n" +
                    "        i = temp2->n;\n" +
                    "        temp2 = temp2->next;\n" +
                    "        traverseend(i);\n" +
                    "        printf(\" %d \", i);\n" +
                    "    }\n" +
                    "}\n" +
                    " \n" +
                    "/* To search for an element in the list */\n" +
                    "void search()\n" +
                    "{\n" +
                    "    int data, count = 0;\n" +
                    "    temp2 = h;\n" +
                    " \n" +
                    "    if (temp2 == NULL)\n" +
                    "    {\n" +
                    "        printf(\"\\n Error : List empty to search for data\");\n" +
                    "        return;\n" +
                    "    }\n" +
                    "    printf(\"\\n Enter value to search : \");\n" +
                    "    scanf(\"%d\", &data);\n" +
                    "    while (temp2 != NULL)\n" +
                    "    {\n" +
                    "        if (temp2->n == data)\n" +
                    "        {\n" +
                    "            printf(\"\\n Data found in %d position\",count + 1);\n" +
                    "            return;\n" +
                    "        }\n" +
                    "        else\n" +
                    "             temp2 = temp2->next;\n" +
                    "            count++;\n" +
                    "    }\n" +
                    "    printf(\"\\n Error : %d not found in list\", data);\n" +
                    "}\n" +
                    " \n" +
                    "/* To update a node value in the list */\n" +
                    "void update()\n" +
                    "{\n" +
                    "    int data, data1;\n" +
                    " \n" +
                    "    printf(\"\\n Enter node data to be updated : \");\n" +
                    "    scanf(\"%d\", &data);\n" +
                    "    printf(\"\\n Enter new data : \");\n" +
                    "    scanf(\"%d\", &data1);\n" +
                    "    temp2 = h;\n" +
                    "    if (temp2 == NULL)\n" +
                    "    {\n" +
                    "        printf(\"\\n Error : List empty no node to update\");\n" +
                    "        return;\n" +
                    "    }\n" +
                    "    while (temp2 != NULL)\n" +
                    "    {\n" +
                    "        if (temp2->n == data)\n" +
                    "        {\n" +
                    " \n" +
                    "            temp2->n = data1;\n" +
                    "            traversebeg();\n" +
                    "            return;\n" +
                    "        }\n" +
                    "        else\n" +
                    "            temp2 = temp2->next;\n" +
                    "    }\n" +
                    " \n" +
                    "    printf(\"\\n Error : %d not found in list to update\", data);\n" +
                    "}\n" +
                    " \n" +
                    "/* To sort the linked list */\n" +
                    "void sort()\n" +
                    "{\n" +
                    "    int i, j, x;\n" +
                    " \n" +
                    "    temp2 = h;\n" +
                    "    temp4 = h;\n" +
                    " \n" +
                    "    if (temp2 == NULL)\n" +
                    "    {\n" +
                    "        printf(\"\\n List empty to sort\");\n" +
                    "        return;\n" +
                    "    }\n" +
                    " \n" +
                    "    for (temp2 = h; temp2 != NULL; temp2 = temp2->next)\n" +
                    "    {\n" +
                    "        for (temp4 = temp2->next; temp4 != NULL; temp4 = temp4->next)\n" +
                    "        {\n" +
                    "            if (temp2->n > temp4->n)\n" +
                    "            {\n" +
                    "                x = temp2->n;\n" +
                    "                temp2->n = temp4->n;\n" +
                    "                temp4->n = x;\n" +
                    "            }\n" +
                    "        }\n" +
                    "    }\n" +
                    "    traversebeg();\n" +
                    "}\n");}

            else if (item_id==12){tv.setText("#include<stdio.h>\n" +
                    "#include<malloc.h>\n" +
                    "\n" +
                    "struct node\n" +
                    "{\n" +
                    "int info;\n" +
                    "struct node *link;\n" +
                    "}*last;\n" +
                    "main()\n" +
                    "{\n" +
                    "int choice,n,m,po,i;\n" +
                    "last=NULL;\n" +
                    "while(1)\n" +
                    "{\n" +
                    "printf(\"\\t1.Create List\n" +
                    "\");\n" +
                    "printf(\"2.Add at begining\");\n" +
                    "printf(\"3.Add after \");\n" +
                    "printf(\"4.Delete\");\n" +
                    "printf(\"5.Display\");\n" +
                    "printf(\"6.Quit\");\n" +
                    "printf(\"\\nEnter your choice : \\n\");\n" +
                    "scanf(\"%d\",&choice);\n" +
                    "switch(choice) \n" +
                    "{\n" +
                    " case 1:\n" +
                    "printf(\"How many nodes you want : \\n\");\n" +
                    "scanf(\"%d\",&n);\n" +
                    "for(i=0; i < n;i++){\n" +
                    "printf(\"Enter the element : \\n\");\n" +
                    "scanf(\"%d\",&m);\n" +
                    "create_list(m);\n" +
                    "}\n" +
                    "break;\n" +
                    " case 2:\n" +
                    "printf(\"Enter the element : \\n\");\n" +
                    "scanf(\"%d\",&m);\n" +
                    "add_at_beg(m);\n" +
                    "break;\n" +
                    " case 3:\n" +
                    "printf(\"Enter the element : \\n\");\n" +
                    "scanf(\"%d\",&m);\n" +
                    "printf(\"enter the position after which \n" +
                    "this element is inserted : \\n\");\n" +
                    "\n" +
                    "scanf(\"%d\",&po);\n" +
                    "add_at_end(m,po);\n" +
                    "break;\n" +
                    " case 4:\n" +
                    "if(last == NULL){\n" +
                    "printf(\"List underflow\n" +
                    "\");\n" +
                    "continue;\n" +
                    "}\n" +
                    "printf(\"Enter the number for deletion : \\n\");\n" +
                    "scanf(\"%d\",&m);\n" +
                    "del(m);\n" +
                    "break;\n" +
                    " case 5:\n" +
                    "display();\n" +
                    "break;\n" +
                    " case 6:\n" +
                    "exit(0);\n" +
                    " default:\n" +
                    "printf(\"Wrong choice\n" +
                    "\");\n" +
                    "}/*End of switch*/\n" +
                    "}/*End of while*/\n" +
                    "}/*End of main()*/\n" +
                    "create_list(int num)\n" +
                    "{\n" +
                    "struct node *q,*temp;\n" +
                    "temp= malloc(sizeof(struct node));\n" +
                    "temp->info = num;\n" +
                    "if(last == NULL)\n" +
                    "{\n" +
                    "last = temp;\n" +
                    "temp->link = last;\n" +
                    "}\n" +
                    "else\n" +
                    "{\n" +
                    "temp->link = last->link;\n" +
                    " /*added at the end of list*/\n" +
                    "last->link = temp;\n" +
                    "last = temp;\n" +
                    "}\n" +
                    "}/*End of create_list()*/\n" +
                    "add_at_beg(int num)\n" +
                    "{\n" +
                    "struct node *temp;\n" +
                    "temp = malloc(sizeof(struct node));\n" +
                    "temp->info = num;\n" +
                    "temp->link = last->link;\n" +
                    "last->link = temp;\n" +
                    "}/*End of add_at_beg()*/\n" +
                    "add_at_end(int num,int pos)\n" +
                    "{\n" +
                    "struct node *temp,*q;\n" +
                    "int i;\n" +
                    "q = last->link;\n" +
                    "for(i=0;\n" +
                    " i < pos-1;\n" +
                    " i++)\n" +
                    "{\n" +
                    "q = q->link;\n" +
                    "if(q == last->link)\n" +
                    "{\n" +
                    "printf(\"There are less than %d elements\",pos);\n" +
                    "return;\n" +
                    "}\n" +
                    "}/*End of for*/\n" +
                    "temp = malloc(sizeof(struct node) );\n" +
                    "temp->link = q->link;\n" +
                    "temp->info = num;\n" +
                    "q->link = temp;\n" +
                    "if(q==last)    /*Element inserted at the end*/\n" +
                    "last=temp;\n" +
                    "}\n" +
                    "/*End of add_at_end()*/\n" +
                    "\n" +
                    "\n" +
                    "del(int num)\n" +
                    "{\n" +
                    "struct node *temp,*q;\n" +
                    "if( last->link == last && last->info == num)  \n" +
                    "/*Only one element*/\n" +
                    "\n" +
                    "{\n" +
                    "temp = last;\n" +
                    "last = NULL;\n" +
                    "free(temp);\n" +
                    "return;\n" +
                    "}\n" +
                    "q = last->link;\n" +
                    "if(q->info == num)\n" +
                    "{\n" +
                    "temp = q;\n" +
                    "last->link = q->link;\n" +
                    "free(temp);\n" +
                    "return;\n" +
                    "}\n" +
                    "while(q->link != last)\n" +
                    "{\n" +
                    "if(q->link->info == num)     /*Element deleted in between*/\n" +
                    "{\n" +
                    "temp = q->link;\n" +
                    "q->link = temp->link;\n" +
                    "free(temp);\n" +
                    "printf(\"%d deleted\n" +
                    "\",num);\n" +
                    "return;\n" +
                    "}\n" +
                    "q = q->link;\n" +
                    "}/*End of while*/\n" +
                    "if(q->link->info == num)  \n" +
                    "\n" +
                    "/*Last element deleted  q->link=last*/\n" +
                    "\n" +
                    "{\n" +
                    "temp = q->link;\n" +
                    "q->link = last->link;\n" +
                    "free(temp);\n" +
                    "last = q;\n" +
                    "return;\n" +
                    "}\n" +
                    "printf(\"Element %d not found\n" +
                    "\",num);\n" +
                    "}/*End of del()*/\n" +
                    "display()\n" +
                    "{\n" +
                    "struct node *q;\n" +
                    "if(last == NULL)\n" +
                    "{\n" +
                    "printf(\"List is empty\n" +
                    "\");\n" +
                    "return;\n" +
                    "}\n" +
                    "q = last->link;\n" +
                    "printf(\"List is :\n" +
                    "\");\n" +
                    "while(q != last)\n" +
                    "{\n" +
                    "printf(\"%d \", q->info);\n" +
                    "q = q->link;\n" +
                    "}\n" +
                    "printf(\"%d\n" +
                    "\",last->info);\n" +
                    "}/*End of display()*/");}



        }








    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detail, menu);
        return true;
    }
    //Ofline Download
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_download) {
            try {
                File sdCard = Environment.getExternalStorageDirectory();
                File dir = new File (sdCard.getAbsolutePath() + "/C Lab Programs");
                dir.mkdirs();
                File file = new File(dir, title+".c");
                file.createNewFile();
                FileOutputStream fOut = new FileOutputStream(file);
                OutputStreamWriter myOutWriter =new OutputStreamWriter(fOut);
                myOutWriter.append(tv.getText());
                myOutWriter.close();
                fOut.close();
                Toast.makeText(this,"Downloaded...open C Lab Programs folder'", Toast.LENGTH_SHORT).show();

            }
            catch (Exception e)
            {
                Toast.makeText(this, e.getMessage(),Toast.LENGTH_SHORT).show();
            }



            return true;
        }
        if(id==R.id.action_share){
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT,tv.getText().toString());
            startActivity(Intent.createChooser(intent,"share..."));
        }
        if(id==R.id.action_copy){

            ClipboardManager clipboard=(ClipboardManager)getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clip=ClipData.newPlainText("Program",tv.getText());
            clipboard.setPrimaryClip(clip);
            Toast.makeText(this,"Copied...",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onPause() {
        webview.setVisibility(View.INVISIBLE);
        super.onPause();
    }

    @Override
    protected void onResume() {

        webview.setVisibility(View.VISIBLE);
        super.onResume();
    }
}
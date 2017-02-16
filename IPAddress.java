
class IPAddress
{
	
     String[] checkIPs(String[] ip_array) {
int n=ip_array.length;
        String[] res=new String[n];
        for(int i=0;i<n;i++)
            {
            String[] data=ip_array[i].split("\\.");
            String[] inp=ip_array[i].split(":");
            //System.out.print(Integer.parseInt("abcd"));
            if(data.length==4)
                {
                int flag=0;
                for(int k=0;k<ip_array[i].length();k++)
                    {
                    if((((int)ip_array[i].charAt(k)>47&&(int)ip_array[i].charAt(k)<58))||ip_array[i].charAt(k)=='.')
                    {}    
                    else
                        {
                        res[i]="Neither";
                        flag=1;
                        break;
                    }
                }
                
                if(flag==0)
                    {
                for(int j=0;j<4;j++)
                    {
                    if(Integer.parseInt(data[j])>255)
                        {
                        res[i]="Neither";
                        break;
                    }
                    else
                        res[i]="IPv4";
                }
                }
                }
            
            
            
            else if(inp.length==8)
                {
                ip_array[i]=ip_array[i].toLowerCase();
                for(int k=0;k<ip_array[i].length();k++)
                    {
                    if((((int)ip_array[i].charAt(k)>47&&(int)ip_array[i].charAt(k)<58))||ip_array[i].charAt(k)==':'||(int)ip_array[i].charAt(k)>96&&(int)ip_array[i].charAt(k)<103)
                    {}    
                    else
                        {
                        res[i]="Neither";
                      
                        break;
                    }
                    res[i]="IPv6";
                }
            }
            
            
            
            else
              res[i]="Neither";  
            
            
        }
return res;
    }
}


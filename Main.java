import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String ip = br.readLine();
        int ip_len = ip.length();
        int middle_index = (int)ip_len/2;
        StringBuilder sb = new StringBuilder();
        for(int i=middle_index;(i<ip_len)&&(sb.length()!=ip_len);i++) {
            sb.append(Character.toString(ip.charAt(i)));
            System.out.println(sb.toString());
            if(i==ip_len-1) {
                i = -1;
            }
        }
        
    }
}
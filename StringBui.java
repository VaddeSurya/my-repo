

public class StringBui {
    
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}



// Commit timestamp: 2023-11-28 20:24:00
public class Main {

    public static void main(String[] args) {

        System.out.println(rps("paper", "paper"));
        System.out.println(rps("rock", "scissors"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("rock", "paper"));

        System.out.println(pigLatin("Cats are great pets."));
        System.out.println(pigLatin("He told us a very exciting tale."));
    }


    public static String rps(String player1, String player2){

        String ret = "";
        if(player1.equals(player2)) ret = "TIE";
        else if(player1.equals("rock")) ret = player2.equals("scissors") ? "Player 1 wins" : "Player 2 wins";
        else if(player1.equals("scissors")) ret = player2.equals("paper") ? "Player 1 wins" : "Player 2 wins";
        else if(player1.equals("paper")) ret = player2.equals("rock") ? "Player 1 wins" : "Player 2 wins";
        return ret;
    }

    public static String pigLatin(String s){
        StringBuilder sb = new StringBuilder();
        String punctuation = s.substring(s.length() - 1);
        String[] words = s.substring(0, s.length() - 1).split(" ");
        for(int i = 0; i < words.length; i ++){
            if ("aeiouAEIOU".indexOf( words[i].charAt(0) ) >= 0) sb.append(words[i] + "way");
            else if(Character.isUpperCase(words[i].charAt(0))){
                sb.append(Character.toUpperCase(words[i].charAt(1)) + words[i].substring(2) + Character.toLowerCase(words[i].charAt(0)) + "ay");
            }else{
                sb.append(words[i].charAt(1) + words[i].substring(2) + words[i].charAt(0) + "ay");
            }
            if(i != words.length - 1) sb.append(" ");
        }
        sb.append(punctuation);
        return sb.toString();
    }

}

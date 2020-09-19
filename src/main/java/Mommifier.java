
public class Mommifier {

    public String getNewString(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        String resultString = string;
        int strLenth = string.length();
        String vowels ="aeiouaeiou";
        int count=0;
        int index = 0;
        if(string.length()>(vowels.length())){
            while ((index = string.indexOf(vowels, index)) != -1) {
                index = index + vowels.length();
                count++;
            }
            if (vowels.length()*count > (int)strLenth *0.3){
                while ((index = string.indexOf(vowels, index)) != -1) {
                    index = index + vowels.length();
                    stringBuilder.insert(index-5,"mommy");
                }
                resultString = stringBuilder.toString();
            }
        }
        return resultString;
    }
}

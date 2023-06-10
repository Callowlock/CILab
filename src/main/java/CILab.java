public class CILab implements CILabInterface {
    private String myString;

    public void CILab() {
        this.myString = null;
    }
    @Override
    public String getString() {
        return this.myString;
    }

    @Override
    public void setString(String string) {
        this.myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        String tempFirstLetter = this.myString.substring(0,1);

        if(this.myString.equals(this.myString.toUpperCase())) {
            return true;
        } else if(this.myString.equals(this.myString.toLowerCase())) {
            return true;
        } else if(tempFirstLetter.equals(tempFirstLetter.toUpperCase()) && !containsUpper(myString.substring(1, myString.length()))) {
            return true;
        }
        return false;
    }

    private boolean containsUpper(String s) {
        for(int i = 0; i < s.length(); i++) {
            String c = s.charAt(i) +"";
            if(c == c.toUpperCase()) {
                return true;
            }
        }
        return false;
    }
}


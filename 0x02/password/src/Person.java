public class Person {
    public boolean checkUser(String user) {
        String caracteresEspeciais = "!@#$%^&*()-+";
        if (user.length() < 8) return false;
        
        // Verifica cada caractere do usuário
        for (char c : user.toCharArray()) {
            if (caracteresEspeciais.indexOf(c) >= 0) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPassword(String password) {
        String caracteresEspeciais = "!@#$%^&*()-+";
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        if (password.length() < 8) {
            return false;
        }

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
            else if (caracteresEspeciais.indexOf(c) >= 0) hasSpecial = true;
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}

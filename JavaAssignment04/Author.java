class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
    }

    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rahul", "Rahul@gmail.com", 'M');
        System.out.println(author1);
        author1.setEmail("newemail@gmail.com");
        System.out.println("Updated Email: " + author1.getEmail());
        System.out.println(author1);
    }
}

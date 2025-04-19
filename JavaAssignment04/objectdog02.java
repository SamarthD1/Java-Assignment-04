class objectdog02 {
    String breed;
    
    objectdog02(String breed) 
    {
        this.breed = breed;
    }
    
    void bark() 
    {
        System.out.println(breed + " is barking.");
    }
    
    public static void main(String[] args) 
    {
        objectdog02 dog1 = new objectdog02("Labrador");
        dog1.bark();
    }
}

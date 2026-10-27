public class Hello {
    public static void main(String[] args) {
        String name = System.getenv().getOrDefault(
            "WHO_TO_GREET",
            "GitHub Actions Student"
        );

        System.out.println("Hello " + name + "!");
        System.out.println("The Java program is running inside GitHub Actions.");
    }
}

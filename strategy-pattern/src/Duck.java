abstract class Duck {
    void quack() {
        System.out.println("quack quack");
    }

    void swim() {
        System.out.println("I'm swimming");
    }

    abstract void display(); // 모든 오리의 생김새는 다르다
}

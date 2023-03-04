package jpabook.jpashop;

public class ClassName<E> {
    private E element; // 제네릭 타입 변수

    void set(E element) {
        //제네릭 파라미터 메소드
        this.element = element;
    }

    E get() {

        //제네릭 타입 반환 메소드
        return element;
    }

    static <E> E genericMethod(E o) {
        //제네릭 메소드
        return o;
    }

    public static void main(String[] args) {

        ClassName<String> a = new ClassName<String>();
        ClassName<Integer> b = new ClassName<Integer>();

        a.set("10");
        b.set(10);

        // 반환된 변수의 타입 출력
        System.out.println("a data : " + a.get());
        System.out.println("a E Type : " + a.get().getClass().getName());

        System.out.println("b data : " + b.get());
        System.out.println("b E Type : " + b.get().getClass().getName());
        System.out.println("<E> returnType : " + ClassName.genericMethod(3).getClass().getTypeName());

        /*
            지금까지는 제네릭의 가장 일반적인 예시를 보여주었다 예를들어 타입을 T라고 하고 욉부클래스에서 Integer
             을 파라미터로 보내면 T 는 Integer가 되고, String을 보내면 T는 String이 된다. 만약 당신이 Student라는 클래스를
             만들었을 때 T 마라미터를 Student로 보내면  T는 Student가 된다. 즉, 제네릭은 참조 타입 모두 될 수 있다.
             근데 만약 특정 범위 내로 좁혀서 제한하고 싶다면 어떻게 해야할까?

             이 때 필요한 것이 바로 extends 와 super, 그리고 ?(물음표)다. 알수없는 타입이라는 의미이다.


         */






    }

}




public class Stack<R> {
        public R[] nilai;
        public int top = 0;

        public Stack(int n) {
            nilai = (R[]) new Object[n];
        }

        public boolean nol() {
            return top == 0;
        }

        public boolean satu() {
            return top == nilai.length;

        }
        public void push(R value) {
            if (!satu()) {
                nilai[top] = value;
                top = top + 1;
            } else {
                System.out.println("Stack Penuh");
            }
        }

        public R pop() {
            if (!nol()) {
                top = top-1;
                R r = nilai[top];
                return r;
            } else {
                return null;
            }
        }

        public R cek() {
            if (!nol()) {
                return nilai[top - 1];
            } else {
                return null;
            }
        }
}

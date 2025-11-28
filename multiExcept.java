public class multiExcept {
    public static void main(String[] args) {

        // now there i am going to check the multiple exception that are present in the
        // java
        for (int i = 1; i <= 3; i++) {
            try {
                switch (i) {
                    case 1:
                        int arr[] = new int[5];
                        System.out.println(arr[10]);
                        break;

                    case 2:
                        String str = "utkarsh";
                        System.out.println(str.charAt(12));
                        break;

                    case 3:
                        int a = 10;
                        int b = 0;
                        System.out.println(a / b);
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException aie) {
                System.out.println("the array must contain any kind of the error");
            }

            catch (StringIndexOutOfBoundsException sie) {
                System.out.println("the string must contain a type of the error");
            }

            catch (ArithmeticException ae) {
                System.out.println("the problem are in the number");
            }

        }

    }
}

// Arithmetic Exception -- this is the exception which is used to call when the
// number is divided by the zero
// ArrayIndexOutOfBoundsException -- this is the error which is caught when the
// array is out of the index
// StringIndexOutOfBoundsException -- this is the error which is generated when
// the string is out of the bounds

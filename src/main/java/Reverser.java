public class Reverser implements CharSequence {

    private CharSequence reversed;
    private CharSequence input;

    public CharSequence getReversed() {
        return reversed;
    }

    public Reverser(CharSequence input){
        this.input=input;
        this.reversed=this.reverse();

    }

    public CharSequence reverse() {
        StringBuilder stringBuilder=new StringBuilder(this.input);
       /* CharSequence provisional="";
        StringBuilder stringBuilder=new StringBuilder(provisional);
        for (int i=this.input.length()-1;i>=0;i--) {


            stringBuilder.append(this.input.charAt(i));

        };
        provisional=stringBuilder.*/
    return (CharSequence)stringBuilder.reverse().toString();}


    public int length() {

        return this.input.length();
    }

    public char charAt(int index) {
        return this.input.charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        return this.input.subSequence(start,end);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

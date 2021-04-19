package size;

// The size used in shoes and feet. 
public class Size {

    private int length; // lets keep these 0-10
    private int width; // lets keep these 0-10
    private int arch; // Low - 0; Medium - 1; High - 2; Extra-High - 3;

    public Size(int length, int width, int arch) {
        this.length = length;
        this.width = width;
        this.arch = arch;
    }

    // Stringifies the sizes and checks if they are equal
    public boolean isEqual(Size size) {
        return this.getWidth() == size.getWidth() && this.getLength() == size.getLength() && this.getArch() == size.getArch();
    }

    // Returns itself for chaining assignment. Ex: new Size().setWidth(5).setLength(2);
    public Size setLength(int length) {
        this.length = length;
        return this;
    }


    // Returns itself for chaining assignment. Ex: new Size().setWidth(5).setLength(2);
    public Size setWidth(int width) {
        this.width = width;
        return this;
    }

    // Returns itself for chaining assignment. Ex: new Size().setWidth(5).setLength(2);
    public Size setArch(int arch) {
        this.arch = arch;
        return this;
    }

    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public int getArch() {
        return arch;
    }

    public String stringifySize() {
        return "Length: " +
                length +
                "\n Width: " +
                width +
                "\n Arch: " +
                arch;
    }

}

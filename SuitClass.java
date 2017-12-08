import hsa.Console;
import java.awt.*;

public abstract class SuitClass extends ShapeClass {
    public void setWidth(int iNewWidth) {
	setWidth(iNewWidth);
	setHeight((int) (5 * iNewWidth / 4));
    }

    public void setHeight(int iNewHeight) {
	setHeight(iNewHeight);
	setWidth((int) (4 * iNewHeight / 5));
    }
}
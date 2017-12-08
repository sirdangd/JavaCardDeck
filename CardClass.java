import hsa.Console;
import java.awt.*;
import DiamondClass.java;
import HeartClass.java;
import SpadeClass.java;
import ClubClass.java;

class CardClass extends SuitClass
{
    protected int faceValue, cardCentreX, cardCentreY, cardSize, suitValue, cardHeight, midValX, midValY;
    protected boolean isShowing, isFaceUp;

    public void setFaceValue (int cardVaue) {
        if(cardValue >= 1 && cardValue <= 13) {
            faceValue = cardValue;
        }else {
            faceValue = -1;
        }        
    }

    public int getFaceValue () {
        return faceValue;
    }

    public void setCardCentre (int x,y) {
        setCentre(x,y);
    }

    public void setCardSize (int cardSize) {
        if (cardSize == 1) {
            cardHeight == 60;
        }else if(cardSize = 2) {
            cardHeight == 80;
        }else if(cardSize == 3) {
            cardHeight == 100;
        }else if (cardSize == 4) {
            cardHeight = 120;
        }
    }

    public int getCardSize () {
        return cardHeight;
    }

    public void setSuitValue(int newSuitValue) {
        suitValue = newSuitValue;
    }

    public int getSuitValue() {
        return suitValue;
    }

    public void setMidValue () {
        midValX = iCentreX + (int)(cardHeight * 0.7);
        midValY = iCentreY + cardHeight;
    }

    public int getMidValueX () {
        int answerX = (int)((iCentreX + midValX) / 2);
        return answerX;
    }

    public int getMidValueY () {
        int answerY = (int)((iCentreY + midValY) / 2);
        return answerY;
    }

    public void draw(Console c) {
        int x2, y2, midx, midy, ascent, descent, interlleading, externalleading;

        DiamondClass d = new DiamondClass();
        HeartClass h = new HeartClass();
        ClubClass cl = new ClubClass();
        SpadeClass s = new SpadeClass();

        if (isFaceUp) {
            if(getSuitValue() == 1) {
                if(iColour != Color.white) {
                    setColour(Color.red);
                }
                d.setCentre(getMidValueX(), getMidValueY());
                d.setHeight((int)(cardHeight*0.25));
                d.setWidth((int)((CardHeight * 0.25) * (4 / 5)));
                d.draw(c);
            }else if(getSuitValue() == 2) {
                if(iColour != Color.white) {
                    setColour(Color.black);
                }
                cl.setCentre(getMidValueX(), getMidValueY());
                cl.setHeight((int)(cardHeight*0.25));
                cl.setWidth((int)((CardHeight * 0.25) * (4 / 5)));
                cl.draw(c);
            }else if (getSuitValue() == 3) {
                if(iColour != Color.white) {
                    setColour(Color.red);
                }
                h.setCentre(getMidValueX(), getMidValueY());
                h.setHeight((int)(cardHeight*0.25));
                h.setWidth((int)((CardHeight * 0.25) * (4 / 5)));
                h.draw(c);
            }else if (getSuitValue() == 4) {
                if(iColour != Color.white) {
                    setColour(Color.black);
                }
                s.setCentre(getMidValueX(), getMidValueY());
                s.setHeight((int)(cardHeight*0.25));
                s.setWidth((int)((CardHeight * 0.25) * (4 / 5)));
                s.draw(c);
            }
            x2 = (int)(iCentreX + (0.7 * cardHeight));
            y2 = iCentreY + cardHeight;
            Color oldColour = getColour();
            setColour(Color.black);
            c.setColour(iColour);
            c.drawRect(iCentreX, iCentreY, (int)(cardHeight * 0.7), cardHeight)
            setColour(oldColour);

        }


    }

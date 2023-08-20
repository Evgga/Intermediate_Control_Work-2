package Toys_Shop.core.view;

import Toys_Shop.core.control.BasicControl;


public interface BasicView {
    public void start(BasicControl control, String text);

    public BasicControl getControl();
}

package com.game.base.impl;

import com.game.base.IModel;
import com.game.base.IUnit;

/**
 * Created with IntelliJ IDEA.
 * User: xianliu.wy
 * Date: 13-11-26
 * Time: 下午7:49
 * To change this template use File | Settings | File Templates.
 */
public class BaseUnit implements IUnit {
    private String code;
    private String unitName;
    private IModel model;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public IModel getModel() {
        return model;
    }

    public void setModel(IModel model) {
        this.model = model;
    }

    @Override
    public void load() {
        System.out.println("load unit:"+unitName);
        model.load();

    }

    @Override
    public void draw() {
        System.out.println("draw unit:"+unitName);
        model.draw();
    }

    @Override
    public String getID() {
        return this.getID();
    }
}

package com.wangjiegulu.rapidooo.library.compiler.objs;

import com.wangjiegulu.rapidooo.library.compiler.base.contract.FakeElementStuff;
import com.wangjiegulu.rapidooo.library.compiler.base.contract.IElementStuff;

import javax.lang.model.element.Element;

/**
 * Author: wangjie
 * Email: tiantian.china.2@gmail.com
 * Date: 12/04/2018.
 */
public class FromField {
    private TargetElement ownerTargetElement;
    private Element fieldOriginElement;
    private FromFieldConversion fromFieldConversion;
    private IElementStuff targetElementStuff;

    public void parse(){
        targetElementStuff = new FakeElementStuff(fromFieldConversion.getTargetType(), fromFieldConversion.getTargetFieldName());
    }

    public Element getFieldOriginElement() {
        return fieldOriginElement;
    }

    public void setFieldOriginElement(Element fieldOriginElement) {
        this.fieldOriginElement = fieldOriginElement;
    }

    public FromFieldConversion getFromFieldConversion() {
        return fromFieldConversion;
    }

    public void setFromFieldConversion(FromFieldConversion fromFieldConversion) {
        this.fromFieldConversion = fromFieldConversion;

    }

    public IElementStuff getTargetElementStuff() {
        return targetElementStuff;
    }

    public TargetElement getOwnerTargetElement() {
        return ownerTargetElement;
    }

    public void setOwnerTargetElement(TargetElement ownerTargetElement) {
        this.ownerTargetElement = ownerTargetElement;
    }

    @Override
    public String toString() {
        return "FromField{" +
                "fieldOriginElement=" + fieldOriginElement +
                ", fromFieldConversion=" + fromFieldConversion +
                '}';
    }

}

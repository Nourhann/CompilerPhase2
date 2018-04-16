/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiler_phase2;

import java.util.ArrayList;

/**
 *
 * @author norhan
 */
public class node {
    private String Value;
    private String Type;
    private ArrayList<node> children = new ArrayList<node>() ;

    public void setChildren(ArrayList<node> children) {
        this.children = children;
    }
     public void AddChildren (node child) {
        this.children.add(child);
    }
    public ArrayList<node> getChildren() {
        return children;
    }

    public node(String Value, String Type) {
        this.Value = Value;
        this.Type = Type;
    }

    public String getValue() {
        return Value;
    }

    public String getType() {
        return Type;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public void setType(String Type) {
        this.Type = Type;
    }
    
}

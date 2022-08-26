package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String filename = "program.py";
        Editor editor = Editor.getEditor(filename);

        filename = "program.cpp";
        editor = Editor.getEditor(filename);

        editor.closeEditor();

        filename = "program.cpp";
        editor = Editor.getEditor(filename);
    }
}


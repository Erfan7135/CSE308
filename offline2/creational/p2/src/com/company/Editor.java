package com.company;

public class Editor {

    private static Editor editor = null;

    private String filename;
    private Parser parser;
    private Font font;


    private  Editor(String filename) {

        this.filename = filename;
        parser = Factory.getParser(filename);
        font = FontFactory.getFont(filename);

    }

    public static Editor getEditor(String filename) {
        if(editor == null) {
            System.out.println("Creating new editor");
            editor = new Editor(filename);
            return editor;
        }
        System.out.println("");
        System.out.println("An instance of editor already exists.  ");
        System.out.println(filename+ " can't be executed");
        System.out.println("Current file : " + editor.filename);
        System.out.println("Current Parser : " + editor.parser.getClass().getSimpleName());
        System.out.println("Current Font : " + editor.font.getClass().getSimpleName());
        System.out.println("");
        return editor;
    }
    public static void closeEditor() {
        Editor.editor = null;
        System.out.println("Current Editor Instance is closed");
        System.out.println("");
    }

}

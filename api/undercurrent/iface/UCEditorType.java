package api.undercurrent.iface;

import java.net.URL;

/**
 * Created by Niel on 10/16/2015.
 */
public abstract class UCEditorType {

    public EditorTypes editorType;
    public String fieldName;
    public String displayName;
    public String displayDescription;
    public Object fieldValue;
    public String editorGroup;
    public URL image;

    public UCEditorType(EditorTypes editorType, String editorGroup, URL image) {
        this.editorType = editorType;
        this.editorGroup = editorGroup;
    }

    public abstract boolean validateValue(Object obj) throws Exception;

    public abstract Object getFieldValue();

    public enum EditorTypes {
        STRING, INT, DOUBLE, FLOAT, BOOLEAN, INFO, LIST
    }

    public EditorTypes getEditorType() {
        return editorType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDisplayDescription() {
        return displayDescription;
    }

}

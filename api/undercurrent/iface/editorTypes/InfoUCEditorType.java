package api.undercurrent.iface.editorTypes;

import api.undercurrent.iface.UCEditorType;

import java.net.URL;

/**
 * Created by Niel on 10/16/2015.
 */
public class InfoUCEditorType extends UCEditorType {

    public InfoUCEditorType(String fieldName, String displayName, String displayDescription, String fieldValue, String editorGroup, URL image) throws Exception {
        super(EditorTypes.INFO, editorGroup, image);
        this.fieldName = fieldName;
        this.displayName = displayName;
        this.displayDescription = displayDescription;
        this.fieldValue = fieldValue;
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

    public String getFieldValue() {
        return (String) fieldValue;
    }

    @Override
    public boolean validateValue(Object obj) throws Exception {
        return false;
    }
}


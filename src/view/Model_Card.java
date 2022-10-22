package view;

import javax.swing.Icon;


public class Model_Card {
    private Icon icon;
    private String title;
    private String Values;
    private String descriptions;

    public Model_Card(Icon icon,String title,String Values, String description){
        this.icon=icon;
        this.title=title;
        this.Values=Values;
        this.descriptions=descriptions;
        
        
        
    }
    
    /**
     * @return the icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * @param icon the icon to set
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the Values
     */
    public String getValues() {
        return Values;
    }

    /**
     * @param Values the Values to set
     */
    public void setValues(String Values) {
        this.Values = Values;
    }

    /**
     * @return the descriptions
     */
    public String getDescriptions() {
        return descriptions;
    }

    /**
     * @param descriptions the descriptions to set
     */
    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }


    
}

package seedu.addressbook.data.person;

public interface Printable {
    
    default String getPrintableString() {
        String combine = "";
        String[] arg = null;
        for (int i = 0; i < arg.length; i++) {
            combine += arg[i];
        } 
    return combine;
    }
}

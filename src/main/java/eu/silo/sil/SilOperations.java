package eu.silo.sil;

/**
 * Interface of commands that are available via the Roo shell.
 *
 * @since 1.1.1
 */
public interface SilOperations {

    /**
     * Indicate of the install tags command should be available
     * 
     * @return true if it should be available, otherwise false
     */
    boolean isInstallTagsCommandAvailable();

    /**
     * @param propertyName to obtain (required)
     * @return a message that will ultimately be displayed on the shell
     */
    String getProperty(String propertyName);
    
    /**
     * Install tags used for MVC scaffolded apps into the target project.
     */
    void installTags();

    void createProject(String projectname, String packagename, String dbtype, String dbname , String dbusername, String dbpassword);

    void setupprerequisites();

}//EoInterface
/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package proyectogradle;

import org.gradle.testfixtures.ProjectBuilder;
import org.gradle.api.Project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * A simple unit test for the 'proyectogradle.greeting' plugin.
 */
class ProyectoGradlePluginTest {
    @Test void pluginRegistersATask() {
        // Create a test project and apply the plugin
        Project project = ProjectBuilder.builder().build();
        project.getPlugins().apply("proyectogradle.greeting");

        // Verify the result
        assertNotNull(project.getTasks().findByName("greeting"));
    }
}
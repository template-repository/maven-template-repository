package com.github.romankh3.maventemplaterepository;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit-level testing for {@link MavenTemplateRepository} object.
 */
public class MavenTemplateRepositoryTest {

    @Test
    public void shouldCreateJavaRepositoryTemplateMain() {
        MavenTemplateRepository main = new MavenTemplateRepository();
        Assert.assertNotNull(main);
    }

}

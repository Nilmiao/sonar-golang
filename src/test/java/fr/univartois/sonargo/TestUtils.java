/*******************************************************************************
 * Copyright 2017 - Université d'Artois
 *
 * This file is part of SonarQube Golang plugin (sonar-golang).
 *
 * Sonar-golang is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Sonar-golang is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Sonar-golang.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Contributors:
 *            Thibault Falque (thibault_falque@ens.univ-artois.fr)
 *******************************************************************************/
package fr.univartois.sonargo;

import java.io.File;

import org.sonar.api.batch.fs.internal.DefaultFileSystem;

public class TestUtils {
    private static final String TEST_RESSOURCES = "src/test/resources";
    private static final String COVERAGE_REPORT_PATH = "coverage";
    private static final String TEST_PATH = "gotest";
    private static final String HIGLIGHTER_CODE_PATH = "highlighter";

    public static DefaultFileSystem getDefaultFileSystem() {
	return new DefaultFileSystem(getModuleBaseDir());
    }

    public static DefaultFileSystem getTestBaseDir() {
	return new DefaultFileSystem((new File(TEST_RESSOURCES + File.separator + TEST_PATH)).getAbsoluteFile());
    }

    public static DefaultFileSystem getCoverageBaseDir() {
	return new DefaultFileSystem(new File(TEST_RESSOURCES + File.separator + COVERAGE_REPORT_PATH));
    }

    public static DefaultFileSystem getColorizeDir() {
	return new DefaultFileSystem(new File(TEST_RESSOURCES + File.separator + HIGLIGHTER_CODE_PATH));
    }

    public static File getModuleBaseDir() {
	return new File(TEST_RESSOURCES);
    }

}

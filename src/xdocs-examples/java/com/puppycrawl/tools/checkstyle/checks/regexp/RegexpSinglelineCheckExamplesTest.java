///////////////////////////////////////////////////////////////////////////////////////////////
// checkstyle: Checks Java source code and other text files for adherence to a set of rules.
// Copyright (C) 2001-2025 the original author or authors.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
// Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this library; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
///////////////////////////////////////////////////////////////////////////////////////////////

package com.puppycrawl.tools.checkstyle.checks.regexp;

import static com.puppycrawl.tools.checkstyle.checks.regexp.RegexpCheck.MSG_ILLEGAL_REGEXP;

import org.junit.jupiter.api.Test;

import com.puppycrawl.tools.checkstyle.AbstractExamplesModuleTestSupport;

public class RegexpSinglelineCheckExamplesTest extends AbstractExamplesModuleTestSupport {
    @Override
    protected String getPackageLocation() {
        return "com/puppycrawl/tools/checkstyle/checks/regexp/regexpsingleline";
    }

    @Test
    public void testExample1() throws Exception {
        final String[] expected = {

        };

        verifyWithInlineConfigParser(getPath("Example1.java"), expected);
    }

    @Test
    public void testExample2() throws Exception {
        final String[] expected = {

        };

        verifyWithInlineConfigParser(getPath("Example2.java"), expected);
    }

    @Test
    public void testExample3() throws Exception {
        final String[] expected = {
            "19: " + getCheckMessage(MSG_ILLEGAL_REGEXP, "System.exit\\("),
        };

        verifyWithInlineConfigParser(getPath("Example3.java"), expected);
    }

    @Test
    public void testExample4() throws Exception {
        final String[] expected = {

        };

        verifyWithInlineConfigParser(getPath("Example4.java"), expected);
    }

    @Test
    public void testExample5() throws Exception {
        final String[] expected = {
            "1: File must contain copyright statement",
        };

        verifyWithInlineConfigParser(getPath("Example5.java"), expected);
    }

    @Test
    public void testExample6() throws Exception {
        final String[] expected = {

        };

        verifyWithInlineConfigParserSeparateConfigAndTarget(
                getPath("Example6.java"), getPath("Example6.sql"), expected);
    }

    @Test
    public void testExample7() throws Exception {
        final String[] expected = {
            "1: File must contain at least one occurrence of license term",
        };

        verifyWithInlineConfigParserSeparateConfigAndTarget(
                getPath("Example6.java"), getPath("Example7.sql"), expected);
    }
}

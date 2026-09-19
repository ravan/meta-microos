SUMMARY = "A Java template engine"
DESCRIPTION = "StringTemplate is a java template engine (with ports for \
C# and Python) for generating source code, web pages, \
emails, or any other formatted text output. StringTemplate \
is particularly good at multi-targeted code generators, \
multiple site skins, and internationalization/localization."
LICENSE = "BSD-3-Clause"

PV = "4.3.3"

RPM_NAME = "stringtemplate4-4.3.3-3.6.noarch.rpm"
RPM_HASH = "7f85ded16b5224c60cb6bf0244b60413069206757916fd2b4098bf009837044ca1b5c13759548dfdfbad48cf8b9e626507fe61c77d2ba77bf9d3a4e005f38a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.antlr-ST4 \
mvn-org.antlr-ST4-pom- \
stringtemplate4"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-antlr-antlr \
mvn-org.antlr-antlr-runtime"

inherit rpm

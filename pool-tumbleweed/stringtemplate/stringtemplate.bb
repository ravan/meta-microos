SUMMARY = "A Java template engine"
DESCRIPTION = "StringTemplate is a java template engine (with ports for \
C# and Python) for generating source code, web pages, \
emails, or any other formatted text output. StringTemplate \
is particularly good at multi-targeted code generators, \
multiple site skins, and internationalization/localization."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "stringtemplate-3.2.1-4.8.noarch.rpm"
RPM_HASH = "51f5e905caaf6cef721ed5a4f103327daaf09b4ecf45325ce780c92689a667d1abfef50712ca621cc0058ea4c0efa16b516deafad53f333c788345080bfc2ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.antlr-stringtemplate \
mvn-org.antlr-stringtemplate-pom- \
stringtemplate"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-antlr-antlr"

inherit rpm

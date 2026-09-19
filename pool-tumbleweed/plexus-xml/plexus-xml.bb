SUMMARY = "Plexus XML Utilities"
DESCRIPTION = "A collection of various utility classes to ease working with XML in Maven 3. \
This library consists of XML classes (org.codehaus.plexus.util.xml) that \
have been extracted from plexus-utils 3: \
  * plexus-utils 3 = plexus-utils 4 + plexus-xml 3."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "plexus-xml-3.1.0-1.1.noarch.rpm"
RPM_HASH = "9553474841bd51244207bcf8e0e565c9a599bb62250ed74e60f4d26f91b935b34d4d1372a0558354e1e9ac9da6dd9f620d23606772ffcc92fb8922dbf4bbe458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-xml \
mvn-org.codehaus.plexus-plexus-xml-pom- \
plexus-xml"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

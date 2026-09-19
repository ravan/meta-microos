SUMMARY = "The Properties Maven Plugin"
DESCRIPTION = "The Properties Maven Plugin is here to make life a little easier when dealing \
with properties. It provides goals to read properties from files and URLs and \
write properties to files, and also to set system properties. \
 \
It’s main use-case is loading properties from files or URLs instead of \
declaring them in pom.xml, something that comes in handy when dealing with \
different environments."
LICENSE = "Apache-2.0"

PV = "1.1.0"

RPM_NAME = "properties-maven-plugin-1.1.0-1.4.noarch.rpm"
RPM_HASH = "6bd9c1f470f5cf68e9dbd4d81058188630b452f2192dd2d5a02b00e574cd44fc5a9a427c1be162e0ffc7fb764e981a056245c04e626850822b453efadadbd856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.mojo-properties-maven-plugin \
mvn-org.codehaus.mojo-properties-maven-plugin-pom- \
properties-maven-plugin"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.plexus-plexus-utils"

inherit rpm

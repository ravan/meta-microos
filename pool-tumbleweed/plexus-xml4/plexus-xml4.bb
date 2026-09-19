SUMMARY = "Plexus XML Utilities"
DESCRIPTION = "A collection of various utility classes to ease working with XML in Maven 4."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "plexus-xml4-4.1.1-1.4.noarch.rpm"
RPM_HASH = "9069786be8a76b32330b09eacde55ad818fdb279b367c77c43fc55c71b0ca12c129f7a7c5973c7bd8849be9038a7fee07b0953646e46510f5ace73f766563918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-xml-4 \
mvn-org.codehaus.plexus-plexus-xml-4.1.1 \
mvn-org.codehaus.plexus-plexus-xml-pom-4 \
mvn-org.codehaus.plexus-plexus-xml-pom-4.1.1 \
plexus-xml4"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven-maven-xml"

inherit rpm

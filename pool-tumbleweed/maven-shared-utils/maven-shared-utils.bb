SUMMARY = "Maven shared utility classes"
DESCRIPTION = "This project aims to be a functional replacement for plexus-utils in Maven. \
 \
It is not a 100% API compatible replacement though but a replacement with \
improvements: lots of methods got cleaned up, generics got added and we dropped \
a lot of unused code."
LICENSE = "Apache-2.0"

PV = "3.4.2"

RPM_NAME = "maven-shared-utils-3.4.2-1.10.noarch.rpm"
RPM_HASH = "c4e6c21cd5679e23738ce206bfbb152d5647955f7d139843ef52384ce3322cb60d0652b609a5644d09523907339629043dfa4e53ff0514a1ad11bffa91b6066d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-shared-utils \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.shared-maven-shared-utils-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.slf4j-slf4j-api"

inherit rpm

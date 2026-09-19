SUMMARY = "SLF4J Source JARs"
DESCRIPTION = "SLF4J Source JARs."
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.18"

RPM_NAME = "slf4j-sources-2.0.18-1.2.noarch.rpm"
RPM_HASH = "cd8531f6b9855797568bbb8f261bc353c8fa99b412c6fb0e5050ef27dd8d23999bbba539ac4e7edafd0c7cc9404c63483b72537109d0151ba9512346e4fc27e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-jcl-over-slf4j--sources- \
mvn-org.slf4j-jul-to-slf4j--sources- \
mvn-org.slf4j-log4j-over-slf4j--sources- \
mvn-org.slf4j-slf4j-api--sources- \
mvn-org.slf4j-slf4j-ext--sources- \
mvn-org.slf4j-slf4j-jdk-platform-logging--sources- \
mvn-org.slf4j-slf4j-jdk14--sources- \
mvn-org.slf4j-slf4j-migrator--sources- \
mvn-org.slf4j-slf4j-nop--sources- \
mvn-org.slf4j-slf4j-reload4j--sources- \
mvn-org.slf4j-slf4j-simple--sources- \
slf4j-sources"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

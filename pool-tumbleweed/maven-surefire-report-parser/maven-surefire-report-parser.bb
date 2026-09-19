SUMMARY = "Parses report output files from surefire"
DESCRIPTION = "Plugin for parsing report output files from surefire."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "3.6.0"

RPM_NAME = "maven-surefire-report-parser-3.6.0-1.1.noarch.rpm"
RPM_HASH = "cd8a26cb5810ae338f549a373f66d51cce870e8152581621a6c310ae0c91b384ffee9607294dfb6917c0c8927110b8aa67f479b7481f3da97eb32e6e2a10fc4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-report-parser \
mvn-org.apache.maven.surefire-surefire-report-parser \
mvn-org.apache.maven.surefire-surefire-report-parser-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.shared-maven-shared-utils \
mvn-org.apache.maven.surefire-surefire-logger-api"

inherit rpm

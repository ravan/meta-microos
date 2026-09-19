SUMMARY = "API to manage report generation"
DESCRIPTION = "API to manage report generation. Maven-reporting-api is included in Maven 2.x \
core distribution, but moved to shared components to achieve report decoupling \
from Maven 3 core. \
 \
This is a replacement package for maven-shared-reporting-api"
LICENSE = "Apache-2.0"

PV = "4.0.0"

RPM_NAME = "maven-reporting-api-4.0.0-1.8.noarch.rpm"
RPM_HASH = "e13ae839cd978e5dcfb2f88cf01251b68f4c2e092e9642ea1e966c64b47de1cf89649b5abfdc74448bec062a04f91da7671c35490b6846e3b24b50d3fd184785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-api \
mvn-org.apache.maven.reporting-maven-reporting-api \
mvn-org.apache.maven.reporting-maven-reporting-api-pom- \
mvn-org.apache.maven.shared-maven-reporting-api \
mvn-org.apache.maven.shared-maven-reporting-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.maven.doxia-doxia-sink-api"

inherit rpm

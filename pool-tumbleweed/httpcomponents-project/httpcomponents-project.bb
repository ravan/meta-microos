SUMMARY = "Common POM file for HttpComponents"
DESCRIPTION = "Common Maven POM  file for HttpComponents. This project should be \
required only for building dependent packages with Maven. Please don't \
use it as runtime requirement."
LICENSE = "Apache-2.0"

PV = "9"

RPM_NAME = "httpcomponents-project-9-1.19.noarch.rpm"
RPM_HASH = "828c1a079743688088b5aa0836f5ae356fd81b4ec91858572187ea35708330c8d1aad52fb1d6a7521e506c62c93711093e5ed42ed45873a796bd3536bc5e36af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "httpcomponents-project \
mvn-org.apache.httpcomponents-httpcomponents-parent-pom- \
mvn-org.apache.httpcomponents-project-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache-apache-pom-"

inherit rpm

SUMMARY = "Apache Maven parent POM"
DESCRIPTION = "Apache Maven parent POM file used by other Maven projects."
LICENSE = "Apache-2.0"

PV = "49"

RPM_NAME = "maven-parent-49-1.2.noarch.rpm"
RPM_HASH = "ceb635a9f961dda786bf06bbe24ab9e066da9c9c01e57d070c7fae45e704cb4e512f9352bfa5b3016ab7d8b4e86c9584c535b835a0ebf3227ff406ccb25ba02f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-parent \
maven-plugins-pom \
maven-shared \
mvn-org.apache.maven-maven-parent-pom- \
mvn-org.apache.maven.extensions-maven-extensions-pom- \
mvn-org.apache.maven.plugins-maven-plugins-pom- \
mvn-org.apache.maven.shared-maven-shared-components-pom- \
mvn-org.apache.maven.skins-maven-skins-pom-"

RDEPENDS:${PN} += "apache-parent \
java-headless \
javapackages-filesystem"

inherit rpm

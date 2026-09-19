SUMMARY = "Enforcer API"
DESCRIPTION = "This component provides the generic interfaces needed to \
implement custom rules for the maven-enforcer-plugin."
LICENSE = "Apache-2.0"

PV = "3.6.3"

RPM_NAME = "maven-enforcer-api-3.6.3-1.2.noarch.rpm"
RPM_HASH = "5dfe2d3c72dd9cd006dc840d3c9caedb00ae0b920487185ad507037318d406d74e95e5070cf31a7238e6f848c5da223aa79688cbb9d270b53ebd0396cdcb2611"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-enforcer-api \
mvn-org.apache.maven.enforcer-enforcer-api \
mvn-org.apache.maven.enforcer-enforcer-api-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

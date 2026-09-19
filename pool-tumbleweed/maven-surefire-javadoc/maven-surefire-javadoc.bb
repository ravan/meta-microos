SUMMARY = "Javadoc for maven-surefire"
DESCRIPTION = "Javadoc for maven-surefire."
LICENSE = "Apache-2.0 & CPL-1.0"

PV = "3.6.0"

RPM_NAME = "maven-surefire-javadoc-3.6.0-1.1.noarch.rpm"
RPM_HASH = "31258674c39f277133b7472b3edd4148412062a431c1c0efa838a6bebbffc16a737f99ac67d41dbee7416ed67dea8fba744af25820621002672097b693fc072e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-surefire-javadoc \
maven-surefire-provider-junit5-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm

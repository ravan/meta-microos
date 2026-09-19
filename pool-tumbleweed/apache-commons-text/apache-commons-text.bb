SUMMARY = "A library focused on algorithms working on strings"
DESCRIPTION = "Apache Commons Text is a library focused on algorithms working on strings."
LICENSE = "Apache-2.0"

PV = "1.15.0"

RPM_NAME = "apache-commons-text-1.15.0-1.3.noarch.rpm"
RPM_HASH = "5bc20ecf5ef0f8ea25618d33ef1f89324518cd05e311482cbea4445d49f2d38e88ffd4f8d49ad765a8c3c0c977e43b7803cb3f12c1ce019bc9c60219ec0f9f6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-text \
mvn-org.apache.commons-commons-text \
mvn-org.apache.commons-commons-text-pom- \
osgi-org.apache.commons.text"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3"

inherit rpm

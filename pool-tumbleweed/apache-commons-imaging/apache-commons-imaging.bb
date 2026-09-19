SUMMARY = "Apache Commons Imaging"
DESCRIPTION = "Apache Commons Imaging (previously Sanselan) is a pure-Java image library."
LICENSE = "Apache-2.0"

PV = "1.0.0~alpha6"

RPM_NAME = "apache-commons-imaging-1.0.0~alpha6-1.3.noarch.rpm"
RPM_HASH = "6902226c5efb249a0c8eb84ef99d0f9d036503001c0c11e40c0aaa6fd8c3418ffd308c7371ce0ee2480ed85ec10f098f506d1e19f9c7ad18eec27d61e5cb1ec7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-imaging \
mvn-org.apache.commons-commons-imaging \
mvn-org.apache.commons-commons-imaging-pom- \
osgi-org.apache.commons.commons-imaging"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.commons-commons-lang3"

inherit rpm

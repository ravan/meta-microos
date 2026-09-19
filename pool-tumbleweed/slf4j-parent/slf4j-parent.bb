SUMMARY = "SLF4J Parent POM"
DESCRIPTION = "SLF4J project parent pom.xml file"
LICENSE = "Apache-2.0 & MIT"

PV = "2.0.18"

RPM_NAME = "slf4j-parent-2.0.18-1.2.noarch.rpm"
RPM_HASH = "b9fd01a96c3fd0b02e328b167b0d95e5b69dda6b2eba1da06eb40c18677ff80a4a073f47481125dfca01328358c26138130961726fa15eaec1842e37521312c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.slf4j-slf4j-parent-pom- \
slf4j-parent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

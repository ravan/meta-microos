SUMMARY = "Optional jakartamail tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional jakartamail tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-jakartamail-1.10.18-1.1.noarch.rpm"
RPM_HASH = "32b0c07cb17ae5ec2185349eb42f62663747426d0c1ee69294820f9c56cbbce80f3af44532e7c2440dbc1ed765c40e3428843a19e97dd996ead54ba5d9e77dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-jakartamail \
config-ant-jakartamail \
mvn-org.apache.ant-ant-jakartamail \
mvn-org.apache.ant-ant-jakartamail-pom-"

RDEPENDS:${PN} += "ant \
jakarta-mail \
java-headless \
javapackages-filesystem \
mvn-com.sun.mail-jakarta.mail \
mvn-org.apache.ant-ant"

inherit rpm

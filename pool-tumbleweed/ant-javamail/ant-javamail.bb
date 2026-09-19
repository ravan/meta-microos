SUMMARY = "Optional javamail tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional javamail tasks for Apache Ant."
LICENSE = "CDDL-1.0"

PV = "1.10.18"

RPM_NAME = "ant-javamail-1.10.18-1.1.noarch.rpm"
RPM_HASH = "5127251ac9479f423577c6661e2bc1b381ce4cfdd4d50fe1f0f35ed443b765c7f2105ea72e20e756a4c8fa460ba9bba8d6c71c8cd126cac4723f28a870e139a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-javamail \
config-ant-javamail \
mvn-org.apache.ant-ant-javamail \
mvn-org.apache.ant-ant-javamail-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javamail \
javapackages-filesystem \
mvn-com.sun.mail-javax.mail \
mvn-org.apache.ant-ant"

inherit rpm

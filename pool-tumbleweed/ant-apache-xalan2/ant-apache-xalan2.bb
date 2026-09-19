SUMMARY = "Optional apache xalan2 tasks for ant"
DESCRIPTION = "Optional apache xalan2 tasks for ant-antlr."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-apache-xalan2-1.10.18-1.1.noarch.rpm"
RPM_HASH = "e941446fe8b17f38fbf386d8c253cdfe4d02bd5da342850cd37df14f6d9d7f955e7c95dff76a6adde2c43f13632c45d2e86be7b54fb9b2424ac2cae7bf15d087"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-xalan2 \
config-ant-apache-xalan2 \
mvn-org.apache.ant-ant-apache-xalan2 \
mvn-org.apache.ant-ant-apache-xalan2-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-xalan-serializer \
mvn-xalan-xalan \
regexp"

inherit rpm

SUMMARY = "Optional apache bsf tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache bsf tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-apache-bsf-1.10.18-1.1.noarch.rpm"
RPM_HASH = "ce99ad78e0e0502903cd2676e04d3f287e2bca0dee462dcc8a7adea8edd24ef8e6dea30d5ccbc876ff2b0b9bf629ad6ae39e700039ac55b64951cc64e6a078d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-bsf \
config-ant-apache-bsf \
mvn-org.apache.ant-ant-apache-bsf \
mvn-org.apache.ant-ant-apache-bsf-pom-"

RDEPENDS:${PN} += "ant \
bsf \
java-headless \
javapackages-filesystem \
mvn-bsf-bsf \
mvn-org.apache.ant-ant"

inherit rpm

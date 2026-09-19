SUMMARY = "Test utility classes for ant"
DESCRIPTION = "Test utility tasks for ant-antlr."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-testutil-1.10.18-1.1.noarch.rpm"
RPM_HASH = "b67c8e929e97be0623b8927bf7a6d86edfb0f2de3fca922e03560ba9874820d5104cfeaaaaaab2971e7c809c8aeb3883dde9b9c6fb61458e9a215d89a25cc901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-testutil \
config-ant-testutil \
mvn-org.apache.ant-ant-testutil \
mvn-org.apache.ant-ant-testutil-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
junit4 \
mvn-junit-junit \
mvn-org.apache.ant-ant"

inherit rpm

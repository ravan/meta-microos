SUMMARY = "The Apache Commons Extension Language"
DESCRIPTION = "An implementation of standard interfaces and abstract classes for \
javax.servlet.jsp.el which is part of the JSP 2.0 specification."
LICENSE = "Apache-1.1"

PV = "1.0"

RPM_NAME = "apache-commons-el-1.0-5.8.noarch.rpm"
RPM_HASH = "0aeb7625d1a1cf305b49d0bbffcd416bce5c8a6b6c308fe2300a53381720d0b718caf4ebd19de34eb74b002bbdb0599d64f0388a3dc52faf954eea113522bb87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-el \
commons-el \
jakarta-commons-el \
mvn-commons-el-commons-el \
mvn-commons-el-commons-el-pom- \
mvn-org.apache.commons-commons-el \
mvn-org.apache.commons-commons-el-pom- \
osgi-org.apache.commons.el"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-logging-commons-logging"

inherit rpm

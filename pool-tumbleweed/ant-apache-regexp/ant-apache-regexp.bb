SUMMARY = "Optional apache regexp tasks for ant"
DESCRIPTION = "Apache Ant is a Java-based build tool. \
 \
This package contains optional apache regexp tasks for Apache Ant."
LICENSE = "Apache-2.0"

PV = "1.10.18"

RPM_NAME = "ant-apache-regexp-1.10.18-1.1.noarch.rpm"
RPM_HASH = "d0acefc449e0afbe652ed68c05611eebf7db64ccc7ceb0fe9e0c7f48a695c0d0d976340257a058be16ba5798856b8e3d9bac18852d74044c28091f3f393fff29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-apache-regexp \
ant-jakarta-regexp \
config-ant-apache-regexp \
mvn-org.apache.ant-ant-apache-regexp \
mvn-org.apache.ant-ant-apache-regexp-pom-"

RDEPENDS:${PN} += "ant \
java-headless \
javapackages-filesystem \
mvn-jakarta-regexp-jakarta-regexp \
mvn-org.apache.ant-ant \
regexp"

inherit rpm

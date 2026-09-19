SUMMARY = "Apache Chainsaw"
DESCRIPTION = "Graphical Viewer for Logging events from a local or remote log4j event system."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "apache-chainsaw-2.1.0-5.10.noarch.rpm"
RPM_HASH = "9b70f9c4f61f436ffd0ffccc0c66ce6c73980dae3a06aa7cb97bd6c66ba27b11ee3501aebaead6e122191bc281359b2a1e7d950154cd66b125d997bf909ec94b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-chainsaw \
chainsaw \
mvn-log4j-apache-chainsaw \
mvn-log4j-apache-chainsaw-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
apache-commons-logging \
apache-commons-vfs2 \
apache-log4j-extras \
java-headless \
javapackages-filesystem \
javapackages-tools \
jmdns \
jsch \
mvn-com.jcraft-jsch \
mvn-com.thoughtworks.xstream-xstream \
mvn-commons-logging-commons-logging \
mvn-javax.jmdns-jmdns \
mvn-log4j-apache-log4j-extras \
mvn-log4j-log4j \
mvn-org.apache.commons-commons-vfs2 \
reload4j \
slf4j \
xpp3 \
xpp3-minimal \
xstream"

inherit rpm

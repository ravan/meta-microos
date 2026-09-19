SUMMARY = "Apache Commons Logging"
DESCRIPTION = "The commons-logging package provides a simple, component oriented \
interface (org.apache.commons.logging.Log) together with wrappers for \
logging systems. The user can choose at runtime which system they want \
to use. In addition, a small number of basic implementations are \
provided to allow users to use the package standalone. \
commons-logging was heavily influenced by Avalon's Logkit and Log4J. The \
commons-logging abstraction is meant to minimize the differences between \
the two, and to allow a developer to not tie himself to a particular \
logging implementation."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "apache-commons-logging-1.4.0-1.2.noarch.rpm"
RPM_HASH = "4cd541491d82b5656eca6a96129b8096fc3942bba377b98131ef821ef322e6768e6b9fadced2872f5173c35158035e4b8ef12c36cc734c6f4af30e9a03136892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "apache-commons-logging \
commons-logging \
jakarta-commons-logging \
mvn-apache-commons-logging \
mvn-apache-commons-logging-adapters \
mvn-apache-commons-logging-api \
mvn-apache-commons-logging-pom- \
mvn-commons-logging-commons-logging \
mvn-commons-logging-commons-logging--adapters- \
mvn-commons-logging-commons-logging--api- \
mvn-commons-logging-commons-logging-adapters \
mvn-commons-logging-commons-logging-api \
mvn-commons-logging-commons-logging-pom- \
mvn-org.apache.commons-commons-logging \
mvn-org.apache.commons-commons-logging-adapters \
mvn-org.apache.commons-commons-logging-api \
mvn-org.apache.commons-commons-logging-pom- \
osgi-org.apache.commons.commons-logging"

RDEPENDS:${PN} += "java \
java-headless \
javapackages-filesystem"

inherit rpm

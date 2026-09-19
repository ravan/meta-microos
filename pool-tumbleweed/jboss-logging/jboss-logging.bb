SUMMARY = "The JBoss Logging Framework"
DESCRIPTION = "This package contains the JBoss Logging Framework."
LICENSE = "Apache-2.0"

PV = "3.4.1"

RPM_NAME = "jboss-logging-3.4.1-4.17.noarch.rpm"
RPM_HASH = "e5fe8d9f22a2db78afa38d13ad401ad9601b61ce7f72f1c9a704515b1902a7be181af9ba94c4874e0fa14a66c3e89e22c646585dd07b3c4f7fcadcc11f8d8efe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logging \
mvn-org.jboss.logging-jboss-logging \
mvn-org.jboss.logging-jboss-logging-pom- \
osgi-org.jboss.logging.jboss-logging"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

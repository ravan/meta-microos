SUMMARY = "JBoss Marshalling OSGi Bundle"
DESCRIPTION = "JBoss Marshalling OSGi Bundle."
LICENSE = "Apache-2.0 & LGPL-2.1-or-later"

PV = "1.4.11"

RPM_NAME = "jboss-marshalling-osgi-1.4.11-3.17.noarch.rpm"
RPM_HASH = "4dc8b2c999874b137dad082ceaa76a0217ea47376d0d98757d63c049dec3c4155393b3a58e506b2bd1c6d30b73f9b4d732d25e94b4a2f5d00f0fbd2e2f761af5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-marshalling-osgi \
mvn-org.jboss.marshalling-jboss-marshalling-osgi \
mvn-org.jboss.marshalling-jboss-marshalling-osgi-pom- \
osgi-org.jboss.marshalling.jboss-marshalling-osgi"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jboss.marshalling-jboss-marshalling \
mvn-org.jboss.marshalling-jboss-marshalling-river \
mvn-org.jboss.marshalling-jboss-marshalling-serial"

inherit rpm

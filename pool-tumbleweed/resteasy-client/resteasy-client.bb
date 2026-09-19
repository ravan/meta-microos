SUMMARY = "Client for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Client for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-client-3.0.26-4.17.noarch.rpm"
RPM_HASH = "7451e588a5b52dfdc219b4e2d1037a81780b4673b13529e87fb3bb767a5efd6c43e9bd248a9927e58e34ae7858c3567981d9b535ea24c6c62dbe37e2eca3d95e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jboss.resteasy-resteasy-client \
mvn-org.jboss.resteasy-resteasy-client-pom- \
resteasy-client"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jboss.logging-jboss-logging \
mvn-org.jboss.logging-jboss-logging-annotations \
mvn-org.jboss.logging-jboss-logging-processor \
mvn-org.jboss.resteasy-resteasy-jaxrs"

inherit rpm

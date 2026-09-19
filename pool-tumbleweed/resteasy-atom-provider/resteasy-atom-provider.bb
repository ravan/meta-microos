SUMMARY = "Module atom-provider for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Module atom-provider for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-atom-provider-3.0.26-4.17.noarch.rpm"
RPM_HASH = "e587132866f0ba0921aae803bd28a5d8eaa3c08a964c295cd1f103a5cfa1e547ba673ca1e248cb0fd76aaf45f528ea8d9e02859418316ac7488f955ec41ac8bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jboss.resteasy-resteasy-atom-provider \
mvn-org.jboss.resteasy-resteasy-atom-provider-pom- \
resteasy-atom-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jboss.logging-jboss-logging-annotations \
mvn-org.jboss.logging-jboss-logging-processor \
mvn-org.jboss.resteasy-resteasy-jaxb-provider \
mvn-org.jboss.resteasy-resteasy-jaxrs"

inherit rpm

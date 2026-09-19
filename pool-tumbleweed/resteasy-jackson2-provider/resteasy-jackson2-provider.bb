SUMMARY = "Module jackson2-provider for resteasy"
DESCRIPTION = " \
RESTEasy contains a JBoss project that provides frameworks to help \
build RESTful Web Services and RESTful Java applications. It is a fully \
certified and portable implementation of the JAX-RS specification. \
 \
This package contains Module jackson2-provider for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-jackson2-provider-3.0.26-4.17.noarch.rpm"
RPM_HASH = "938ca8235d3466883b764e20cc870404bf6d115140a99b19d50a5ba424a217ea0786f5347412320822b2b170bdf1b08e9952894ca5195550b4c25ad50890fc5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.jboss.resteasy-resteasy-jackson2-provider \
mvn-org.jboss.resteasy-resteasy-jackson2-provider-pom- \
resteasy-jackson2-provider"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.fasterxml.jackson.jaxrs-jackson-jaxrs-json-provider \
mvn-org.apache.tomcat-tomcat-servlet-api"

inherit rpm

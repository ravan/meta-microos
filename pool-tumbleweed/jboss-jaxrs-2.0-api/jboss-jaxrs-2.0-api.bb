SUMMARY = "JAX-RS 2.0: The Java API for RESTful Web Services"
DESCRIPTION = "JSR 339: JAX-RS 2.0: The Java API for RESTful Web Services."
LICENSE = "Apache-2.0 & (CDDL-1.0 | GPL-2.0-only)"

PV = "1.0.1"

RPM_NAME = "jboss-jaxrs-2.0-api-1.0.1-5.17.noarch.rpm"
RPM_HASH = "35db1c38538ac3efd8ac8076324b690e5c94c691ee66f613e68be043a4d70505d8ebff5e547a49c5223547b5dfd320503b772a2d2baa4e32076ad1f7b0871da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-jaxrs-2.0-api \
mvn-org.jboss.resteasy-jaxrs-api \
mvn-org.jboss.resteasy-jaxrs-api-pom- \
mvn-org.jboss.spec.javax.ws.rs-jboss-jaxrs-api-2.0-spec \
mvn-org.jboss.spec.javax.ws.rs-jboss-jaxrs-api-2.0-spec-pom- \
osgi-org.jboss.spec.javax.ws.rs.jboss-jaxrs-api-2.0-spec"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

SUMMARY = "JAX-RS API Specification (JSR 339)"
DESCRIPTION = "JAX-RS Java API for RESTful Web Services (JSR 339)."
LICENSE = "EPL-2.0 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "2.1.6"

RPM_NAME = "glassfish-jax-rs-api-2.1.6-2.10.noarch.rpm"
RPM_HASH = "38758c45b5e73332c11bb658ef4f93611b020b85e017c3f2badec740e1af8e7e846e114e82d5a8cdb2632305e7f9d6afc2a86bff6a4aa17293de8028ee537137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfish-jax-rs-api \
mvn-jakarta.ws.rs-jakarta.ws.rs-api \
mvn-jakarta.ws.rs-jakarta.ws.rs-api-pom- \
mvn-javax.ws.rs-javax.ws.rs-api \
mvn-javax.ws.rs-javax.ws.rs-api-pom- \
osgi-jakarta.ws.rs-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

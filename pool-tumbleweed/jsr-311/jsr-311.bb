SUMMARY = "JAX-RS: Java API for RESTful Web Services"
DESCRIPTION = "JAX-RS: Java API for RESTful Web Services"
LICENSE = "CDDL-1.0"

PV = "1.1.1"

RPM_NAME = "jsr-311-1.1.1-4.10.noarch.rpm"
RPM_HASH = "f73ff482d5b8bf4057eeee8afc1e401e991c80131f1ad7de808866d3984e38e15ce30722d030faad1c07ef0babb67ce596cc2f9c5d32b35aafb6db3be93a757c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jsr-311 \
mvn-javax.ws.rs-jsr311-api \
mvn-javax.ws.rs-jsr311-api-pom- \
osgi-javax.ws.rs.jsr311-api"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

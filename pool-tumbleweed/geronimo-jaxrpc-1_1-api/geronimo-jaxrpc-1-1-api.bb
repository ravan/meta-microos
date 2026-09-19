SUMMARY = "Geronimo JAXRPC 1.1 Specification"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: Java API for XML-Based RPC (JAXRPC)"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-jaxrpc-1_1-api-1.2-41.6.noarch.rpm"
RPM_HASH = "0387ed5b36b4174f268a9b2ba46f9b59ff71a797a81d9865bdc09aa98ecb40ffff0bb2f2e41f4a456d0efeb1d02ae7bf0c512119d63962acf45a884856ac5752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-jaxrpc-1-1-api \
mvn-org.apache.geronimo.specs-geronimo-jaxrpc-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-jaxrpc-1.1-spec-pom-"

RDEPENDS:${PN} += "geronimo-qname-1-1-api \
geronimo-saaj-1-1-api \
geronimo-servlet-2-4-api \
java-headless \
javapackages-filesystem"

inherit rpm

SUMMARY = "Geronimo QName 1.1 Specification"
DESCRIPTION = "Geronimo is Apache's ASF-licenced J2EE server project. These are the \
J2EE-Specifications: javax.xml.namespace.QName API"
LICENSE = "Apache-2.0"

PV = "1.2"

RPM_NAME = "geronimo-qname-1_1-api-1.2-41.6.noarch.rpm"
RPM_HASH = "c6039585de455adaa30328f88de86f33e24ad0a4a2284a1ce38a33d27f2d9d62d9e1e56294ea085ea99d81ee862a5eb514231930c3b047dc700fe09151515053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "geronimo-qname-1-1-api \
mvn-org.apache.geronimo.specs-geronimo-qname-1.1-spec \
mvn-org.apache.geronimo.specs-geronimo-qname-1.1-spec-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

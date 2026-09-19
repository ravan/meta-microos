SUMMARY = "Common code for some Glassfish projects"
DESCRIPTION = "Code shared between JAXP, JAXB, SAAJ, and JAX-WS projects."
LICENSE = "CDDL-1.1 & GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.0.7"

RPM_NAME = "istack-commons-3.0.7-8.10.noarch.rpm"
RPM_HASH = "0c9d2394ab00a56d7756ecb736ae56ea8b0c0c25bb33109c165d498506303e95227e94e16fc35144b442f74221a5c3db17482dbcf2789ee967947285e0be8725"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "istack-commons \
mvn-com.sun.istack-istack-commons-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-net.java-jvnet-parent-pom- \
mvn-org.apache.felix-maven-bundle-plugin"

inherit rpm

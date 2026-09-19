SUMMARY = "GlassFishBuild Maven Plugin"
DESCRIPTION = "This plugin provides custom goals used by the GlassFish project build."
LICENSE = "CDDL-1.1 | GPL-2.0-only-with-Classpath-exception-2.0"

PV = "3.2.26"

RPM_NAME = "glassfishbuild-maven-plugin-3.2.26-3.10.noarch.rpm"
RPM_HASH = "d408407937d6b4b55f5c23ce6b1f3cc1f3eb35d831bb1e15f4a043e6f63272518c6b7e7db6338d20b3b3a153d32ecc2614f2253df81f640d0b32e0aa377720cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glassfishbuild-maven-plugin \
mvn-org.glassfish.build-glassfishbuild-maven-plugin \
mvn-org.glassfish.build-glassfishbuild-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.ant-ant \
mvn-org.apache.maven-maven-aether-provider \
mvn-org.apache.maven-maven-archiver \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-model-builder \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.apache.maven.shared-maven-common-artifact-filters"

inherit rpm

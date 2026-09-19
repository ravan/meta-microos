SUMMARY = "Jetty version management Maven plugin"
DESCRIPTION = "Jetty version management Maven plugin"
LICENSE = "Apache-2.0 | EPL-1.0"

PV = "1.0.10"

RPM_NAME = "jetty-version-maven-plugin-1.0.10-4.4.noarch.rpm"
RPM_HASH = "1902684e546d0c4586ac7686e67f8d50f259b6d420f49414ec325059aa8c60a7e04694dabb857d271bdccf18cc9bbde33871ece7d1f7a8886c4971cee36213d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetty-version-maven-plugin \
mvn-org.eclipse.jetty.toolchain-jetty-version-maven-plugin \
mvn-org.eclipse.jetty.toolchain-jetty-version-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.commons-commons-lang3"

inherit rpm

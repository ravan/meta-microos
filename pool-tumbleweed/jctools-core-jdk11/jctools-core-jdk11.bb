SUMMARY = "Java Concurrency Tools Core Library - JDK 11+"
DESCRIPTION = "JDK 11 + Core Library for Java Concurrency Tools Library"
LICENSE = "Apache-2.0"

PV = "4.0.6"

RPM_NAME = "jctools-core-jdk11-4.0.6-1.2.noarch.rpm"
RPM_HASH = "f9b8b8ea1cb4bb203f073ded92244757a0cfda6ad7219ebd520466180a64c6f35b85d2d0c887a3e2360d70ede632c4dc4c3f531bf5c95498fa9a341a2da63274"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools-core-jdk11 \
mvn-org.jctools-jctools-core-jdk11 \
mvn-org.jctools-jctools-core-jdk11-pom- \
osgi-org.jctools.core-jdk11"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jctools-jctools-core"

inherit rpm

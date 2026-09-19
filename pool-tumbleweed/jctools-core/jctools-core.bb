SUMMARY = "Java Concurrency Tools Core Library"
DESCRIPTION = "Core Library for Java Concurrency Tools Library"
LICENSE = "Apache-2.0"

PV = "4.0.6"

RPM_NAME = "jctools-core-4.0.6-1.2.noarch.rpm"
RPM_HASH = "4fa45b1fb0a911e403fa41cc0c75e82529c25d247883d4d91bfadb9e49121502c539e76be000a28ff69ed6e689d0fe7bea3f16c88717f4a6f16f3f1961dcdfd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools \
jctools-core \
mvn-org.jctools-jctools-core \
mvn-org.jctools-jctools-core-pom- \
osgi-org.jctools.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

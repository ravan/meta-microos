SUMMARY = "JCTools Experimental implementations"
DESCRIPTION = "Experimental implementations for the \
Java Concurrency Tools Library."
LICENSE = "Apache-2.0"

PV = "4.0.6"

RPM_NAME = "jctools-experimental-4.0.6-1.2.noarch.rpm"
RPM_HASH = "18766cb4add3fc9d71e1f9d00e2c6e9bcbc105e8b8eef76ab13446c838b81226c6fb8d4d137e515e1d68aafd195c99735d19e8d4b9a8b2eca0f03472be16efa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools-experimental \
mvn-org.jctools-jctools-experimental \
mvn-org.jctools-jctools-experimental-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jctools-jctools-channels \
mvn-org.jctools-jctools-core \
mvn-org.ow2.asm-asm-all"

inherit rpm

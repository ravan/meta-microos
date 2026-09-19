SUMMARY = "JCTools Channel implementations"
DESCRIPTION = "Channel implementations for the \
Java Concurrency Tools Library."
LICENSE = "Apache-2.0"

PV = "4.0.6"

RPM_NAME = "jctools-channels-4.0.6-1.2.noarch.rpm"
RPM_HASH = "89b0ceae01aeb965f610a23397758546e5c7eb2ce935e0691503bc47dcf6be155c6ccf9a63c1dd7551713c82dbd650fe3b7963f05c1f4220790b073d3cb8a04f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jctools-channels \
mvn-org.jctools-jctools-channels \
mvn-org.jctools-jctools-channels-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.jctools-jctools-core \
mvn-org.ow2.asm-asm-all"

inherit rpm

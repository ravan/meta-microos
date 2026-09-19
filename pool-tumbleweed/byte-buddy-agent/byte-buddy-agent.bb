SUMMARY = "Byte Buddy Java agent"
DESCRIPTION = "The Byte Buddy Java agent allows to access the JVM's HotSwap feature."
LICENSE = "Apache-2.0"

PV = "1.18.8"

RPM_NAME = "byte-buddy-agent-1.18.8-1.2.noarch.rpm"
RPM_HASH = "8bfa9647f98bd626c3d0eca3c8aa937c47d49c681bca69f046ce51f10d6dad70ac36259f1941878e27c216fcaaadef79e33e4f2cf305c0eeac4ce8598c0c6f77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "byte-buddy-agent \
mvn-net.bytebuddy-byte-buddy-agent \
mvn-net.bytebuddy-byte-buddy-agent-pom- \
osgi-net.bytebuddy.byte-buddy-agent"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

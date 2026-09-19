SUMMARY = "Library for handling IP addresses and subnets, both IPv4 and IPv6"
DESCRIPTION = "Library for handling IP addresses and subnets, both IPv4 and IPv6"
LICENSE = "Apache-2.0"

PV = "5.5.1"

RPM_NAME = "IPAddress-5.5.1-2.7.noarch.rpm"
RPM_HASH = "6a28a6cf4153f1aa6f61e9939041bf72ccae96a2b5e484556779871c95817a397abbf13a237112245fe0da7c15d1e95a0540ff3fa7b70b04dcc690bfebaa6aa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "IPAddress \
mvn-com.github.seancfoley-ipaddress \
mvn-com.github.seancfoley-ipaddress-pom- \
osgi-com.github.seancfoley.ipaddress"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

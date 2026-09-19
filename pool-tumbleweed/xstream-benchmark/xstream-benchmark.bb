SUMMARY = "The benchmark module for xstream"
DESCRIPTION = "This package contains the benchmark module for xstream."
LICENSE = "BSD-3-Clause"

PV = "1.4.21"

RPM_NAME = "xstream-benchmark-1.4.21-1.6.noarch.rpm"
RPM_HASH = "e07f3bd4fdedf96b3d35c9971a2855415abb17b80e77e05b756f05e5b5a91659bc09cbe02f213346653c86cf239d16ab243977efb384e5a5420f9deec48b2918"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.thoughtworks.xstream-xstream-benchmark \
mvn-com.thoughtworks.xstream-xstream-benchmark-pom- \
osgi-xstream-benchmark \
xstream-benchmark"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.xstream-xstream \
xstream"

inherit rpm

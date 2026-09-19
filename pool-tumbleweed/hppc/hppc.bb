SUMMARY = "High Performance Primitive Collections for Java"
DESCRIPTION = "Fundamental data structures (maps, sets, lists, stacks, queues) generated for \
combinations of object and primitive types to conserve JVM memory and speed \
up execution."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "hppc-0.7.1-7.10.noarch.rpm"
RPM_HASH = "c618ef8be55cee7dabbd5e049965ec81e516a1360cffe02efab1815ac03abb4d0e07e82d0f681439e1416d3777ed5376ac97b1b75035cc7bf407903114f21d43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hppc \
mvn-com.carrotsearch-hppc \
mvn-com.carrotsearch-hppc--esoteric- \
mvn-com.carrotsearch-hppc-parent-pom- \
mvn-com.carrotsearch-hppc-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-javax.annotation-javax.annotation-api"

inherit rpm

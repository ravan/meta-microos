SUMMARY = "A Persistent Java Collections Library"
DESCRIPTION = "PCollections serves as a persistent and immutable analogue of the Java \
Collections Framework. This includes efficient, thread-safe, generic, \
immutable, and persistent stacks, maps, vectors, sets, and bags, compatible \
with their Java Collections counterparts. \
 \
Persistent and immutable datatypes are increasingly appreciated as a simple, \
design-friendly, concurrency-friendly, and sometimes more time- and \
space-efficient alternative to mutable datatypes."
LICENSE = "MIT"

PV = "5.0.0"

RPM_NAME = "pcollections-5.0.0-1.4.noarch.rpm"
RPM_HASH = "2998626b00081fff658d8486ef93c939a96a76fb09c22fd22b6cb2d5b3015a0d705e1eddfab17824098b5b6fbb8b8cf8471d61caef2b46de4519c2f43920beef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.pcollections-pcollections \
mvn-org.pcollections-pcollections-pom- \
pcollections"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

SUMMARY = "Collection of parsers for Java"
DESCRIPTION = "uniVocity-parsers is a suite of parsers for Java. It provides an \
interface for handling different file formats, and a framework for \
the development of new parsers."
LICENSE = "Apache-2.0"

PV = "2.9.1"

RPM_NAME = "univocity-parsers-2.9.1-4.8.noarch.rpm"
RPM_HASH = "9f15a3b7155014c53b5a26e17de868dcbe905b90c1eab68db18da139375d9059f62355880b082f7a8cea72127a00c68a292f903a7e665f16fe9613d0454a9410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.univocity-univocity-parsers \
mvn-com.univocity-univocity-parsers-pom- \
osgi-com.univocity.parsers \
univocity-parsers"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

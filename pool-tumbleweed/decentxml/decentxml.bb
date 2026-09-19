SUMMARY = "XML parser optimized for round-tripping and code reuse"
DESCRIPTION = "XML parser optimized for round-tripping and code reuse with main \
features being: \
 * Allows 100% round-tripping, even for weird whitespace between \
   attributes in the start tag or in the end tag \
 * Suitable for building editors and filters which want/need to \
   preserve the original file layout as much as possible \
 * Error messages have line and column information \
 * XML 1.1 compatible"
LICENSE = "BSD-3-Clause"

PV = "1.4"

RPM_NAME = "decentxml-1.4-5.6.noarch.rpm"
RPM_HASH = "5302fd12f2729088c7602722e0050ebc4239b1fc98314bc4ad708d34dcdc7ce8ace540a0569b9a10d6f5980d45c3662d37306f51fa11155d491fe89317b30460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "decentxml \
mvn-de.pdark-decentxml \
mvn-de.pdark-decentxml-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

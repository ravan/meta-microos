SUMMARY = "A SAX-compliant HTML parser written in Java"
DESCRIPTION = "TagSoup is a SAX-compliant parser written in Java that, instead of \
parsing well-formed or valid XML, parses HTML as it is found in the wild: nasty \
and brutish, though quite often far from short. By providing a SAX interface, \
it allows standard XML tools to be applied to even the worst HTML."
LICENSE = "Apache-2.0"

PV = "1.2.1"

RPM_NAME = "tagsoup-1.2.1-6.9.noarch.rpm"
RPM_HASH = "7e345a8aa3c520aff6406cecfa74facd85882e0d4539e6216a9f524569aabba7ff035a677979a05e325c1c4aca6027ddf99b6c58b60232240904496c51bff6bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.ccil.cowan.tagsoup-tagsoup \
mvn-org.ccil.cowan.tagsoup-tagsoup-pom- \
tagsoup"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
javapackages-tools"

inherit rpm

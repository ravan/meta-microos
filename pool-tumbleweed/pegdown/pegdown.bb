SUMMARY = "Java library for Markdown processing"
DESCRIPTION = "A pure-Java Markdown processor based on a parboiled PEG parser \
supporting a number of extensions."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "pegdown-1.4.2-3.9.noarch.rpm"
RPM_HASH = "abba4d5ef48ed3117c91f64f8fc4c32c4237434f0b4f65c71211840d4dca95f22f8770e2e52acd50cb5f653c2b8ed74a95cad8a9beb59806d8e644dc291fe648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.pegdown-pegdown \
mvn-org.pegdown-pegdown-pom- \
osgi-org.pegdown \
pegdown"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.parboiled-parboiled-java"

inherit rpm

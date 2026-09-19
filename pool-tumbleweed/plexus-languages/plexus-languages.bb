SUMMARY = "Plexus Languages"
DESCRIPTION = "Plexus Languages is a set of Plexus components that maintain shared \
language features."
LICENSE = "Apache-2.0"

PV = "1.5.0"

RPM_NAME = "plexus-languages-1.5.0-1.5.noarch.rpm"
RPM_HASH = "1d0e60dea023ff50c45785bdaaf6a174eeb9c72cbfd19a8b66092df1dd2324eb088d0eb5496182fe41e6e6551e4bd6c42965955678ca5092590542f502534dca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.codehaus.plexus-plexus-java \
mvn-org.codehaus.plexus-plexus-java-pom- \
plexus-languages"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.thoughtworks.qdox-qdox \
mvn-org.ow2.asm-asm"

inherit rpm

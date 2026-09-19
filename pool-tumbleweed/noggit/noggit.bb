SUMMARY = "JSON streaming parser"
DESCRIPTION = "Noggit is the world’s fastest streaming JSON parser for Java."
LICENSE = "Apache-2.0"

PV = "0.8"

RPM_NAME = "noggit-0.8-1.5.noarch.rpm"
RPM_HASH = "dc23bc9524094164d0e2c475aaadaa3a46b2d12b21d9fff63b5163ec4aeba9a02a016af58a9a1a90313bc30195646cdbf6905e82e32fe25483100fbe50523276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.noggit-noggit \
mvn-org.noggit-noggit-pom- \
noggit"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

SUMMARY = "Codehaus MOJO parent project pom file"
DESCRIPTION = "Codehaus MOJO parent project pom file"
LICENSE = "Apache-2.0"

PV = "82"

RPM_NAME = "mojo-parent-82-2.2.noarch.rpm"
RPM_HASH = "974d2607b0c2e5ab184191f0521c4f8bc817ac59f3427c2f1e04f7de518761fe21bc0aec2b151afa40df829823718883657bd577048c2289dca3dee9800ca336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mojo-parent \
mvn-org.codehaus.mojo-mojo-parent-pom- \
mvn-org.codehaus.mojo-mojo-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

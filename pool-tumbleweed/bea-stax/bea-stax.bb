SUMMARY = "Streaming API for XML"
DESCRIPTION = "The Streaming API for XML (StAX) is Java API for \
parsing and writing XML easily and efficiently."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "bea-stax-1.2.0-1.8.noarch.rpm"
RPM_HASH = "48443197db3c26a5b766f1b141562469ed4216dd10fdb1ca2e2ea7afe407631cd1e1da384a950154845ea48ef1c2a973a06b3b44c120689d557b0a5db1df1f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bea-stax \
mvn-stax-stax \
mvn-stax-stax-pom-"

RDEPENDS:${PN} += "bea-stax-api \
java-headless \
javapackages-filesystem \
mvn-stax-stax-api"

inherit rpm

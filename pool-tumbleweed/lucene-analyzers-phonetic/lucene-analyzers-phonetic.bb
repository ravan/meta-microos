SUMMARY = "Lucene Phonetic Filters"
DESCRIPTION = "Provides phonetic encoding via Commons Codec."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-analyzers-phonetic-8.11.4-1.8.noarch.rpm"
RPM_HASH = "a5b7e29b5cb13227a327dd66dd22dee8c06eb40dce99dcc1283c07d1b1eac11e2d4f929faf7167aeb92cf3f37ce5981125b017986b06238682cc4d2636e463ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-analyzers-phonetic \
mvn-org.apache.lucene-lucene-analyzers-phonetic \
mvn-org.apache.lucene-lucene-analyzers-phonetic-pom- \
osgi-org.apache.lucene.analyzers-phonetic"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-codec-commons-codec \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core"

inherit rpm

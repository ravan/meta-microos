SUMMARY = "Lucene Suggest Module"
DESCRIPTION = "Lucene Suggest Module."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-suggest-8.11.4-1.8.noarch.rpm"
RPM_HASH = "0344f5bf6d18c165bae3c3c8d9eafa7cb0259152ba9da0e34c3af60e5747fce09d95a1926ec89a205ac082972f48c7a9b09743ce6e1b6877f5cf7661619d1df2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-suggest \
mvn-org.apache.lucene-lucene-suggest \
mvn-org.apache.lucene-lucene-suggest-pom- \
osgi-org.apache.lucene.suggest"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core"

inherit rpm

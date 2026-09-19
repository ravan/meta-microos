SUMMARY = "Text search engine"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
It offers fuzzy search based on edit (Levenshtein) distance, \
incremental indexing, ranked searching, field-based searches and \
multi-index searches."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-core-8.11.4-1.8.noarch.rpm"
RPM_HASH = "d4ba71b6c1708e76b93ceca7afe6651fd4bbc68b47071b98751c40e2030d3bb48118bd3725b5ef98d0dc592b373127ae829f46c2aa281683d8d951399e1fb1c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene \
lucene-core \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-core-pom- \
osgi-org.apache.lucene.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

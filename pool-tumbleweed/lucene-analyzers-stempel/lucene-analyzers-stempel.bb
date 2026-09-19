SUMMARY = "Analyzers-stempel module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-stempel' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-analyzers-stempel-8.11.4-1.8.noarch.rpm"
RPM_HASH = "76c1ab66fa825729a358a38366efd33ef0ed652e00d8581176afd7349c63597ebd252d0badfc29c8f9941e4fe9c56620ca6017c0520a53d12b1d2d3586826e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-analyzers-stempel \
mvn-org.apache.lucene-lucene-analyzers-stempel \
mvn-org.apache.lucene-lucene-analyzers-stempel-pom- \
osgi-org.apache.lucene.analyzers-stempel"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core"

inherit rpm

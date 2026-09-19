SUMMARY = "Memory module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'memory' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-memory-8.11.4-1.8.noarch.rpm"
RPM_HASH = "274640b6f1a5aa4f09aaaf406ff440e234b99d364f453b981f60b079bf0191e077b456332cd8a44aabfbdd55a2317172ad1ae05b33386fe003befafe6b4f54a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-memory \
mvn-org.apache.lucene-lucene-memory \
mvn-org.apache.lucene-lucene-memory-pom- \
osgi-org.apache.lucene.memory"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm

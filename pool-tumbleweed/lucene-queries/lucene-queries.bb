SUMMARY = "Queries module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'queries' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-queries-8.11.4-1.8.noarch.rpm"
RPM_HASH = "5ccc65a36531b33473d8b2e8af09400108fd3ac1f7ba31395697ef715418064ed238e929335a12aac035cba73cfa127657181fdb74be46e32940bbc83cc5905b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-queries \
mvn-org.apache.lucene-lucene-queries \
mvn-org.apache.lucene-lucene-queries-pom- \
osgi-org.apache.lucene.queries"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm

SUMMARY = "Queryparser module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'queryparser' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-queryparser-8.11.4-1.8.noarch.rpm"
RPM_HASH = "905444a4b05ed3b4de62e4a028b5aecbdcb79efe5b04e99df5cf16bea3384eb21fcc4dadfc8dc830a98992cb10316ca1caa749f890ee0e43821ba30ba30b6482"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-queryparser \
mvn-org.apache.lucene-lucene-queryparser \
mvn-org.apache.lucene-lucene-queryparser-pom- \
osgi-org.apache.lucene.queryparser"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-queries \
mvn-org.apache.lucene-lucene-sandbox"

inherit rpm

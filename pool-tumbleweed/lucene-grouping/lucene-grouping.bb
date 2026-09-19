SUMMARY = "Grouping module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'grouping' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-grouping-8.11.4-1.8.noarch.rpm"
RPM_HASH = "1f0375997b7b1eb5fd2cae9c94299d11fa26ab0b671e2d7a596a4b489f2db6f483bb34534e70c699680c2bd2ebf20a59cfe112bdcc558d38bcce483b85207d66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-grouping \
mvn-org.apache.lucene-lucene-grouping \
mvn-org.apache.lucene-lucene-grouping-pom- \
osgi-org.apache.lucene.grouping"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-queries"

inherit rpm

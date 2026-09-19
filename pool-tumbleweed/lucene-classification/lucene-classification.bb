SUMMARY = "Classification module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'classification' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-classification-8.11.4-1.8.noarch.rpm"
RPM_HASH = "4acee624fa2843ec9c693043da589bc7fb9f25faefde0cef80c98e5ee048f94014d65c8938d6747dff6e7c3098c9f2d988ae81ac6ab30641519ca6054d1b8efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-classification \
mvn-org.apache.lucene-lucene-classification \
mvn-org.apache.lucene-lucene-classification-pom- \
osgi-org.apache.lucene.classification"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-grouping \
mvn-org.apache.lucene-lucene-queries"

inherit rpm

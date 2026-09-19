SUMMARY = "Highlighter module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'highlighter' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-highlighter-8.11.4-1.8.noarch.rpm"
RPM_HASH = "9fec79eddd13960a0f670f89f78f2e85f66c39ac21a39d08001c57878355cbfcc4d77e246aae57d4a3aa5302a5e8ebfbf88ed8f49a3e7a67ded4b90b0775b009"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-highlighter \
mvn-org.apache.lucene-lucene-highlighter \
mvn-org.apache.lucene-lucene-highlighter-pom- \
osgi-org.apache.lucene.highlighter"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-memory \
mvn-org.apache.lucene-lucene-queries"

inherit rpm

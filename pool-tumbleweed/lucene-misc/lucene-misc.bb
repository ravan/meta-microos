SUMMARY = "Misc module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'misc' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-misc-8.11.4-1.8.aarch64.rpm"
RPM_HASH = "abd93b6be65ed074d7a5856bbc89f1e99bb9b16a5322b9b92a0279367847b19108f3039b3fe8ff74e754e52e24c8ac2dd5afdb1e378129ff6ca8a531f40d9135"

RPROVIDES:${PN} += "lucene-misc \
mvn-org.apache.lucene-lucene-misc \
mvn-org.apache.lucene-lucene-misc-pom- \
osgi-org.apache.lucene.misc"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
osgi-org.apache.lucene.core"

inherit rpm

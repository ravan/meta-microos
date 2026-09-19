SUMMARY = "Analyzers-common module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-common' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-analyzers-common-8.11.4-1.8.noarch.rpm"
RPM_HASH = "9b9e957fbba558207cd8a0a320688cadd9d723c4a2cd47f0d6f36791e1d9f1d389d870bd14141128412f640992fc552b6014de62fd190837818c85f76766a9b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-analysis \
lucene-analyzers-common \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-analyzers-common-pom- \
osgi-org.apache.lucene.analyzers-common"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core \
osgi-org.apache.lucene.core"

inherit rpm

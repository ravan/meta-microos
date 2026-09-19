SUMMARY = "Analyzers-smartcn module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'analyzers-smartcn' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-analyzers-smartcn-8.11.4-1.8.noarch.rpm"
RPM_HASH = "ee3473cc3eae5edccc52a354fe5843d7e3410d36ea97aeb0fc129b9ec68ab48c89a81c4d5d5c185aa8cfef738f82c875a68e036e24dcdcfc987e0f307e03b270"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-analyzers-smartcn \
mvn-org.apache.lucene-lucene-analyzers-smartcn \
mvn-org.apache.lucene-lucene-analyzers-smartcn-pom- \
osgi-org.apache.lucene.analyzers-smartcn"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core"

inherit rpm

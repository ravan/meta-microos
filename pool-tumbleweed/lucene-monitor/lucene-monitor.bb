SUMMARY = "Spatial module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'monitor' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-monitor-8.11.4-1.8.noarch.rpm"
RPM_HASH = "e8eca96a0f6e8c40d2c6f2d9cee778c7907d6642e05a806d69a4ceef6ff26ad2bbfe4170ef57f138ce684a82f08c883c6a3c78195fcfc3db2632075b47636d69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-monitor \
mvn-org.apache.lucene-lucene-monitor \
mvn-org.apache.lucene-lucene-monitor-pom- \
osgi-org.apache.lucene.monitor"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core \
mvn-org.apache.lucene-lucene-memory \
mvn-org.apache.lucene-lucene-queryparser"

inherit rpm

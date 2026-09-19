SUMMARY = "Spatial3d module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'spatial3d' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-spatial3d-8.11.4-1.8.noarch.rpm"
RPM_HASH = "c2bc7921f2d78484074453c68db6e2dd7f55fe6a2b7ce6666b7a737c5d65a71e633dfef16efb5d7a53bbfb4fe30fc76b281025aa693886ba997f6ededf7bdc25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-spatial3d \
mvn-org.apache.lucene-lucene-spatial3d \
mvn-org.apache.lucene-lucene-spatial3d-pom- \
osgi-org.apache.lucene.spatial3d"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm

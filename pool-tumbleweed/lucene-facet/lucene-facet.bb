SUMMARY = "Facet module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'facet' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-facet-8.11.4-1.8.noarch.rpm"
RPM_HASH = "b71b07a2902938cc14a0ee44a06839ef0f679dfb65fb6ba5d45772f3b872996f420133eaca9483027197864c29131ae5e8894437594cbb1df44d36027370e3df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-facet \
mvn-org.apache.lucene-lucene-facet \
mvn-org.apache.lucene-lucene-facet-pom- \
osgi-org.apache.lucene.facet"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.carrotsearch-hppc \
mvn-org.apache.lucene-lucene-core"

inherit rpm

SUMMARY = "Backward-codecs module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'backward-codecs' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-backward-codecs-8.11.4-1.8.noarch.rpm"
RPM_HASH = "072f2fa8003bb980c7e96402df4590aa335520ecd9fb248360a6e74c80b72eef8ca271922ba4d586bd1ce106eb914969ba6d622273d4041aea62a26c0d681569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-backward-codecs \
mvn-org.apache.lucene-lucene-backward-codecs \
mvn-org.apache.lucene-lucene-backward-codecs-pom- \
osgi-org.apache.lucene.backward-codecs"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm

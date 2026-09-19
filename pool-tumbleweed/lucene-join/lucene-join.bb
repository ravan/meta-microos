SUMMARY = "Join module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'join' module for lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-join-8.11.4-1.8.noarch.rpm"
RPM_HASH = "2f22e78f90f9c3a914d8a8a40f26e5413c8ba374436ef93fcbfdbcd16aa723082dc73d879d8709d60deead4ba24ff12ba0805f06fc91acf33691d35a78bf948f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-join \
mvn-org.apache.lucene-lucene-join \
mvn-org.apache.lucene-lucene-join-pom- \
osgi-org.apache.lucene.join"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm

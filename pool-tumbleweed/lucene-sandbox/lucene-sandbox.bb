SUMMARY = "Sandbox module for lucene"
DESCRIPTION = "Apache Lucene is a full-text search engine written entirely in Java. \
This package provides the 'sandbox' module for Lucene."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-sandbox-8.11.4-1.8.noarch.rpm"
RPM_HASH = "227ea2b4e9419c363dc5032a7a680908d9e4911913a5b729045510400d281b336a32f38a1b10d5b4377709b03eaca2f0162c8f3598a1c0c608351900993daadf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-sandbox \
mvn-org.apache.lucene-lucene-sandbox \
mvn-org.apache.lucene-lucene-sandbox-pom- \
osgi-org.apache.lucene.sandbox"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.lucene-lucene-core"

inherit rpm

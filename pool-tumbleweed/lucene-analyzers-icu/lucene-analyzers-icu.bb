SUMMARY = "Lucene ICU Analysis Components"
DESCRIPTION = "Provides integration with ICU (International Components for Unicode) for \
stronger Unicode and internationalization support."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-analyzers-icu-8.11.4-1.8.noarch.rpm"
RPM_HASH = "61a2b55ee5b0daca29dc8823a7d793c50651adf72eee266af7b356b885fc4f5d95d00eea06ffb4a69dc5dc2437eba935d970afd44d1e59c9a6dab5bbd46e8bd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-analyzers-icu \
mvn-org.apache.lucene-lucene-analyzers-icu \
mvn-org.apache.lucene-lucene-analyzers-icu-pom- \
osgi-org.apache.lucene.analyzers-icu"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.ibm.icu-icu4j \
mvn-org.apache.lucene-lucene-analyzers-common \
mvn-org.apache.lucene-lucene-core"

inherit rpm

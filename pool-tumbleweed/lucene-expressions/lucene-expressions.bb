SUMMARY = "Lucene Expressions"
DESCRIPTION = "Dynamically computed values to sort/facet/search based on a pluggable \
grammar."
LICENSE = "Apache-2.0"

PV = "8.11.4"

RPM_NAME = "lucene-expressions-8.11.4-1.8.noarch.rpm"
RPM_HASH = "247f3779e37719b4dade60cfcb2574d0d652947acbea5af262af1c0a003407f13cb3cc2e047d6eca6fe432e70d55c5a5b5c4abe2537719c284898d4824d4ff09"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lucene-expressions \
mvn-org.apache.lucene-lucene-expressions \
mvn-org.apache.lucene-lucene-expressions-pom- \
osgi-org.apache.lucene.expressions"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.antlr-antlr4-runtime \
mvn-org.apache.lucene-lucene-core \
mvn-org.ow2.asm-asm \
mvn-org.ow2.asm-asm-commons"

inherit rpm

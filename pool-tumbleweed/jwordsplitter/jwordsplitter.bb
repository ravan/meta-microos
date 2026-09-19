SUMMARY = "A Java library to split German compound words"
DESCRIPTION = "This Java library can split German compound words into smaller parts. \
This is especially useful for German words but it can work with all languages, \
as long as a dictionary and a class extending AbstractWordSplitter is provided. \
So far, only German is supported and a German dictionary is included in the JAR. \
Even though it will work for some adjectives it works best for nouns."
LICENSE = "Apache-2.0"

PV = "4.4"

RPM_NAME = "jwordsplitter-4.4-4.6.noarch.rpm"
RPM_HASH = "1b7f9ddbf8dab7e2c13f163db29b25ddcb99c47d828ae199fd0e6dbacaf79b736ae34ff695d0f64b379104b2e02b6b7d14680d44792643c5fca356289055e0a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jwordsplitter \
mvn-de.danielnaber-jwordsplitter \
mvn-de.danielnaber-jwordsplitter-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

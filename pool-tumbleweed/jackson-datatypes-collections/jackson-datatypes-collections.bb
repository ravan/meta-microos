SUMMARY = "Jackson datatypes: collections"
DESCRIPTION = "This is a multi-module umbrella project for various Jackson \
Data-type modules to support 3rd party Collection libraries. \
 \
Currently included are: \
* Guava data-type \
* HPPC data-type \
* PCollections data-type"
LICENSE = "Apache-2.0"

PV = "2.18.9"

RPM_NAME = "jackson-datatypes-collections-2.18.9-1.1.noarch.rpm"
RPM_HASH = "5a548b856a2e97544db944b747eca24352a7c6fb6243633af99b1a7a80582fb0bb49e9d07f915294b6d8733d484ae0a4ed0077156c9263c0d88fe7b4e8236266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jackson-datatypes-collections \
mvn-com.fasterxml.jackson.datatype-jackson-datatypes-collections-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson-jackson-base-pom- \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind"

inherit rpm

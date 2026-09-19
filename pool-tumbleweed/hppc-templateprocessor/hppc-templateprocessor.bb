SUMMARY = "HPPC Template Processor"
DESCRIPTION = "Template Processor and Code Generation for HPPC."
LICENSE = "Apache-2.0"

PV = "0.7.1"

RPM_NAME = "hppc-templateprocessor-0.7.1-7.10.noarch.rpm"
RPM_HASH = "d247348964b0bbccce19fc2d8c2b042592092dcddb590cc703f0dd4dd48f0d706e9b970e2a42428b38eedb5b6e6332573a61c6fb4baf294a29623b6f5abeb1a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hppc-templateprocessor \
mvn-com.carrotsearch-hppc-template-processor \
mvn-com.carrotsearch-hppc-template-processor-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.guava-guava \
mvn-junit-junit \
mvn-org.antlr-antlr4 \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.velocity-velocity"

inherit rpm

SUMMARY = "Apache UIMA Maven JCasGen Plugin"
DESCRIPTION = "A Maven Plugin for using JCasGen to generate Java classes from \
XML type system descriptions."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "jcasgen-maven-plugin-3.5.0-6.1.noarch.rpm"
RPM_HASH = "5c348691ed88feb7967843870ad82b240048bfc0cc356548d1338010b199e00c8c1f4d7183d1fc08f1246cfd8acb99a5dc72aade3f4764f1a61252b4790d1748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jcasgen-maven-plugin \
mvn-org.apache.uima-jcasgen-maven-plugin \
mvn-org.apache.uima-jcasgen-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.uima-jVinci \
mvn-org.apache.uima-uimaj-adapter-vinci \
mvn-org.apache.uima-uimaj-core \
mvn-org.apache.uima-uimaj-cpe \
mvn-org.apache.uima-uimaj-tools \
mvn-org.sonatype.plexus-plexus-build-api"

inherit rpm

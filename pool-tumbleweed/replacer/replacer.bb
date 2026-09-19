SUMMARY = "Replacer Maven Mojo"
DESCRIPTION = "Maven plugin to replace tokens in a given file with a value. \
 \
This plugin is also used to automatically generating PackageVersion.java \
in the FasterXML.com project."
LICENSE = "MIT"

PV = "1.6"

RPM_NAME = "replacer-1.6-6.6.noarch.rpm"
RPM_HASH = "92498450fe6d08ae755ada9989b07f441f0b0d9e03f23092696a228eecc49954b98639860fb185b948b3bff19d969c79bab5623d0e2b9abacee63a80875a0e16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-com.google.code.maven-replacer-plugin-maven-replacer-plugin \
mvn-com.google.code.maven-replacer-plugin-maven-replacer-plugin-pom- \
mvn-com.google.code.maven-replacer-plugin-replacer \
mvn-com.google.code.maven-replacer-plugin-replacer-pom- \
replacer"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-commons-io-commons-io \
mvn-org.apache.ant-ant \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven-maven-plugin-api \
mvn-xerces-xercesImpl"

inherit rpm

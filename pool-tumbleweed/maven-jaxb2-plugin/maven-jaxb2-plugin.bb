SUMMARY = "Provides the capability to generate java sources from schemas"
DESCRIPTION = "This Maven 2 plugin wraps the JAXB 2.x XJC compiler and provides the capability \
to generate Java sources from XML Schemas."
LICENSE = "Apache-2.0 & BSD-2-Clause"

PV = "0.14.0"

RPM_NAME = "maven-jaxb2-plugin-0.14.0-4.7.noarch.rpm"
RPM_HASH = "83442f2eb3391ad66a30783b1ef277f166dbdd07acf5e92b0ad697abd0922b1938825c0e8bac1120d4b623d4cd56a810f40c01e9d894a0861c9980b493b27b31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-jaxb2-plugin \
mvn-org.jvnet.jaxb2.maven2-maven-jaxb2-plugin \
mvn-org.jvnet.jaxb2.maven2-maven-jaxb2-plugin-core \
mvn-org.jvnet.jaxb2.maven2-maven-jaxb2-plugin-core-pom- \
mvn-org.jvnet.jaxb2.maven2-maven-jaxb2-plugin-pom- \
mvn-org.jvnet.jaxb2.maven2-maven-jaxb2-plugin-project-pom- \
mvn-org.jvnet.jaxb2.maven2-maven-jaxb2-plugin-testing \
mvn-org.jvnet.jaxb2.maven2-maven-jaxb2-plugin-testing-pom- \
mvn-org.jvnet.jaxb2.maven2-maven-jaxb22-plugin \
mvn-org.jvnet.jaxb2.maven2-maven-jaxb22-plugin-pom- \
mvn-org.jvnet.jaxb2.maven2-maven-jaxb23-plugin \
mvn-org.jvnet.jaxb2.maven2-maven-jaxb23-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.sun.activation-javax.activation \
mvn-com.sun.codemodel-codemodel \
mvn-com.sun.istack-istack-commons-runtime \
mvn-com.sun.istack-istack-commons-tools \
mvn-com.sun.xml.bind.external-rngom \
mvn-com.sun.xml.dtd-parser-dtd-parser \
mvn-com.sun.xml.fastinfoset-FastInfoset \
mvn-com.sun.xsom-xsom \
mvn-javax.xml.bind-jaxb-api \
mvn-junit-junit \
mvn-org.apache.commons-commons-lang3 \
mvn-org.apache.maven-maven-compat \
mvn-org.apache.maven-maven-core \
mvn-org.apache.maven-maven-plugin-api \
mvn-org.apache.maven.plugin-tools-maven-plugin-annotations \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.glassfish.jaxb-codemodel \
mvn-org.glassfish.jaxb-jaxb-runtime \
mvn-org.glassfish.jaxb-jaxb-xjc \
mvn-org.glassfish.jaxb-jaxb-xjc-jdk9 \
mvn-org.glassfish.jaxb-txw2 \
mvn-org.jvnet.staxex-stax-ex \
mvn-org.slf4j-slf4j-api \
mvn-org.sonatype.plexus-plexus-build-api \
mvn-xml-resolver-xml-resolver"

inherit rpm

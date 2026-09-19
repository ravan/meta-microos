SUMMARY = "Modello Data Model toolkit"
DESCRIPTION = "Modello is a Data Model toolkit in use by the Apache Maven Project. \
 \
Modello is a framework for code generation from a simple model. \
Modello generates code from a simple model format based on a plugin \
architecture, various types of code and descriptors can be generated \
from the single model, including Java POJOs, XML \
marshallers/unmarshallers, XSD and documentation."
LICENSE = "Apache-2.0 & MIT"

PV = "2.8.1"

RPM_NAME = "modello-2.8.1-1.1.noarch.rpm"
RPM_HASH = "230081a345e13e839b84bed070a0500d4e2375198bf6c27ad58e0ba72db6ce1c7306e39422f5bb6064f38e60256b2393fb53f9d90207f35eef781b17d9405b49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello \
mvn-org.codehaus.modello-modello-core \
mvn-org.codehaus.modello-modello-core-pom- \
mvn-org.codehaus.modello-modello-plugin-converters \
mvn-org.codehaus.modello-modello-plugin-converters-pom- \
mvn-org.codehaus.modello-modello-plugin-dom4j \
mvn-org.codehaus.modello-modello-plugin-dom4j-pom- \
mvn-org.codehaus.modello-modello-plugin-jackson \
mvn-org.codehaus.modello-modello-plugin-jackson-pom- \
mvn-org.codehaus.modello-modello-plugin-java \
mvn-org.codehaus.modello-modello-plugin-java-pom- \
mvn-org.codehaus.modello-modello-plugin-jdom \
mvn-org.codehaus.modello-modello-plugin-jdom-pom- \
mvn-org.codehaus.modello-modello-plugin-jsonschema \
mvn-org.codehaus.modello-modello-plugin-jsonschema-pom- \
mvn-org.codehaus.modello-modello-plugin-sax \
mvn-org.codehaus.modello-modello-plugin-sax-pom- \
mvn-org.codehaus.modello-modello-plugin-snakeyaml \
mvn-org.codehaus.modello-modello-plugin-snakeyaml-pom- \
mvn-org.codehaus.modello-modello-plugin-stax \
mvn-org.codehaus.modello-modello-plugin-stax-pom- \
mvn-org.codehaus.modello-modello-plugin-velocity \
mvn-org.codehaus.modello-modello-plugin-velocity-pom- \
mvn-org.codehaus.modello-modello-plugin-xdoc \
mvn-org.codehaus.modello-modello-plugin-xdoc-pom- \
mvn-org.codehaus.modello-modello-plugin-xml \
mvn-org.codehaus.modello-modello-plugin-xml-pom- \
mvn-org.codehaus.modello-modello-plugin-xpp3 \
mvn-org.codehaus.modello-modello-plugin-xpp3-pom- \
mvn-org.codehaus.modello-modello-plugin-xsd \
mvn-org.codehaus.modello-modello-plugin-xsd-pom-"

RDEPENDS:${PN} += "/usr/bin/bash \
aopalliance \
apache-commons-lang3 \
atinject \
google-guice \
guava \
jackson-core \
jakarta-inject \
java-headless \
javadoc-parser \
javapackages-filesystem \
javapackages-tools \
jsoup \
mvn-com.fasterxml.jackson.core-jackson-annotations \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-com.fasterxml.jackson.core-jackson-databind \
mvn-com.github.chhorz-javadoc-parser \
mvn-com.google.inject-guice \
mvn-org.apache.velocity-velocity-engine-core \
mvn-org.codehaus.plexus-plexus-build-api \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml \
mvn-org.eclipse.sisu-org.eclipse.sisu.plexus \
mvn-org.jsoup-jsoup \
mvn-org.slf4j-slf4j-api \
mvn-org.yaml-snakeyaml \
objectweb-asm \
plexus-build-api \
plexus-build-api0 \
plexus-classworlds \
plexus-containers-component-annotations \
plexus-utils \
plexus-xml \
sisu-inject \
sisu-plexus \
slf4j \
snakeyaml \
velocity-engine-core"

inherit rpm

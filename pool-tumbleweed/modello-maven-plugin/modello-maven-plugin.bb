SUMMARY = "Modello Maven Plugin"
DESCRIPTION = "Modello is a Data Model toolkit in use by the Apache Maven Project. \
 \
Modello is a framework for code generation from a simple model. \
Modello generates code from a simple model format based on a plugin \
architecture, various types of code and descriptors can be generated \
from the single model, including Java POJOs, XML \
marshallers/unmarshallers, XSD and documentation. \
 \
Modello Maven Plugin enables the use of Modello in Maven builds."
LICENSE = "Apache-2.0 & MIT"

PV = "2.8.1"

RPM_NAME = "modello-maven-plugin-2.8.1-1.1.noarch.rpm"
RPM_HASH = "7acbcf9d26e4dbe8c6e3d9029be0a58b20ba6cd9a15c2c7c6d39801d4dce22ef52524f1a8ba4a23198d22fdcbe2494d6d897e5aded7521e4a9da6c7b0b42c402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "modello-maven-plugin \
mvn-org.codehaus.modello-modello-maven-plugin \
mvn-org.codehaus.modello-modello-maven-plugin-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.codehaus.modello-modello-core \
mvn-org.codehaus.modello-modello-plugin-converters \
mvn-org.codehaus.modello-modello-plugin-dom4j \
mvn-org.codehaus.modello-modello-plugin-jackson \
mvn-org.codehaus.modello-modello-plugin-java \
mvn-org.codehaus.modello-modello-plugin-jdom \
mvn-org.codehaus.modello-modello-plugin-jsonschema \
mvn-org.codehaus.modello-modello-plugin-sax \
mvn-org.codehaus.modello-modello-plugin-snakeyaml \
mvn-org.codehaus.modello-modello-plugin-stax \
mvn-org.codehaus.modello-modello-plugin-velocity \
mvn-org.codehaus.modello-modello-plugin-xdoc \
mvn-org.codehaus.modello-modello-plugin-xpp3 \
mvn-org.codehaus.modello-modello-plugin-xsd \
mvn-org.codehaus.plexus-plexus-build-api \
mvn-org.codehaus.plexus-plexus-utils \
mvn-org.codehaus.plexus-plexus-xml"

inherit rpm

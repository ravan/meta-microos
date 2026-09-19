SUMMARY = "Apache UIMA is an implementation of the OASIS-UIMA specifications"
DESCRIPTION = "Apache UIMA is an implementation of the OASIS-UIMA specifications. \
 \
OASIS UIMA Committee: <http://www.oasis-open.org/committees/uima/>. \
 \
Unstructured Information Management applications are software systems \
that analyze large volumes of unstructured information in order to \
discover knowledge that is relevant to an end user. \
 \
An example UIM application might ingest plain text and identify \
entities, such as persons, places, organizations; or relations, \
such as works-for or located-at."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "uimaj-3.5.0-6.1.aarch64.rpm"
RPM_HASH = "f056901e6c625d5668b6ea8f4d7eb3dba061fbde3bebc988689b3c4b9bcee5bc0c537196d667394d7f1407ee470b006d3c52ee8d610e029e0182510e58542074"

RPROVIDES:${PN} += "mvn-org.apache.uima-aggregate-uimaj-pom- \
mvn-org.apache.uima-jVinci \
mvn-org.apache.uima-jVinci-pom- \
mvn-org.apache.uima-uimaj-adapter-vinci \
mvn-org.apache.uima-uimaj-adapter-vinci-pom- \
mvn-org.apache.uima-uimaj-bom-pom- \
mvn-org.apache.uima-uimaj-bootstrap \
mvn-org.apache.uima-uimaj-bootstrap-pom- \
mvn-org.apache.uima-uimaj-core \
mvn-org.apache.uima-uimaj-core-pom- \
mvn-org.apache.uima-uimaj-cpe \
mvn-org.apache.uima-uimaj-cpe-pom- \
mvn-org.apache.uima-uimaj-document-annotation \
mvn-org.apache.uima-uimaj-document-annotation-pom- \
mvn-org.apache.uima-uimaj-documentation-pom- \
mvn-org.apache.uima-uimaj-json \
mvn-org.apache.uima-uimaj-json-pom- \
mvn-org.apache.uima-uimaj-parent-pom- \
mvn-org.apache.uima-uimaj-pom- \
mvn-org.apache.uima-uimaj-tools \
mvn-org.apache.uima-uimaj-tools-pom- \
osgi-org.apache.uima.j-adapter-vinci \
osgi-org.apache.uima.j-core \
osgi-org.apache.uima.j-cpe \
osgi-org.apache.uima.j-tools \
osgi-org.apache.uima.jVinci \
uimaj"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.fasterxml.jackson.core-jackson-core \
mvn-org.apache.logging.log4j-log4j-api \
mvn-org.apache.logging.log4j-log4j-core \
mvn-org.apache.logging.log4j-log4j-slf4j2-impl \
mvn-org.slf4j-slf4j-api"

inherit rpm

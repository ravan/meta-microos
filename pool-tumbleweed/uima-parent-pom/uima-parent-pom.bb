SUMMARY = "Apache UIMA Parent POM"
DESCRIPTION = "UIMA (Unstructured Information Management Architecture). \
UIMA promotes community development and reuse of annotators \
that extract meta-data from unstructured information (text, \
audio, video, etc.); it provides for externalized declaration of \
type systems, component configuration, aggregation, and more, \
supports scalablity, and provides tooling. \
 \
This package provides Parent for Apache UIMA Projects."
LICENSE = "Apache-2.0"

PV = "18"

RPM_NAME = "uima-parent-pom-18-1.4.noarch.rpm"
RPM_HASH = "965802a8eb15436e85ca6f1a4e56bc0fefb57cb293b791a2556772e3f2a75eb76197e6348acfa002b6b4562a04632083ee96c69e932c9f2ece51627fefa9eca0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.uima-parent-pom-pom- \
uima-parent-pom"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache-apache-pom- \
mvn-org.codehaus.mojo-build-helper-maven-plugin"

inherit rpm

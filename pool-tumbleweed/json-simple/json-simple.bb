SUMMARY = "Simple Java toolkit for JSON"
DESCRIPTION = "JSON.simple is a simple Java toolkit for JSON. You can use JSON.simple \
to encode or decode JSON text. \
  * Full compliance with JSON specification (RFC4627) and reliable \
  * Provides multiple functionalities such as encode, decode/parse \
    and escape JSON text while keeping the library lightweight \
  * Flexible, simple and easy to use by reusing Map and List interfaces \
  * Supports streaming output of JSON text \
  * Stoppable SAX-like interface for streaming input of JSON text \
  * Heap based parser \
  * High performance (see performance testing) \
  * No dependency on external libraries \
  * Both of the source code and the binary are JDK1.2 compatible"
LICENSE = "Apache-2.0"

PV = "2.3.1"

RPM_NAME = "json-simple-2.3.1-2.4.noarch.rpm"
RPM_HASH = "79b75d2d167b2dcc70ffbf1f0bf7c16379198f24202a770e3f61847b23cf35ec30ad28ec9121ee78a7234c412f553a03c09292d3eebaa1ccd05b28a237b8ada8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "json-simple \
mvn-com.github.cliftonlabs-json-simple \
mvn-com.github.cliftonlabs-json-simple-pom- \
mvn-com.googlecode.json-simple-json-simple \
mvn-com.googlecode.json-simple-json-simple-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem"

inherit rpm

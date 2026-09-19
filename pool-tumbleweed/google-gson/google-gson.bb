SUMMARY = "Java lib for conversion of Java objects into JSON representation"
DESCRIPTION = "Gson is a Java library that can be used to convert a Java object into its \
JSON representation. It can also be used to convert a JSON string into an \
equivalent Java object. Gson can work with arbitrary Java objects including \
pre-existing objects that you do not have source-code of."
LICENSE = "Apache-2.0"

PV = "2.14.0"

RPM_NAME = "google-gson-2.14.0-1.1.noarch.rpm"
RPM_HASH = "f16814f044a5143ca2beb71f8faf71d7bae6fa81899c8fbef229655dea4e1f0210ea88e8a92391dfa3bb3b4d65dd774afc09c83d227f1dad689797bc4718bc3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-gson \
mvn-com.google.code.gson-gson \
mvn-com.google.code.gson-gson-extras \
mvn-com.google.code.gson-gson-extras-pom- \
mvn-com.google.code.gson-gson-pom- \
osgi-com.google.gson"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-com.google.errorprone-error-prone-annotations \
mvn-javax.annotation-jsr250-api"

inherit rpm

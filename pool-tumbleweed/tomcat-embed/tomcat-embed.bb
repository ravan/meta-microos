SUMMARY = "Libraries for Embedding Apache Tomcat"
DESCRIPTION = "Embeddeding support (various libraries) for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.121"

RPM_NAME = "tomcat-embed-9.0.121-1.1.noarch.rpm"
RPM_HASH = "b5c90a933040e1a35252c5f06dd1120de427cb1937fc3524719a72076d14305ffe47df5f35fc4267bb1ba11b5da8da178a635973f875b47bee873beb1ed6a1ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn-org.apache.tomcat.embed-tomcat-embed-core \
mvn-org.apache.tomcat.embed-tomcat-embed-core-pom- \
mvn-org.apache.tomcat.embed-tomcat-embed-el \
mvn-org.apache.tomcat.embed-tomcat-embed-el-pom- \
mvn-org.apache.tomcat.embed-tomcat-embed-jasper \
mvn-org.apache.tomcat.embed-tomcat-embed-jasper-pom- \
mvn-org.apache.tomcat.embed-tomcat-embed-websocket \
mvn-org.apache.tomcat.embed-tomcat-embed-websocket-pom- \
osgi-org.apache.tomcat-embed-core \
osgi-org.apache.tomcat-embed-jasper \
osgi-org.apache.tomcat-embed-jasper-el \
osgi-org.apache.tomcat-embed-websocket \
tomcat-embed \
tomcat-implementation-embed"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.tomcat-tomcat-annotations-api \
mvn-org.eclipse.jdt-ecj"

inherit rpm

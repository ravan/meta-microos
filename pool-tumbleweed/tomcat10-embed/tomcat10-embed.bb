SUMMARY = "Libraries for Embedding Apache Tomcat"
DESCRIPTION = "Embeddeding support (various libraries) for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "10.1.59"

RPM_NAME = "tomcat10-embed-10.1.59-1.1.noarch.rpm"
RPM_HASH = "ed84fa0fbf9fe6f635e6695c171830f54446c64cb0c7257cf029d3d45a8db6408d8372d5553464d121b491df6e3d618dfe868c64a84305589bc4fefbe7119b86"
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
tomcat-implementation-embed \
tomcat10-embed"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.tomcat-tomcat-annotations-api \
mvn-org.eclipse.jdt-ecj"

inherit rpm

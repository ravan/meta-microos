SUMMARY = "Libraries for Embedding Apache Tomcat"
DESCRIPTION = "Embeddeding support (various libraries) for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "11.0.25"

RPM_NAME = "tomcat11-embed-11.0.25-1.1.noarch.rpm"
RPM_HASH = "64ab635a680e2985effbca44d92bbce4d49ed84e040a0e7eaeb4777a3557a2834212d474e468a0148d008f746859df26612ce0d8d0572a3dcd78375e57bf9f91"
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
tomcat11-embed"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.apache.tomcat-tomcat-annotations-api \
mvn-org.eclipse.jdt-ecj"

inherit rpm

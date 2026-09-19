SUMMARY = "Libraries needed to run the Tomcat Web container"
DESCRIPTION = "Libraries required to successfully run the Tomcat Web container"
LICENSE = "Apache-2.0"

PV = "10.1.59"

RPM_NAME = "tomcat10-lib-10.1.59-1.1.noarch.rpm"
RPM_HASH = "8f347a74d2e3993fb4c2c737d9d25badb4f83c884eae8b7156818dd0ca7130727f435322152ab26a63768bc7ba58488572f9ac1bfe55d910866171348e12ff0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat10-lib \
jakarta-commons-dbcp-tomcat5 \
mvn-org.apache.tomcat-tomcat-annotations-api \
mvn-org.apache.tomcat-tomcat-annotations-api-pom- \
mvn-org.apache.tomcat-tomcat-api \
mvn-org.apache.tomcat-tomcat-api-pom- \
mvn-org.apache.tomcat-tomcat-catalina \
mvn-org.apache.tomcat-tomcat-catalina-ha \
mvn-org.apache.tomcat-tomcat-catalina-ha-pom- \
mvn-org.apache.tomcat-tomcat-catalina-pom- \
mvn-org.apache.tomcat-tomcat-coyote \
mvn-org.apache.tomcat-tomcat-coyote-pom- \
mvn-org.apache.tomcat-tomcat-dbcp \
mvn-org.apache.tomcat-tomcat-dbcp-pom- \
mvn-org.apache.tomcat-tomcat-jasper \
mvn-org.apache.tomcat-tomcat-jasper-el \
mvn-org.apache.tomcat-tomcat-jasper-el-pom- \
mvn-org.apache.tomcat-tomcat-jasper-pom- \
mvn-org.apache.tomcat-tomcat-jaspic-api \
mvn-org.apache.tomcat-tomcat-jaspic-api-pom- \
mvn-org.apache.tomcat-tomcat-jdbc \
mvn-org.apache.tomcat-tomcat-jdbc-pom- \
mvn-org.apache.tomcat-tomcat-jni \
mvn-org.apache.tomcat-tomcat-jni-pom- \
mvn-org.apache.tomcat-tomcat-juli \
mvn-org.apache.tomcat-tomcat-juli-pom- \
mvn-org.apache.tomcat-tomcat-tribes \
mvn-org.apache.tomcat-tomcat-tribes-pom- \
mvn-org.apache.tomcat-tomcat-util \
mvn-org.apache.tomcat-tomcat-util-pom- \
mvn-org.apache.tomcat-tomcat-util-scan \
mvn-org.apache.tomcat-tomcat-util-scan-pom- \
mvn-org.apache.tomcat-tomcat-websocket \
mvn-org.apache.tomcat-tomcat-websocket-api \
mvn-org.apache.tomcat-tomcat-websocket-api-pom- \
mvn-org.apache.tomcat-tomcat-websocket-client-api \
mvn-org.apache.tomcat-tomcat-websocket-client-api-pom- \
mvn-org.apache.tomcat-tomcat-websocket-pom- \
osgi-org.apache.tomcat-annotations-api \
osgi-org.apache.tomcat-api \
osgi-org.apache.tomcat-catalina \
osgi-org.apache.tomcat-catalina-ha \
osgi-org.apache.tomcat-coyote \
osgi-org.apache.tomcat-coyote-ffm \
osgi-org.apache.tomcat-dbcp \
osgi-org.apache.tomcat-jasper \
osgi-org.apache.tomcat-jasper-el \
osgi-org.apache.tomcat-jaspic-api \
osgi-org.apache.tomcat-jni \
osgi-org.apache.tomcat-juli \
osgi-org.apache.tomcat-ssi \
osgi-org.apache.tomcat-storeconfig \
osgi-org.apache.tomcat-tribes \
osgi-org.apache.tomcat-util \
osgi-org.apache.tomcat-util-scan \
osgi-org.apache.tomcat-websocket \
osgi-org.apache.tomcat-websocket-api \
osgi-org.apache.tomcat-websocket-client-api \
osgi-org.apache.tomcat.jdbc \
tomcat-implementation-lib \
tomcat10-lib"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ecj \
java-headless \
javapackages-filesystem \
mvn-org.apache.tomcat-tomcat-el-api \
mvn-org.apache.tomcat-tomcat-jsp-api \
mvn-org.apache.tomcat-tomcat-servlet-api \
mvn-org.apache.tomcat-tomcat-websocket-client-api \
mvn-org.eclipse.jdt-ecj \
tomcat-el-5.0-api \
tomcat-jsp-3.1-api \
tomcat-servlet-6.0-api"

inherit rpm

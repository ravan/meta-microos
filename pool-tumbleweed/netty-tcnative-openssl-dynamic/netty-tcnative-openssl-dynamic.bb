SUMMARY = "Netty/TomcatNative [OpenSSL - Dynamic]]"
DESCRIPTION = "A Mavenized fork of Tomcat Native which incorporates various patches. \
 \
This artifact is dynamically linked to OpenSSL and Apache APR."
LICENSE = "Apache-2.0"

PV = "2.0.80"

RPM_NAME = "netty-tcnative-openssl-dynamic-2.0.80-1.1.aarch64.rpm"
RPM_HASH = "686c66286293ed31f6465ca6d91a694b64bc53c25cc8c84fb2d6ae7152edeb547d1e724e131e33f870a41f5f11646648e810a6f92fb656427d82b6b88c7fc073"

RPROVIDES:${PN} += "libnetty-tcnative-2.0.80.Final.so \
mvn-io.netty-netty-tcnative \
mvn-io.netty-netty-tcnative--linux-aarch-64- \
mvn-io.netty-netty-tcnative-boringssl-static \
mvn-io.netty-netty-tcnative-boringssl-static--linux-aarch-64- \
mvn-io.netty-netty-tcnative-boringssl-static-pom- \
mvn-io.netty-netty-tcnative-libressl-static \
mvn-io.netty-netty-tcnative-libressl-static--linux-aarch-64- \
mvn-io.netty-netty-tcnative-libressl-static-pom- \
mvn-io.netty-netty-tcnative-openssl-static \
mvn-io.netty-netty-tcnative-openssl-static--linux-aarch-64- \
mvn-io.netty-netty-tcnative-openssl-static-pom- \
mvn-io.netty-netty-tcnative-pom- \
netty-tcnative-openssl-dynamic \
osgi-io.netty.tcnative"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
libapr-1.so.0 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3 \
mvn-io.netty-netty-tcnative-classes"

inherit rpm

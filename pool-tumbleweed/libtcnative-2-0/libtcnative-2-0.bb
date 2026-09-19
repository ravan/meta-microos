SUMMARY = "Tomcat resources for performance, compatibility, etc"
DESCRIPTION = "The Apache Tomcat Native Library is an optional component for use \
with Apache Tomcat that allows Tomcat to use OpenSSL as a \
replacement for JSSE to support TLS connections."
LICENSE = "Apache-2.0"

PV = "2.0.15"

RPM_NAME = "libtcnative-2-0-2.0.15-1.3.aarch64.rpm"
RPM_HASH = "cdda5226c5e76773c382fd9fc60f9a1a51dcaf6abb3593ab4c70c046720c1f011759b6e27f9a73d3dea0f2177da62f9f806419855a001a2221a396a70a9fda6d"

RPROVIDES:${PN} += "libtcnative-2-0 \
libtcnative-2.so.0 \
tcnative \
tomcat-native"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm

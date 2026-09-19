SUMMARY = "Tomcat resources for performance, compatibility, etc"
DESCRIPTION = "The Apache Tomcat Native Library is an optional component for use \
with Apache Tomcat that allows Tomcat to use certain native \
resources for performance, compatibility, etc. \
 \
Specifically, the Apache Tomcat Native Library gives Tomcat access \
to the Apache Portable Runtime (APR) library's network connection \
(socket) implementation and random-number generator. See the Apache \
Tomcat documentation for more information on how to configure Tomcat \
to use the APR connector. \
 \
Features of the APR connector: \
 \
* Non-blocking I/O for Keep-Alive requests (between requests) \
* Uses OpenSSL for TLS/SSL capabilities (if supported by linked APR \
  library) \
* FIPS 140-2 support for TLS/SSL (if supported by linked OpenSSL \
  library) \
* Support for IPv4, IPv6 and Unix Domain Sockets"
LICENSE = "Apache-2.0"

PV = "1.3.8"

RPM_NAME = "libtcnative-1-0-1.3.8-1.3.aarch64.rpm"
RPM_HASH = "c83825f6c0c0e7a1ae9a4ad3573ac3fdbe2c674e30e394628f63c2aa3ed382c2959669ddd8dd0f0935899a1e3c9e27a4690a387506e79b5c475a441d0976391d"

RPROVIDES:${PN} += "libtcnative-1-0 \
libtcnative-1.so.0 \
tcnative \
tomcat-native"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libapr-1.so.0 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm

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

RPM_NAME = "libtcnative-1-0-devel-1.3.8-1.3.aarch64.rpm"
RPM_HASH = "92fe1f9ce298854d08b1a38af0b0154885e89599b75c676608aacf0e1ef80c404566bba69651c98143848fc6b8ec679d07efca47bad520b6e31bbf9c19fcdb11"

RPROVIDES:${PN} += "libtcnative-1-0-devel"

RDEPENDS:${PN} += "glibc-devel \
libapr1-devel \
libopenssl-devel \
libtcnative-1-0"

inherit rpm

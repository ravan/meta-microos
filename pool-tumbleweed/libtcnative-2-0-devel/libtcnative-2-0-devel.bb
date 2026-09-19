SUMMARY = "Tomcat resources for performance, compatibility, etc"
DESCRIPTION = "The Apache Tomcat Native Library is an optional component for use \
with Apache Tomcat that allows Tomcat to use OpenSSL as a \
replacement for JSSE to support TLS connections."
LICENSE = "Apache-2.0"

PV = "2.0.15"

RPM_NAME = "libtcnative-2-0-devel-2.0.15-1.3.aarch64.rpm"
RPM_HASH = "d7602e8abf4b08f3da10564e0f805f0764b1fe11261856e4f31258653a042630bca40de51bc09adf4c92b0577717c51f4313b21cf3397166d46fd6edc902b0bb"

RPROVIDES:${PN} += "libtcnative-2-0-devel"

RDEPENDS:${PN} += "glibc-devel \
libapr1-devel \
libopenssl-3-devel \
libtcnative-2-0"

inherit rpm

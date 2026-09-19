SUMMARY = "Hypertext Transfer Protocol version 3 implementation"
DESCRIPTION = "nghttp3 is an implementation of RFC 9114 HTTP/3 mapping over QUIC and \
RFC 9204 QPACK in C. \
 \
It does not depend on any particular QUIC transport implementation. \
 \
This library implements RFC 9114 HTTP/3. It does not support server \
push. \
 \
The following extensions have been implemented: \
 \
* Extensible Prioritization Scheme for HTTP \
* Bootstrapping WebSockets with HTTP/3"
LICENSE = "MIT"

PV = "1.18.0"

RPM_NAME = "libnghttp3-9-1.18.0-2.1.aarch64.rpm"
RPM_HASH = "58082155dc37f7747c05629871fe2f92b9c98011ec45bcb2985bc363a86d95d5cc36294afe563d2928ca5120ed184e613453f9de5e26ce5da96197350015d95a"

RPROVIDES:${PN} += "libnghttp3-9 \
libnghttp3.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

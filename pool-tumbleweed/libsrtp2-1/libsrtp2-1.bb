SUMMARY = "Secure Real-Time Transport Protocol (SRTP) library v2"
DESCRIPTION = "libsrtp is Cisco's implementation of the Secure Real-time Transport \
Protocol (SRTP), the Universal Security Transform (UST), and a \
supporting cryptographic kernel. \
 \
SRTP is a security profile for RTP that adds confidentiality, message \
authentication, and replay protection to that protocol. It is \
specified in RFC 3711. More information about the SRTP protocol \
itself can be found on the Secure RTP page."
LICENSE = "BSD-3-Clause"

PV = "2.8.0"

RPM_NAME = "libsrtp2-1-2.8.0-1.3.aarch64.rpm"
RPM_HASH = "2dfa7cb4cb5d69ef0f88e463cba1b27fd52bb2a00e055f3fa2dabfd5d8f72a1e7cd089435f08b7133a32fea0ef4afdf50629dea10132fce603296444018dacd1"

RPROVIDES:${PN} += "libsrtp2-1 \
libsrtp2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm

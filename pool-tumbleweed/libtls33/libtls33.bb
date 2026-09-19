SUMMARY = "A simplified interface for the OpenSSL/LibreSSL TLS protocol implementation"
DESCRIPTION = "LibreSSL is an implementation of the Secure Sockets Layer (SSL) and \
Transport Layer Security (TLS) protocols. It derives from OpenSSL, \
with refactorings. \
 \
The libtls library provides a modern and simplified interface (of \
libssl) for secure client and server communications."
LICENSE = "OpenSSL"

PV = "4.3.2"

RPM_NAME = "libtls33-4.3.2-1.3.aarch64.rpm"
RPM_HASH = "b67b05686aaf1dad5d8faa10497a9ddaee8ff835d9a6ab916adbb06f57d5599719de609cc8a36cb2d534bd7c644f71a3de613fe9973eb2a083372d81fe9b1d45"

RPROVIDES:${PN} += "libtls.so.33 \
libtls33"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.57 \
libssl.so.60"

inherit rpm

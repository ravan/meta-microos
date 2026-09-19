SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "LibreSSL is an implementation of the Secure Sockets Layer (SSL) and \
Transport Layer Security (TLS) protocols. It derives from OpenSSL, \
with refactorings."
LICENSE = "OpenSSL"

PV = "4.3.2"

RPM_NAME = "libssl60-4.3.2-1.3.aarch64.rpm"
RPM_HASH = "7222509864cfd29ff66eb88d516837842e3ca66bc874f157ace74875a92df7403eca8a77e013ff76015f3b912800312a0ca5e206988522406d3c17baa3a17566"

RPROVIDES:${PN} += "libssl.so.60 \
libssl60"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.57"

inherit rpm

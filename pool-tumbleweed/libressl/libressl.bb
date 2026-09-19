SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "LibreSSL is an implementation of the Secure Sockets Layer (SSL) and \
Transport Layer Security (TLS) protocols. It derives from OpenSSL, \
with refactorings."
LICENSE = "OpenSSL"

PV = "4.3.2"

RPM_NAME = "libressl-4.3.2-1.3.aarch64.rpm"
RPM_HASH = "8d82caf35a9fcb42f7134a563b6893cfffa03b7c16083c0db8042debf55848a80d1eff23bfc196013dc9d2a2ef72886919e056597dbd67deb06a7d8e5eaed6a5"

RPROVIDES:${PN} += "config-libressl \
libressl \
openssl-cli \
ssl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

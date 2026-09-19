SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "BoringSSL is an implementation of the Secure Sockets Layer (SSL) and \
Transport Layer Security (TLS) protocols, derived from OpenSSL."
LICENSE = "OpenSSL"

PV = "0.20260813"

RPM_NAME = "libboringssl1-0.20260813-2.1.aarch64.rpm"
RPM_HASH = "23e33eb82ba39ff1a4703f88d5de051b05af3e3072a26fdbaf8d1b5e47ec8d407aa4194aa8ccb8bb569680796b085ff90019c50490218f221374066a5afe055a"

RPROVIDES:${PN} += "libboringssl-crypto.so.1 \
libboringssl-ssl.so.1 \
libboringssl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

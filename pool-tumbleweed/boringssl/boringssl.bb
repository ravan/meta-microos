SUMMARY = "An SSL/TLS protocol implementation"
DESCRIPTION = "BoringSSL is an implementation of the Secure Sockets Layer (SSL) and \
Transport Layer Security (TLS) protocols, derived from OpenSSL."
LICENSE = "OpenSSL"

PV = "0.20260813"

RPM_NAME = "boringssl-0.20260813-2.1.aarch64.rpm"
RPM_HASH = "765b3d4fb81b56de7d8c6f9a1cd75274a0ad38ab4f7ba1a8223821326e1c5bdd50dfaa9627c754a728ee7f1c0172e8dd41dd097431e253b692f5de934a9a22a5"

RPROVIDES:${PN} += "boringssl"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboringssl-crypto.so.1 \
libboringssl-ssl.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Post-quantum hybrid cryptography library"
DESCRIPTION = "libzupt1 provides the shared runtime library for applications that use \
libzupt for post-quantum hybrid cryptography based on ML-KEM-768 + X25519."
LICENSE = "MIT"

PV = "1.0.8"

RPM_NAME = "libzupt1-1.0.8-1.4.aarch64.rpm"
RPM_HASH = "eb67016e9319c44c786ffa70e8bd613570b144d53b546118a4d9808246662cb98edc3b1b87f56e82aabe8e2e81608ee65424b37b2d9e0ab51fab21b57c5baa7d"

RPROVIDES:${PN} += "libzupt.so.1 \
libzupt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

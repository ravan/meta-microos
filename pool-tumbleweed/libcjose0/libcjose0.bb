SUMMARY = "C library implementing the Javascript Object Signing and Encryption (JOSE)"
DESCRIPTION = "C library implementing the Javascript Object Signing and Encryption (JOSE)"
LICENSE = "MIT"

PV = "0.6.2.8"

RPM_NAME = "libcjose0-0.6.2.8-2.1.aarch64.rpm"
RPM_HASH = "f08e86e70f49ae012885e255e9ef9405349fffe841a1bd3fbf46551d3d5e664a35ec9abe585b1bb35a34378e07b1202f7142354688cd1374a445f273ce814ef9"

RPROVIDES:${PN} += "libcjose.so.0 \
libcjose0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libjansson.so.4"

inherit rpm

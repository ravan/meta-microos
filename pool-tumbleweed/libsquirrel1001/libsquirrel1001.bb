SUMMARY = "Development files for squirrel"
DESCRIPTION = "This package contains runtime library for Squirrel"
LICENSE = "MIT"

PV = "3.2"

RPM_NAME = "libsquirrel1001-3.2-4.6.aarch64.rpm"
RPM_HASH = "26dcb844e58d248c9b724a72cae9587b83ea84dbe0f2dc886e0836cee3bdd5be8fa4e8e9abfaa42da4da8297446f9366ad2c10821cde2dc50136fef8f8aab3d3"

RPROVIDES:${PN} += "libsqstdlib3.so.1001 \
libsquirrel1001 \
libsquirrel3.so.1001"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

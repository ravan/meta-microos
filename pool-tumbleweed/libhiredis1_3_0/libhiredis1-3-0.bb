SUMMARY = "Shared library for hiredis"
DESCRIPTION = "Shared library for hiredis. The hiredis-example and \
hiredis-test are in hiredis package."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libhiredis1_3_0-1.3.0-1.6.aarch64.rpm"
RPM_HASH = "d7fd8ef55ca4e85543c43a2e49750c764496c20b67263069a521189ed1d1e554ce00394a92ab0402d1c025148a56f47cd75d24210dee5cb0bb08a9f9fe3f4ebd"

RPROVIDES:${PN} += "libhiredis-ssl.so.1.3.0 \
libhiredis.so.1.3.0 \
libhiredis1-3-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm

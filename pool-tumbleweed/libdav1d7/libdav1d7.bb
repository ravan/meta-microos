SUMMARY = "AV1 decoder library"
DESCRIPTION = "dav1d is an AV1 decoder library."
LICENSE = "BSD-2-Clause"

PV = "1.5.4"

RPM_NAME = "libdav1d7-1.5.4-1.2.aarch64.rpm"
RPM_HASH = "c576414564b9bd8b2e9c856522506576e36757d32aea56beb2f9333d5f2cc6b7ecb23c041622d3264082b0d51e113e81b0f5a5b9578ba3f1ea5152e4a33247a2"

RPROVIDES:${PN} += "libdav1d.so.7 \
libdav1d7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

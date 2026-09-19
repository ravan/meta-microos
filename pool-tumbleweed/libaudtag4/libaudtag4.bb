SUMMARY = "ID3 and APE metadata support for Audacious"
DESCRIPTION = "Library from the Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.6.1"

RPM_NAME = "libaudtag4-4.6.1-1.3.aarch64.rpm"
RPM_HASH = "fe2aac5d097b74e300bf8d23394cd8c7e9edd94bc412794e8e27e9686dbdf29b04ce23a6dd8ed47942d2c20cf92d13af76d88d00499eea00317ffbfef06b0d95"

RPROVIDES:${PN} += "libaudtag.so.4 \
libaudtag4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libaudcore.so.6 \
libaudcore6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6"

inherit rpm

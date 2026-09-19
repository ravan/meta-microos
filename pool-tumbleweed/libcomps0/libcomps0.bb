SUMMARY = "Libraries for libcomps"
DESCRIPTION = "Libraries for libcomps"
LICENSE = "GPL-2.0-or-later"

PV = "0.1.21"

RPM_NAME = "libcomps0-0.1.21-2.7.aarch64.rpm"
RPM_HASH = "891a52019cb63b26d3d02851189e82520641951096d76defd1abad7c738796e2a9cff40f37cdb7e324cd23836b2a97883b4efa0202591a42044780728079df85"

RPROVIDES:${PN} += "libcomps.so.0 \
libcomps0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libexpat.so.1 \
libm.so.6 \
libxml2.so.16"

inherit rpm

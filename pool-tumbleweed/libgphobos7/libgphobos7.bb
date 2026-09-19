SUMMARY = "GNU D compiler runtime library"
DESCRIPTION = "Runtime library for the GNU D language."
LICENSE = "BSL-1.0"

PV = "16.2.0+git9497"

RPM_NAME = "libgphobos7-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "e2c5c5809b655d464379820c581f6acd9306098af8a80e1c8e6330c7592086f0729a7a56f2abe79357645ed730f4e20308b637b63cd1ecc148c1264007ca9200"

RPROVIDES:${PN} += "libgphobos.so.7 \
libgphobos7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm

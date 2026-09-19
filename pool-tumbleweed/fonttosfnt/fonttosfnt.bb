SUMMARY = "Utility to wrap a bitmap font in a sfnt (TrueType) wrapper"
DESCRIPTION = "Wrap a bitmap font or a set of bitmap fonts in a sfnt (TrueType or \
OpenType) wrapper."
LICENSE = "MIT"

PV = "1.2.5"

RPM_NAME = "fonttosfnt-1.2.5-1.5.aarch64.rpm"
RPM_HASH = "4232438b0e9979d26d34f5f11c6dc7f98fe32b5e3fef55d0108d38ecd4f97545fdd1e09cced6ba86da02e497d6f41b879b8aa0b67a6e0b47880a5e0422acdb86"

RPROVIDES:${PN} += "fonttosfnt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfontenc.so.1 \
libfreetype.so.6 \
libm.so.6"

inherit rpm

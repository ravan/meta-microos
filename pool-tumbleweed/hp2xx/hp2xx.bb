SUMMARY = "Converts HP-GL Plotter Language into a Variety of Formats"
DESCRIPTION = "The hp2xx program is a versatile tool for converting vector graphics \
data given in Hewlett-Packard's HP-GL plotter language into a variety \
of popular graphics formats, both vector and raster."
LICENSE = "GPL-2.0+"

PV = "3.4.4"

RPM_NAME = "hp2xx-3.4.4-2.12.aarch64.rpm"
RPM_HASH = "5b96ed841a2335805cc0243ce13d87fa9757a31bd6d906d2ac8e4ac165f8488dac9a7441c896ab1b3130f6e04f8ef6f4898864aab6e76c840964d7b7a1379c7c"

RPROVIDES:${PN} += "hp2xx"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libtiff.so.6"

inherit rpm

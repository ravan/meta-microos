SUMMARY = "A library for font loading and glyph rasterization using FreeType/pixman"
DESCRIPTION = "fcft is a font loading and glyph rasterization library built on-top \
of FontConfig, FreeType2 and pixman."
LICENSE = "MIT"

PV = "3.3.3"

RPM_NAME = "libfcft4-3.3.3-1.4.aarch64.rpm"
RPM_HASH = "27266121f720d990b16c634e32cfb71a99c72f04847f33f1157ba7ab47a5f545061106697ec1c362b77e8d797772fb540f71674595847c7fc2ba5f6891b63264"

RPROVIDES:${PN} += "libfcft.so.4 \
libfcft4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libharfbuzz.so.0 \
libnanosvg.so.0 \
libnanosvgrast.so.0 \
libpixman-1.so.0 \
libutf8proc.so.3"

inherit rpm

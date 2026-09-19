SUMMARY = "Simple DirectMedia Layer – Truetype library"
DESCRIPTION = "This is a sample library that allows you to use TrueType fonts in your \
SDL applications."
LICENSE = "Zlib"

PV = "2.0.11"

RPM_NAME = "libSDL_ttf-2_0-0-2.0.11-7.35.aarch64.rpm"
RPM_HASH = "2689ec95be2710eee4d053e879ef7e97358d707cdb449f19ece9ea17f7e2162e7f9d4c1517e27e2a744c9bee80c0fed913052acdb46942cd597109a3f19a5c9d"

RPROVIDES:${PN} += "SDL-ttf \
libSDL-ttf-2-0-0 \
libSDL-ttf-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libfreetype.so.6"

inherit rpm

SUMMARY = "SDL3 client for freeciv"
DESCRIPTION = "Freeciv executable using the SDL3 library"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "freeciv-sdl3-3.2.6-2.1.aarch64.rpm"
RPM_HASH = "9cf5b36a4ac11ddbbff4f606063adc5c9f857e08f9df88b754b539c2dd77ed740a7623fafc1e641c326d5f42009babaf04eae9ce98aa699cb6e72a3e7ba8d810"

RPROVIDES:${PN} += "freeciv-client-3.2.6 \
freeciv-sdl3"

RDEPENDS:${PN} += "freeciv \
ld-linux-aarch64.so.1 \
libSDL3-image.so.0 \
libSDL3-mixer.so.0 \
libSDL3-ttf.so.0 \
libSDL3.so.0 \
libc.so.6 \
libfreeciv.so \
liblua5.4.so.5 \
libm.so.6"

inherit rpm

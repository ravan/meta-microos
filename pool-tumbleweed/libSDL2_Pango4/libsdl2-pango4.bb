SUMMARY = "Shared library for SDL2_Pango"
DESCRIPTION = "SDL2_Pango is a library for graphically rendering internationalized and tagged \
text in SDL2 using TrueType fonts. SDL2_Pango is a port of SDL_Pango to SDL2. \
 \
This package provides the shared library for SDL2_Pango."
LICENSE = "LGPL-2.1-or-later"

PV = "2.1.5"

RPM_NAME = "libSDL2_Pango4-2.1.5-1.12.aarch64.rpm"
RPM_HASH = "30497f20aa5e860eaf140d853ff81740bba9d6215fa8c5262ff4b625b0abee317a0d3d3fe5c085dee7b2e283aeab57417d66b8e3f6644d4262dfff854aba114c"

RPROVIDES:${PN} += "libSDL2-Pango.so.4 \
libSDL2-Pango4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0"

inherit rpm

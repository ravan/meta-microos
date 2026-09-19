SUMMARY = "Programming Pango via SDL"
DESCRIPTION = "Pango is the text rendering engine of GNOME 2.x. SDL_Pango connects the \
engine to SDL."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.2"

RPM_NAME = "libSDL_Pango1-0.1.2-241.8.aarch64.rpm"
RPM_HASH = "196c893c8c6ea808884f4ae21783b1049bc9f5b733873e51644b01a0b2dc538215f69875b99298e62ecb4e817840a6b62d90fc226182cb83e8e37e5a7d90a444"

RPROVIDES:${PN} += "libSDL-Pango.so.1 \
libSDL-Pango1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0"

inherit rpm

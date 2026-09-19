SUMMARY = "Gedit Technology - File loading and saving"
DESCRIPTION = "libgedit-gfls is a module dedicated to file loading and saving for the needs of gedit and other similar text editors."
LICENSE = "LGPL-3.0-or-later"

PV = "0.4.2"

RPM_NAME = "libgedit-gfls-1-0-0.4.2-1.1.aarch64.rpm"
RPM_HASH = "38d650e22fe7ba54e1fc0b3f257b0c5be4ec74fd97c4caa4839f8b27f8aeec2381e099abfc8aaead9d6212ff330130d37c2fc6fd7cd1980a405488c993df3537"

RPROVIDES:${PN} += "libgedit-gfls \
libgedit-gfls-1-0 \
libgedit-gfls-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

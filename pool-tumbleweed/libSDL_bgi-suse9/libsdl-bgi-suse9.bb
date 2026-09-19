SUMMARY = "SDL Graphics Routines for Primitives and Other Support Functions"
DESCRIPTION = "SDL_bgi is a Borland Graphics Interface (BGI) emulation library for \
SDL. It provides extensions for RGB colors and mouse support."
LICENSE = "GPL-2.0-or-later & Zlib"

PV = "3.0.2"

RPM_NAME = "libSDL_bgi-suse9-3.0.2-1.7.aarch64.rpm"
RPM_HASH = "81bbd3547434a17d1c46a0538101984ebfdce1d2ef14f9729e1eceb7550e86a42c6cdb36d8a9aafd3bed76bcc7745fc77685ed3c863be3452ddda387ffbe1843"

RPROVIDES:${PN} += "libSDL-bgi-suse9 \
libSDL-bgi.so.suse9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm

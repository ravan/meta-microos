SUMMARY = "X font handling library for server and utilities"
DESCRIPTION = "libXfont provides the core of the legacy X11 font system, handling \
the index files (fonts.dir, fonts.alias, fonts.scale), the various \
font file formats, and rasterizing them. It is used by the X servers, \
the X Font Server (xfs), and some font utilities (bdftopcf for \
instance), but should not be used by normal X11 clients. X11 clients \
access fonts via either the new APIs in libXft, or the legacy APIs in \
libX11."
LICENSE = "MIT"

PV = "2.0.7"

RPM_NAME = "libXfont2-2-2.0.7-3.1.aarch64.rpm"
RPM_HASH = "4c831ae640b0a2c222b7ed869515e7db94cddf2c86871fd5ee41cf391b9910aae9911f4c34bb33a27cb5092a96de9e329494f05f629e8e2e6059411e6429cf0e"

RPROVIDES:${PN} += "libXfont2-2 \
libXfont2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfontenc.so.1 \
libfreetype.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm

SUMMARY = "Development files for the X font handling library"
DESCRIPTION = "libXfont provides the core of the legacy X11 font system, handling \
the index files (fonts.dir, fonts.alias, fonts.scale), the various \
font file formats, and rasterizing them. It is used by the X servers, \
the X Font Server (xfs), and some font utilities (bdftopcf for \
instance), but should not be used by normal X11 clients. X11 clients \
access fonts via either the new APIs in libXft, or the legacy APIs in \
libX11. \
 \
This package contains the development headers for the library found \
in libXfont2-2."
LICENSE = "MIT"

PV = "2.0.7"

RPM_NAME = "libXfont2-devel-2.0.7-3.1.aarch64.rpm"
RPM_HASH = "d816159cb284df67a9ebe26222cea46a9b67f21fa71451141b131cc7e90d952d773953f14d7a38092f0554cbd105362586190508c166f7d083828670e062dfe1"

RPROVIDES:${PN} += "libXfont2-devel \
pkgconfig-xfont2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXfont2-2 \
pkgconfig-fontenc \
pkgconfig-fontsproto \
pkgconfig-freetype2 \
pkgconfig-xproto \
pkgconfig-zlib"

inherit rpm

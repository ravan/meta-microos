SUMMARY = "Multiple masters font viewer"
DESCRIPTION = "Multiple masters font viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "ftmulti-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "e0220233e54406759b226a01d251fca845951e50c98e9d95580dd32735313f1a5b8897a21fadbe02397cb445b3656a90999eff79ce44f6afc8b7a1f6a0a7522d"

RPROVIDES:${PN} += "ftmulti"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
librsvg-2.so.2"

inherit rpm

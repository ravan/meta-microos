SUMMARY = "Simple glyph viewer"
DESCRIPTION = "Simple glyph viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "ftview-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "cd2bf49282c48ad0a0f8d6af6a6a3a8b11b60f1e346fc4fe7dc9fe5d5c731188b7c3d1fa7548ac105baa5336abe9631961d5935778cf9f8ae86d13ac0bf749b5"

RPROVIDES:${PN} += "ftview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgobject-2.0.so.0 \
libpng16.so.16 \
librsvg-2.so.2"

inherit rpm

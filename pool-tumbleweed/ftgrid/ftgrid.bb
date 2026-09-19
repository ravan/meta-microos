SUMMARY = "Simple glyph grid viewer"
DESCRIPTION = "Simple glyph grid viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "ftgrid-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "f1ed4bcaee32c7a740b545c64cb6f74e89670c561a647aeb07f41d1a47b5e9a04397f8323f8ae4c59c1ea8fc8055014bf61d3ae2ce3352792c26aa2742472e7f"

RPROVIDES:${PN} += "ftgrid"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgobject-2.0.so.0 \
libm.so.6 \
libpng16.so.16 \
librsvg-2.so.2"

inherit rpm

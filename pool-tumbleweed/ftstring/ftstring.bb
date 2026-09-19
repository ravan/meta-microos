SUMMARY = "String viewer"
DESCRIPTION = "String viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "ftstring-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "efb02f7effdf906c8d3d16554b02d8af279cc46a202603615a36c408f39d2c70518931c3a4b05455db80ef57553af898b8a0c2f6ea33b590cacfd3425716c92f"

RPROVIDES:${PN} += "ftstring"

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

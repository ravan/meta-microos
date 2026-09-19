SUMMARY = "Signed Distance Fields viewer"
DESCRIPTION = "Signed Distance Fields viewer \
This tool is part of the FreeType project"
LICENSE = "GPL-2.0-or-later"

PV = "2.14.3"

RPM_NAME = "ftsdf-2.14.3-1.2.aarch64.rpm"
RPM_HASH = "3e9d210834f8249c98dbbe26fd7e772946c089e330e36ba0af354139e33654c32cd53f80006947d65c2f78be25698dc6a1732abac6007f414068a0d480167c8b"

RPROVIDES:${PN} += "ftsdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libfreetype.so.6 \
libgobject-2.0.so.0 \
librsvg-2.so.2"

inherit rpm

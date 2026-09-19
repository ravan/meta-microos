SUMMARY = "Tools for rendering XPS documents"
DESCRIPTION = "libgxps is a GObject based library for handling and rendering XPS \
documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.2+5"

RPM_NAME = "libgxps-tools-0.3.2+5-1.13.aarch64.rpm"
RPM_HASH = "a5c5bfe89ccaabeec5a368a1f1cb3432c74b43cbdf052d76ce911a5ffeb0fb94fe1180f53b87f5ddcb24b903bd7ec89a9b000cccb89aa6099c1a279d0f4b3157"

RPROVIDES:${PN} += "libgxps-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgxps.so.2 \
libjpeg.so.8 \
libpng16.so.16"

inherit rpm

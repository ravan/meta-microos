SUMMARY = "Lightweight LXDE Terminal"
DESCRIPTION = "LXTerminal is a lightweight Terminal Emulator. \
This package even if DE independent is part \
of the LXDE project."
LICENSE = "GPL-2.0-only"

PV = "0.4.0+36"

RPM_NAME = "lxterminal-0.4.0+36-1.9.aarch64.rpm"
RPM_HASH = "92b16e58cf8331b7f0a4e762e901ca30b4e50492b91f4227453129af59bbfa44b1a163c71b4022c3175502e5dda7e16a6ebf07a05d0806253fbc6d1e61ec1fc2"

RPROVIDES:${PN} += "lxterminal"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libvte-2.91.so.0"

inherit rpm

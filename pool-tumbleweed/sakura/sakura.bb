SUMMARY = "Terminal Emulator based on the VTE Library"
DESCRIPTION = "sakura is a vte-based terminal emulator. It aims to provide a terminal \
emulator that only depends on GTK and VTE. It uses a notebook to allow \
multiple tabs in the same window."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.9"

RPM_NAME = "sakura-3.8.9-2.3.aarch64.rpm"
RPM_HASH = "7b06a00c901fa85ea092d098dd6e54a1b9f95419d062972f6f7d4dc1b74c35a218f2af6dc3994ba2069e20f20887c677797bfd5d8ed5b08d378e212d207f1639"

RPROVIDES:${PN} += "sakura"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libvte-2.91.so.0"

inherit rpm

SUMMARY = "Examples for the qt6-httpserver modules"
DESCRIPTION = "Examples for the qt6-httpserver modules."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-httpserver-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "87a58c482fbb257cc8d7ffce6fe10375fb5c3b242a50fd3639e0c12fb4aef8f170fe7a43c740c3bad601988d8a8fd7b1a878a015528fb75a333e52331ac5122c"

RPROVIDES:${PN} += "qt6-httpserver-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6HttpServer.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

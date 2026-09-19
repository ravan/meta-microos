SUMMARY = "Jack plugin for gstreamer-plugins-good"
DESCRIPTION = "This package provides the jack plugin for gstreamer-plugins-good."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-plugins-good-jack-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "1a08faf4ae5e36b94a3092e828c5ee2593cf4626b5d92be97d913784bb36caea97f3e102b8ed9b4c8da35eb82c58d6e180a4373c7e893491c47b34212ac07c6f"

RPROVIDES:${PN} += "gstreamer-plugins-good-jack \
gstreamer1 \
libgstjack.so"

RDEPENDS:${PN} += "gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgstaudio-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm

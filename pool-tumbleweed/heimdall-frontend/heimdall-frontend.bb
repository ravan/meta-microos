SUMMARY = "Samsung Galaxy S Device Firmware Flasher"
DESCRIPTION = "Heimdall is a tool suite used to flash firmware (aka ROMs) onto \
Samsung Galaxy S devices. \
 \
This package contains a graphical user interface for Heimdall."
LICENSE = "MIT"

PV = "1.4.2"

RPM_NAME = "heimdall-frontend-1.4.2-1.41.aarch64.rpm"
RPM_HASH = "6e5f5db31c42218b7a45555bc2598e20b8e0bb6395a051ef051923d39dbbeaabc7c8a7e8ceea4066ef068d46281ee002951986e16f5b1073dccf39af7d7e349f"

RPROVIDES:${PN} += "heimdall-frontend"

RDEPENDS:${PN} += "heimdall \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

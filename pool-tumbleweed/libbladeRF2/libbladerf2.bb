SUMMARY = "SDR radio receiver library"
DESCRIPTION = "Library for bladeRF, an SDR transceiver."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "libbladeRF2-2.6.0-22.3.aarch64.rpm"
RPM_HASH = "a2a815e0a7abaecbfa6432044acf031bef92cd778c37fea78ece622ea493720b2adff533b3f9c2d5d0f1a2768e7f5c7dea1f8211d4025aefab8fdfc6cef7f3fb"

RPROVIDES:${PN} += "libbladeRF.so.2 \
libbladeRF2"

RDEPENDS:${PN} += "/sbin/ldconfig \
bladeRF-udev \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm

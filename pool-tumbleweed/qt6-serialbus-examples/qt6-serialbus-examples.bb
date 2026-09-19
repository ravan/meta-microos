SUMMARY = "Examples for the qt6-serialbus modules"
DESCRIPTION = "Examples for the qt6-serialbus modules."
LICENSE = "GPL-2.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-serialbus-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "3eb1fc30e328fda6180d27b52b0699e3660488748cb837b8b4ad31db96d9a284dd814cd60796bc439adcc73df4593dc4a2ba852add582d8503e3250e3fd7c71d"

RPROVIDES:${PN} += "qt6-serialbus-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6SerialBus.so.6 \
libQt6SerialPort.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

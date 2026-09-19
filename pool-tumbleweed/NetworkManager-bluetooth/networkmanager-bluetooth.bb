SUMMARY = "Bluetooth device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for Bluetooth devices."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.56.1"

RPM_NAME = "NetworkManager-bluetooth-1.56.1-4.1.aarch64.rpm"
RPM_HASH = "874cece52aae6efd98637277409ef0390e47150fa7134bf4d89bb7e0e295ea3ff4a1b7a6274cd267170beb6bea6db618d4714728e1889e985c47a418f78e6a13"

RPROVIDES:${PN} += "NetworkManager-bluetooth \
libnm-device-plugin-bluetooth.so"

RDEPENDS:${PN} += "NetworkManager \
NetworkManager-wwan \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnm-wwan.so"

inherit rpm

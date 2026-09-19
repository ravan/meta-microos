SUMMARY = "Mobile broadband device plugin for NetworkManager"
DESCRIPTION = "This package contains NetworkManager support for mobile broadband (WWAN) \
devices."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.56.1"

RPM_NAME = "NetworkManager-wwan-1.56.1-4.1.aarch64.rpm"
RPM_HASH = "7a3a2f8cdf1fa56e1825b31f451f87d819093689e332c2f1383577725ed84c419ce32f78bf0ea8193930de9c9cb20c517e9c26713c4a52a8bc73aad616d0f257"

RPROVIDES:${PN} += "NetworkManager-wwan \
libnm-device-plugin-wwan.so \
libnm-wwan.so"

RDEPENDS:${PN} += "ModemManager \
NetworkManager \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmm-glib.so.0 \
libsystemd.so.0"

inherit rpm

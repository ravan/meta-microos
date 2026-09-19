SUMMARY = "Plasma screen management library"
DESCRIPTION = "Energy saving display management library for KDE"
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libKF6ScreenDpms8-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "0ff5a9ebd19a1219a0249ab9cfc089e8822eea608a4c612d492c018f392a5df17763fe1e1d18b9663382987069e73b0def3bd447e378311ee12d2a9c7fccb339"

RPROVIDES:${PN} += "libKF6ScreenDpms.so.8 \
libKF6ScreenDpms8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Screen8 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WaylandClient.so.6 \
libc.so.6 \
libstdc++.so.6 \
libwayland-client.so.0 \
libxcb-dpms.so.0 \
libxcb.so.1"

inherit rpm

SUMMARY = "Plasma screen management library"
DESCRIPTION = "Shared library for dynamic display management in Plasma"
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "libKF6Screen8-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "b3fce755f6074905f246dce69ca86fd20471b5b32ab538a40748d212a62305affc0be1d4abaa5d1c355057b1c16cb280cd4bf36a2dfa0c69522adbed2850bf47"

RPROVIDES:${PN} += "libKF6Screen.so.8 \
libKF6Screen8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

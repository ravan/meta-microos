SUMMARY = "Single Sign On Framework for Qt"
DESCRIPTION = "Framework that provides credential storage and authentication service."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "libsignon-qt6-1-8.61-2.10.aarch64.rpm"
RPM_HASH = "3df54abc811c8e753f1172d9437013f5a911afc504007f3f038cec00ebdabfa3ff77c8a63ce282bcd723bf2ea552ed4db79ee662b1deb6bdf4a8b449fe2a641c"

RPROVIDES:${PN} += "libsignon-qt6-1 \
libsignon-qt6.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

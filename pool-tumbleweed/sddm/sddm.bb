SUMMARY = "QML-based display manager (Qt5)"
DESCRIPTION = "SDDM is a display manager for X11 and Wayland. It uses technologies like \
QtQuick, which gives the designer the ability to create animated user \
interfaces."
LICENSE = "GPL-2.0-or-later"

PV = "0.21.0+git57"

RPM_NAME = "sddm-0.21.0+git57-1.1.aarch64.rpm"
RPM_HASH = "6cd14f0dadf5c96c284e52423aff98486ae7ae41f14f06bf3ff5e1b29647208e06e8a67a84e1ca4da898435f297583053bb3e4b1336ae29d2133420d377df105"

RPROVIDES:${PN} += "group-sddm \
sddm \
sddm-lang \
sddm-qt5 \
user-sddm"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/update-alternatives \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libXau.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpam.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
qt5qmlimport-QtQuick.2 \
qt5qmlimport-SddmComponents.2 \
sddm-greeter-qt5 \
systemd \
sysuser-shadow \
xdm"

inherit rpm

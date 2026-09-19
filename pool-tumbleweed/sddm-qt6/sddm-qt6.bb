SUMMARY = "QML-based display manager (Qt6)"
DESCRIPTION = "SDDM is a display manager for X11 and Wayland. It uses technologies like \
QtQuick, which gives the designer the ability to create animated user \
interfaces."
LICENSE = "GPL-2.0-or-later"

PV = "0.21.0+git57"

RPM_NAME = "sddm-qt6-0.21.0+git57-1.1.aarch64.rpm"
RPM_HASH = "2eaadfaa79a6b62b0619ae2e236d2347171d8315853f8078094ff3d23e6c30f031a985d5c98cdd2077ca3fa28675635bee8f81edd6a342bf31eb287b4535cab1"

RPROVIDES:${PN} += "group-sddm \
sddm \
sddm-qt6 \
user-sddm"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/update-alternatives \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libXau.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpam.so.0 \
libstdc++.so.6 \
libsystemd.so.0 \
qt6qmlimport-QtQuick.2 \
qt6qmlimport-SddmComponents.2 \
sddm-greeter-qt6 \
systemd \
sysuser-shadow \
xdm"

inherit rpm

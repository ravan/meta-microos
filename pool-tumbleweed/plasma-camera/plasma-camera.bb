SUMMARY = "Camera application for Plasma Mobile"
DESCRIPTION = "A camera application for Plasma Mobile."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "plasma-camera-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "07905841e0df26fa503674600c9ba88f2cd65f3767df08963720858b31cdd37387ebc158b6565770188c8d3d174c94ceeba37ea95a0d772d0f303b4a518baf56"

RPROVIDES:${PN} += "plasma-camera"

RDEPENDS:${PN} += "kf6-kirigami-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Qml.so.6 \
libQt6Sensors.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcamera-base.so.0.7 \
libcamera.so.0.7 \
libexiv2.so.28 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6-multimedia-imports"

inherit rpm

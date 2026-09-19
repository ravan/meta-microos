SUMMARY = "QML Box2D plugin"
DESCRIPTION = "This plugin is meant to be installed to your Qt/imports directory, or shipped \
in a directory of which the parent is added as import path. \
 \
The goal is to expose the functionality of Box2D as QML components, in order \
to make it easy to write physics-based games in QML."
LICENSE = "Zlib"

PV = "0+git.1713207787.3a85439"

RPM_NAME = "qml-box2d-0+git.1713207787.3a85439-1.7.aarch64.rpm"
RPM_HASH = "7afeaa019339dd0a5122151158d8a149ff2e471b01c02549bb28d1e9d739ebd256924ab7452cd028cf3c759ecbeff1b9f060ed68d251a1423e60705bcfce678e"

RPROVIDES:${PN} += "libqmlbox2d.so \
qml-box2d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

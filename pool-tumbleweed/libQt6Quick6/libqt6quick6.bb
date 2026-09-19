SUMMARY = "Qt 6 Quick library"
DESCRIPTION = "The Qt 6 Quick library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Quick6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "8adb879205fc349cec36f9a5f3ba03e1ac4d291de772a8860422ef6924b0af4870b320788f8e3c7e2cb821b36f8d9300b1d4b2beea7d2122fa80b0965e6991de"

RPROVIDES:${PN} += "libQt6Quick.so.6 \
libQt6Quick6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6Qml.so.6 \
libQt6QmlMeta.so.6 \
libQt6QmlModels.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

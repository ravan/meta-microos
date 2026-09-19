SUMMARY = "Qt 6 Lottie library"
DESCRIPTION = "Qt Lottie Animation provides a QML API for rendering graphics and animations \
that are exported in JSON format by the Lottie plugin. \
This package provides the Qt 6 lottie library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6Lottie6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "e44f9059db65a7cd8ccb26ccbc784b6e9606639268ba9cc795719ef7dfabe2e86e247b30d202687a61c48146a59a6a3ccb22c445ea0081b8db841d03a8abdf02"

RPROVIDES:${PN} += "libQt6Lottie.so.6 \
libQt6Lottie6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

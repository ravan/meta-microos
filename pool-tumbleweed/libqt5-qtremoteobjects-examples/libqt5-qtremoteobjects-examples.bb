SUMMARY = "Qt5 remoteobjects examples"
DESCRIPTION = "Examples for the libqt5-qtremoteobjects module."
LICENSE = "BSD-3-Clause"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtremoteobjects-examples-5.15.19+kde0-1.3.aarch64.rpm"
RPM_HASH = "f16e1dc8b7258c7a7fe0e5c70f863f9e2de4ec3239c301a1ae46cd88823df3e3c2a661ba81aab367a2fc38cd793ef7324cdd5f24d09fecd0d1563fc1656938f9"

RPROVIDES:${PN} += "libqt5-qtremoteobjects-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5RemoteObjects.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

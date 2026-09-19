SUMMARY = "Template for KDE Application Development"
DESCRIPTION = "This package contains templates to start the development of a new KDE \
application/part/plugin."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "26.08.1"

RPM_NAME = "kapptemplate-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "7c81ab95d8212494bcff6e77d937b86de0deea2fe2834104af6cd189b47d27b81209dc5ceab18f4da6c4433749271c8fd893a0579ebd25076e74c759dde8b455"

RPROVIDES:${PN} += "kapptemplate \
kapptemplate5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

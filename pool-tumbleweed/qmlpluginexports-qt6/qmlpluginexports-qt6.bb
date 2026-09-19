SUMMARY = "Tool to list exports provided by QML plugins"
DESCRIPTION = "This tools loads a QML plugin and prints a list of identifiers and versions \
to stdout. See qml-autoreqprov's README for details."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qmlpluginexports-qt6-1.0-1.46.aarch64.rpm"
RPM_HASH = "24d06e5cec429256246498457cc28d72589f89899bd53be9babd797b819a4288b6009352030a1fa06e7fcae8ece69341c291bb81304dcf765123baad1674ac42"

RPROVIDES:${PN} += "qmlpluginexports-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

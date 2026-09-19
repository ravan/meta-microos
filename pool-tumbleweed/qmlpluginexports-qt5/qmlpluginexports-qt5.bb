SUMMARY = "Tool to list exports provided by QML plugins"
DESCRIPTION = "This tools loads a QML plugin and prints a list of identifiers and versions \
to stdout. See qml-autoreqprov's README for details."
LICENSE = "GPL-3.0-or-later"

PV = "1.0"

RPM_NAME = "qmlpluginexports-qt5-1.0-1.34.aarch64.rpm"
RPM_HASH = "49727bc9b511663e1f62e007a8953ab521f42b9050df20b9695b4e51890830ec01cf78b7514faaf814658f3adebb208eb5f4d6e89849e739e221159fdfb35f3f"

RPROVIDES:${PN} += "qmlpluginexports-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

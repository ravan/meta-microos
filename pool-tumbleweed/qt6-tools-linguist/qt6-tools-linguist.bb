SUMMARY = "Translation tool for Qt applications"
DESCRIPTION = "Qt Linguist can be used by translator to translate text in Qt applications."
LICENSE = "(GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.11.2"

RPM_NAME = "qt6-tools-linguist-6.11.2-2.3.aarch64.rpm"
RPM_HASH = "9d1fc9781d28f6ddbd8dc0f7e765885b3aec435fec5bb60bb0b8ff043516867470f2f8c6136562ed27d75bbcf66b34f23544e21de1a9c439bdd3fd5a1186fa30"

RPROVIDES:${PN} += "qt6-tools-linguist"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6QuickWidgets.so.6 \
libQt6UiTools.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

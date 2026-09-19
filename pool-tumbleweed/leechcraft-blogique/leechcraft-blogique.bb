SUMMARY = "LeechCraft Blogging client Module"
DESCRIPTION = "This package provides a modular blogging client plugin for LeechCraft \
which itself supports different blogging platforms via different submodules."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-blogique-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "537ac94667ecff4518ca2db64b25fc036a72a059b54cfcd2d6e23136b408c4a5079a8b8a02803fb524aadef6955125b0e4534903216dde23ef7b332df7e4d739"

RPROVIDES:${PN} += "leechcraft-blogique \
libleechcraft-blogique.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-blogique-subplugin \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-models-qt6.so.0.6.75 \
libleechcraft-util-qml-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6 \
qt6qmlimport-QtQuick"

inherit rpm

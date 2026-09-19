SUMMARY = "Tool for creating shader effects for Qt Quick"
DESCRIPTION = "Qt Quick Effect Maker is a hybrid editor for creating shader effects for Qt \
Quick applications and offers both a node editor and a code editor."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickeffectmaker-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "f69473f96347621f54a5cc3b13f2ccfe0c5d2ae41cdab886c4cfb4521196ea16abd34a9056024cbfc566a8db7e0d89910ff773b00bf9f043859c31f8dc7e5db7"

RPROVIDES:${PN} += "qt6-quickeffectmaker"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Quick3DGlslParser.so.6 \
libQt6ShaderTools.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6qmlimport-QtQuick"

inherit rpm

SUMMARY = "Examples for the qt6-quickeffectmaker modules"
DESCRIPTION = "Examples for the qt6-quickeffectmaker modules."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-quickeffectmaker-examples-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "20fca668d3c6c6599be1344aa264b1ed00a679b15612f0b021d3d8d148f8a5a6b8107ac7429a3bb93ca0b245c1e0016efd00ebb5f48cbb6d50f73426636f29e1"

RPROVIDES:${PN} += "qt6-quickeffectmaker-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls.Material"

inherit rpm

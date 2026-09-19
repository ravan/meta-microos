SUMMARY = "Qt 6 LabsWavefrontMesh library"
DESCRIPTION = "The Qt 6 LabsWavefrontMesh library. \
This library does not have any ABI or API guarantees."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6LabsWavefrontMesh6-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "fc2035ae1c1cd76a82ff689211483ce94c280c1c43879a175b1ce15f0567dee5c5f12b45b4aab7b0b2ccd8b95535601714fd302db074eaa283f69623c4cffe9e"

RPROVIDES:${PN} += "libQt6LabsWavefrontMesh.so.6 \
libQt6LabsWavefrontMesh6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

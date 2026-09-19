SUMMARY = "Qt 6 Protobuf library"
DESCRIPTION = "The Qt 6 Protobuf library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6Protobuf6-6.11.2-1.3.aarch64.rpm"
RPM_HASH = "a78d6bbfdea6ba1b07d3361de28149a2ba1d0b75de3ad405b658d2440f7bf1831a2ae5871672beec3b2fae42071c7db25da7aefd10186d0de1287a55247b2ad5"

RPROVIDES:${PN} += "libQt6Protobuf.so.6 \
libQt6Protobuf6 \
libQt6ProtobufQtCoreTypes.so.6 \
libQt6ProtobufQtGuiTypes.so.6 \
libQt6ProtobufQuick.so.6 \
libQt6ProtobufWellKnownTypes.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Qt 6 Protobuf library - Development files"
DESCRIPTION = "Development files for the Qt 6 Protobuf library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-protobuf-devel-6.11.2-1.3.aarch64.rpm"
RPM_HASH = "8005bfe578e3cadec90d827f120ac2b10cc3e5a25d0c95b12fd4097e0f18b83d1cc93c52afd0dd224a00bc0dece85e7b4adc0d682aa59d31154262d0be64fc89"

RPROVIDES:${PN} += "cmake-Qt6Protobuf \
cmake-Qt6ProtobufQtCoreTypes \
cmake-Qt6ProtobufQtGuiTypes \
cmake-Qt6ProtobufQuick \
cmake-Qt6ProtobufTools \
cmake-Qt6ProtobufWellKnownTypes \
pkgconfig-Qt6Protobuf \
pkgconfig-Qt6ProtobufQtCoreTypes \
pkgconfig-Qt6ProtobufQtGuiTypes \
pkgconfig-Qt6ProtobufQuick \
pkgconfig-Qt6ProtobufWellKnownTypes \
qt6-protobuf-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Core \
ld-linux-aarch64.so.1 \
libQt6Protobuf6 \
libabsl-hash.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.36.1.0 \
libprotoc.so.36.1.0 \
libstdc++.so.6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Protobuf \
pkgconfig-Qt6ProtobufQtCoreTypes \
pkgconfig-Qt6Quick \
pkgconfig-protobuf"

inherit rpm

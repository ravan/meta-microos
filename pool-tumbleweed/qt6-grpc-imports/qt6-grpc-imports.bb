SUMMARY = "Qt 6 Grpc QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Grpc module."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-grpc-imports-6.11.2-1.3.aarch64.rpm"
RPM_HASH = "f394a1972af48fa57195e0deb031246f476786ada82c51f1688838b10de76c33802ec72a7545480a59e91088a521ef352ccc097bea433762a4b9d73503fad8de"

RPROVIDES:${PN} += "libgrpcquickplugin.so \
libprotobufquickplugin.so \
qt6-grpc-imports \
qt6qmlimport-QtGrpc \
qt6qmlimport-QtGrpc.6 \
qt6qmlimport-QtProtobuf \
qt6qmlimport-QtProtobuf.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6GrpcQuick.so.6 \
libQt6ProtobufQuick.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

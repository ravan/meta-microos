SUMMARY = "Examples for the qt6-grpc modules"
DESCRIPTION = "Examples for the qt6-grpc modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-grpc-examples-6.11.2-1.3.aarch64.rpm"
RPM_HASH = "b4de518579e5b88417f2b6310b507da503844ac77d66def5f5f1f8c824449eaeae5ac7be7d3cf5114480677cd4fa9ce79a3db17d5c87f51da99a8f50083afb3f"

RPROVIDES:${PN} += "libprotobuf-sensors.so \
libvehiclelib.so \
qt6-grpc-examples"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Grpc.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Protobuf.so.6 \
libQt6ProtobufQtCoreTypes.so.6 \
libQt6ProtobufWellKnownTypes.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libabsl-cord.so.2608.0.0 \
libabsl-cordz-functions.so.2608.0.0 \
libabsl-cordz-info.so.2608.0.0 \
libabsl-log-internal-check-op.so.2608.0.0 \
libabsl-log-internal-message.so.2608.0.0 \
libabsl-log-internal-nullguard.so.2608.0.0 \
libabsl-strings.so.2608.0.0 \
libabsl-synchronization.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libgpr.so.51 \
libgrpc++-reflection.so.1.76 \
libgrpc++.so.1.76 \
libgrpc.so.51 \
libprotobuf.so.36.1.0 \
libstdc++.so.6 \
qt6qmlimport-Qt.labs.qmlmodels \
qt6qmlimport-QtCore \
qt6qmlimport-QtGrpc \
qt6qmlimport-QtQml \
qt6qmlimport-QtQuick \
qt6qmlimport-QtQuick.Controls \
qt6qmlimport-QtQuick.Controls.Basic \
qt6qmlimport-QtQuick.Controls.Material \
qt6qmlimport-QtQuick.Dialogs \
qt6qmlimport-QtQuick.Layouts \
qt6qmlimport-QtQuick.Shapes \
qt6qmlimport-QtQuick.VectorImage"

inherit rpm

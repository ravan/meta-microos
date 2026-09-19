SUMMARY = "Qt 6 Grpc library"
DESCRIPTION = "The Qt 6 Grpc library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "libQt6Grpc6-6.11.2-1.3.aarch64.rpm"
RPM_HASH = "87b1ffd726935708d5ac0b3361d6544adfacac05e8ba651e6c2638d0ee8e3fe4ed33d717eac51fc3a02db954746725b4bf1696b8cceea8f553d2e22419457f4d"

RPROVIDES:${PN} += "libQt6Grpc.so.6 \
libQt6Grpc6 \
libQt6GrpcQuick.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6Protobuf.so.6 \
libQt6Qml.so.6 \
libQt6QmlNetwork.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm

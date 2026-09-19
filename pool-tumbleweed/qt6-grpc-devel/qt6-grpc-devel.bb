SUMMARY = "Qt 6 Grpc library - Development files"
DESCRIPTION = "Development files for the Qt 6 Grpc library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-grpc-devel-6.11.2-1.3.aarch64.rpm"
RPM_HASH = "5bb61d1305ec3dbdb31db0a0956246aa1e795f21ad915f34b08dcdd77ccc4e6318c354135692c0055edc72b8f85d9d928273686981a23b8f509f08f83637a8cf"

RPROVIDES:${PN} += "cmake-Qt6Grpc \
cmake-Qt6GrpcQuick \
cmake-Qt6GrpcTools \
pkgconfig-Qt6Grpc \
pkgconfig-Qt6GrpcQuick \
qt6-grpc-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Network \
cmake-Qt6Protobuf \
ld-linux-aarch64.so.1 \
libQt6Grpc6 \
libabsl-hash.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libc.so.6 \
libgcc-s.so.1 \
libprotobuf.so.36.1.0 \
libprotoc.so.36.1.0 \
libstdc++.so.6 \
pkgconfig-Qt6Core \
pkgconfig-Qt6Network \
pkgconfig-Qt6Protobuf \
pkgconfig-Qt6Quick \
pkgconfig-grpc++"

inherit rpm

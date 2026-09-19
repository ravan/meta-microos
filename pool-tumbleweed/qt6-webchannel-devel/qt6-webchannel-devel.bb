SUMMARY = "Qt 6 WebChannel library - Development files"
DESCRIPTION = "Development files for the Qt 6 WebChannel library"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webchannel-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "0eb3856f4bc8980ed7926b4920a15cd6aec7c08048b04d51f86f5e46fe6e37c27d411855b66b9c1321c99aba940c2b0fed6ad8e5fa3275bf2659100cb1bf4f83"

RPROVIDES:${PN} += "cmake-Qt6WebChannel \
pkgconfig-Qt6WebChannel \
qt6-webchannel-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt6Qml \
libQt6WebChannel6 \
pkgconfig-Qt6Qml"

inherit rpm

SUMMARY = "Qt 6 Lottie library - Development files"
DESCRIPTION = "Development files for the Qt 6 Lottie library."
LICENSE = "GPL-3.0-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-lottie-devel-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "b1636f993debe22d6dfdcd58e3b79a17a8704bf19ca4468533d98ba0422023fc00cd23a483e3c4db002825b640fae3324ff706f09cdbc15b6fb35ea2e350dc0f"

RPROVIDES:${PN} += "cmake-Qt6Lottie \
cmake-Qt6LottieTools \
pkgconfig-Qt6Lottie \
qt6-lottie-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt6Lottie6 \
qt6-lottie"

inherit rpm

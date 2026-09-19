SUMMARY = "CMake graphical user interface"
DESCRIPTION = "This is a Graphical User Interface for CMake, a cross-platform \
build system."
LICENSE = "BSD-3-Clause"

PV = "4.4.3"

RPM_NAME = "cmake-gui-4.4.3-1.1.aarch64.rpm"
RPM_HASH = "e4dd0c87c4f7264678a6130aadc91a89660f49da7ad6af8b1c7125a7375a787dadc102e3e9920a47d36146ab3555cd44bd41d627f6679f31e00ed9b6088811bb"

RPROVIDES:${PN} += "cmake-gui"

RDEPENDS:${PN} += "cmake \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libarchive.so.13 \
libc.so.6 \
libcurl.so.4 \
libexpat.so.1 \
libgcc-s.so.1 \
libjsoncpp.so.27 \
libm.so.6 \
librhash.so.1 \
libstdc++.so.6 \
libuv.so.1 \
libz.so.1"

inherit rpm

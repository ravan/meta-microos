SUMMARY = "Development package for the libdrumstick library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
libdrumstick libraries."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.11.1"

RPM_NAME = "libdrumstick-devel-2.11.1-1.1.aarch64.rpm"
RPM_HASH = "acfd9639c5e5207873443891d5a48d7d89b56e3a32b07eff0088f3921a28596e1028e1cc1308567ca2b6de808ce1e8733746daf5e693078a496b3776550d07a5"

RPROVIDES:${PN} += "cmake-drumstick \
cmake-drumstick-alsa \
cmake-drumstick-file \
cmake-drumstick-rt \
cmake-drumstick-widgets \
libdrumstick-devel \
libdrumstick-vpiano-plugin.so \
pkgconfig-drumstick-alsa \
pkgconfig-drumstick-file \
pkgconfig-drumstick-rt \
pkgconfig-drumstick-widgets"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
alsa-devel \
cmake-Qt6Core \
glibc-devel \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libdrumstick-alsa2 \
libdrumstick-file2 \
libdrumstick-rt2 \
libdrumstick-widgets.so.2 \
libdrumstick-widgets2 \
libgcc-s.so.1 \
libstdc++-devel \
libstdc++.so.6"

inherit rpm

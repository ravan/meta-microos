SUMMARY = "Qt 6 Core development utilities"
DESCRIPTION = "Qt 6 Core development utilities. \
It contains the qtbase utilities and definitions."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-base-common-devel-6.11.2-2.1.aarch64.rpm"
RPM_HASH = "d1340454497e7d5adc1b6ca47373199920aec08e063068334fce846dab18a90f031ab51a6110f8cde499a7aa9113116969ace108501ad590a99529e9f5d32ed6"

RPROVIDES:${PN} += "cmake-Qt6 \
cmake-Qt6BuildInternals \
cmake-Qt6HostInfo \
cmake-Qt6TestInternalsPrivate \
pkgconfig-Qt6Platform \
qt6-base-common-devel \
qt6-tools-qtpaths"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
cmake \
gcc-c++ \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpcre2-16.so.0 \
libstdc++.so.6 \
libzstd.so.1 \
pkgconfig \
qt6-macros"

inherit rpm

SUMMARY = "Development files for the Qt5 D-Bus library"
DESCRIPTION = "Development files for the Qt5 D-Bus library. This package also \
contains Qt5's qdbusxml2cpp and qdbuscpp2xml binaries."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5DBus-devel-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "202ca7c80f186cac10745c923dee452db9b05cde4aecfda92b307368b676ed78188661e25fbf179de0311e175e9e0e351c3311f5884901b481c61bb5c1cc978c"

RPROVIDES:${PN} += "cmake-Qt5DBus \
libQt5DBus-devel \
pkgconfig-Qt5DBus"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libQt5Core-devel \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5DBus5 \
libc.so.6 \
libstdc++.so.6 \
pkgconfig-Qt5Core"

inherit rpm

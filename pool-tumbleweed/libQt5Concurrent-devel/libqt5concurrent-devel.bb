SUMMARY = "Development files for the Qt5 Concurrent library"
DESCRIPTION = "Development files for the Qt5 Concurrent library."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Concurrent-devel-5.15.19+kde96-1.3.aarch64.rpm"
RPM_HASH = "fd551c51bdf764ba5f056d9bd07fb7969f97a0865a8347f935d526ce0275c5aac74f504203ba6922c449faca6db7aa1c59aaa3e5cc490f68c757278bda543555"

RPROVIDES:${PN} += "cmake-Qt5Concurrent \
libQt5Concurrent-devel \
pkgconfig-Qt5Concurrent"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQt5Concurrent5 \
libQt5Core-devel \
pkgconfig-Qt5Core"

inherit rpm

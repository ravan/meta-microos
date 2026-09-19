SUMMARY = "Development files for libsignon-qt1"
DESCRIPTION = "This package contains the development files for the signon-qt library."
LICENSE = "LGPL-2.0-only"

PV = "8.61"

RPM_NAME = "libsignon-qt6-devel-8.61-2.10.aarch64.rpm"
RPM_HASH = "1067154cfdf441afa55dc61e5263ad66da87aef499cff7ab451b695b345c0f0f738803169b827d3577e2e94eb6c1f7d41d15eba6de5b3795b28c1c7ad170a3e1"

RPROVIDES:${PN} += "cmake-SignOnQt6 \
libsignon-qt6-devel \
pkgconfig-libsignon-qt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsignon-qt6-1 \
pkgconfig-Qt6Core"

inherit rpm

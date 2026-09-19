SUMMARY = "Devel files for libsysstat"
DESCRIPTION = "sysstat libraries for development"
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libsysstat-devel-1.1.0-1.7.aarch64.rpm"
RPM_HASH = "525acbb828b134bfcf24f167b34d2d9963cce0b0dd8e9bec6540e25d1d15e0d0fed5885048dc13516ab220885dd27a44ae9fe73f97e204100ff9870856e5b352"

RPROVIDES:${PN} += "cmake-sysstat-qt6 \
libsysstat-devel \
pkgconfig-sysstat-qt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsysstat1 \
pkgconfig \
pkgconfig-Qt6Core"

inherit rpm

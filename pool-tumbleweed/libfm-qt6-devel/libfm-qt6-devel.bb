SUMMARY = "Development files for libfm-qt"
DESCRIPTION = "Libfm-Qt libraries for development"
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later"

PV = "2.4.0"

RPM_NAME = "libfm-qt6-devel-2.4.0-1.6.aarch64.rpm"
RPM_HASH = "6876d34e4920312410299aa3e186388af5a8b872c70a20741fba870511839fa18c1440c042fa1c81a2c75ff5942fc5ae5f76f3c55bd9c1d00c45dee8a89438e7"

RPROVIDES:${PN} += "cmake-fm-qt6 \
libfm-qt6-devel \
pkgconfig-libfm-qt6"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfm-qt6-17 \
pkgconfig-Qt6Widgets"

inherit rpm

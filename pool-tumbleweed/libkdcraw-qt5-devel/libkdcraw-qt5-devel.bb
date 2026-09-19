SUMMARY = "Shared library interface around dcraw"
DESCRIPTION = "Libkdcraw is a C++ interface around dcraw binary program used to decode \
RAW picture files."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later & GPL-3.0-or-later"

PV = "25.12.3"

RPM_NAME = "libkdcraw-qt5-devel-25.12.3-1.6.aarch64.rpm"
RPM_HASH = "369d407629b8b42b2d86763fe31c075744f294a95514c136427cbd5fe3a05d3e098540794134a5ab34f1aaf5a9c029ac2698196b4d9e785a8419c3518a81c4e1"

RPROVIDES:${PN} += "cmake-KF5KDcraw \
libkdcraw-devel \
libkdcraw-kf5-devel \
libkdcraw-qt5-devel"

RDEPENDS:${PN} += "libKF5Dcraw5"

inherit rpm

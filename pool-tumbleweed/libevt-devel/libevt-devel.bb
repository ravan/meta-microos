SUMMARY = "Development files for libevt, a Windows event file parser"
DESCRIPTION = "libevt is a library to access the Windows Event Log (EVT) format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libevt."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "libevt-devel-20260705-1.2.aarch64.rpm"
RPM_HASH = "722a0a2049817618f85ce1390fd6fd1efd4e0db6af2773b4befb1b5dcf563a279df055f1ea6bb2102885eff29f606d8e4e59069d18131fe1da3bd3355860b665"

RPROVIDES:${PN} += "libevt-devel \
pkgconfig-libevt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libevt1"

inherit rpm

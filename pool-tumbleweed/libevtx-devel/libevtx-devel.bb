SUMMARY = "Development files for libevtx, a Windows XML Event file parser"
DESCRIPTION = "libevtx is a library to access the Windows XML Event log format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libevtx."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "libevtx-devel-20260705-1.2.aarch64.rpm"
RPM_HASH = "cdd3063f80e61230176c7211128994e8eabcc84c06b6b415eb4d3d16f38fb2dd839600d1709e6b91c06d68adb9b4972a7be4c79ed336b9c15e130ae6c684f62e"

RPROVIDES:${PN} += "libevtx-devel \
pkgconfig-libevtx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libevtx1"

inherit rpm

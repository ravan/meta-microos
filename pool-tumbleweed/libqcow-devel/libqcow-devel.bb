SUMMARY = "Development files for libqcow"
DESCRIPTION = "libqcow is a library to access the QEMU Copy-On-Write (QCOW) image format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libqcow."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20260703"

RPM_NAME = "libqcow-devel-20260703-1.4.aarch64.rpm"
RPM_HASH = "757ac3da915675a2cda978e9723f4e7382b5267569fbce08043b9591d748eb4917f1acc992683c62162a50827efa8379722f1112a1591beb9eaa88f4f6d2b62a"

RPROVIDES:${PN} += "libqcow-devel \
pkgconfig-libqcow"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libqcow1"

inherit rpm

SUMMARY = "Development files for libvhdi, a VHD image format library"
DESCRIPTION = "libvhdi is a library to access the Virtual Hard Disk (VHD) image format.  see libvhdi for details. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libvhdi."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260901"

RPM_NAME = "libvhdi-devel-20260901-1.1.aarch64.rpm"
RPM_HASH = "d23dbb11f9f47182b79deacdfe181766b480aec49b6c4695ec34a409d3758eb5310e54069f8b537a599dfe360a1f0c4ead1b2490a6ed1fda9d8c82ddda0fc7c5"

RPROVIDES:${PN} += "libvhdi-devel \
pkgconfig-libvhdi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvhdi1"

inherit rpm

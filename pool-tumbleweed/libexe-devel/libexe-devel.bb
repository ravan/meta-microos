SUMMARY = "Development files for libexe"
DESCRIPTION = "Library to provide Microsoft EXE file support for the libyal family \
of libraries. libyal is typically used in digital forensic tools. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libexe."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "libexe-devel-20260705-1.2.aarch64.rpm"
RPM_HASH = "cb3db106d217a3f634f78eccf26e984138998eabf15a92874df0fa7fcc80e443822875c85b2c5d6fc301ee8af6e90942991e39eaf1e29ea0b2a8d3732cc46458"

RPROVIDES:${PN} += "libexe-devel \
pkgconfig-libexe"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libexe1"

inherit rpm

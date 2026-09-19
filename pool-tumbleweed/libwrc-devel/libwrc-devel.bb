SUMMARY = "Development files for libwrc, a Windows Resouce Compiler format support library"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libwrc."
LICENSE = "LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "libwrc-devel-20260705-1.2.aarch64.rpm"
RPM_HASH = "9bc9367f2e9304e5a96c62f63bf7a24b8b5dd1e6ebd1f1eb005e8267f4f12e044c20253c0766dfe2d2f073c32834a7f3efcf8183ef64eb79ecc7c1d89e57a2ff"

RPROVIDES:${PN} += "libwrc-devel \
pkgconfig-libwrc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libwrc1"

inherit rpm

SUMMARY = "Development files for libcpath, a C path library"
DESCRIPTION = "A library for C path functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcpath."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcpath-devel-20260703-1.2.aarch64.rpm"
RPM_HASH = "6ab5eb014d80729c6c4051797bb9312d089a9c3747b4ea955cafad05e9da7856f83c907b6c26728c011cdbf0d867b836206741b70e0f648a1cf55b0eee2ea4ae"

RPROVIDES:${PN} += "libcpath-devel \
pkgconfig-libcpath"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcpath1"

inherit rpm

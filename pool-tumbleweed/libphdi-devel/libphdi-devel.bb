SUMMARY = "Development files for libphdi"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libphdi."
LICENSE = "LGPL-3.0-or-later"

PV = "20260902"

RPM_NAME = "libphdi-devel-20260902-1.1.aarch64.rpm"
RPM_HASH = "f84ef55b019cf0e1f9648adea60171a5c353fdd3063892e4f38a2178e3208cfa8295cef15e9d6f073324c1df46cbc82c0928759f5c23230e461f88d375742c04"

RPROVIDES:${PN} += "libphdi-devel \
pkgconfig-libphdi"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libphdi1"

inherit rpm

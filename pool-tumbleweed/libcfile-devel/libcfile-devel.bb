SUMMARY = "Development files for libcfile, a C file library"
DESCRIPTION = "A library for C file functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcfile."
LICENSE = "LGPL-3.0-or-later"

PV = "20260704"

RPM_NAME = "libcfile-devel-20260704-1.2.aarch64.rpm"
RPM_HASH = "0549a82d5e44117522a4cc0b87e66260b06bc8c7f3950839c5b57fceb0672039068b5165f1013ff599a40f155881d58889acd9db2b5561dd9097207f84658a13"

RPROVIDES:${PN} += "libcfile-devel \
pkgconfig-libcfile"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcfile1"

inherit rpm

SUMMARY = "Development files for libcerror, a C error library"
DESCRIPTION = "A library for C error functions. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcerror."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcerror-devel-20260703-1.2.aarch64.rpm"
RPM_HASH = "f7c9bd173d99c13d4d2c831407209c6b291cd361439facaef26aa6852b116e44fb8fb53041c4dc8a0586a4c0946a8ed9b5d0423a92ac21dbde84ec61f71ab1c5"

RPROVIDES:${PN} += "libcerror-devel \
pkgconfig-libcerror"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcerror1"

inherit rpm

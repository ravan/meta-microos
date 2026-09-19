SUMMARY = "Development files for GF(2) arithmetic with libm4ri"
DESCRIPTION = "M4RI is a library for arithmetic with dense matrices over the \
Galois Field GF(2). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libm4ri."
LICENSE = "GPL-2.0-or-later"

PV = "20260122"

RPM_NAME = "libm4ri-devel-20260122-1.6.aarch64.rpm"
RPM_HASH = "daab83901dc17a663ae4f86c9ae9ae0029218c1272fe0d0b248bd5f2cc3faf82dfd7f0b3722e495d02979ea5e08d4bde50bd7f1d88e4b5f365f854197108aca4"

RPROVIDES:${PN} += "libm4ri-devel \
pkgconfig-m4ri"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libm4ri2 \
pkgconfig-libpng"

inherit rpm

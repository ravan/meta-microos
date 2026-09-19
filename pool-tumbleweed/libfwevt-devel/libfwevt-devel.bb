SUMMARY = "Development files for libfwevt"
DESCRIPTION = "libfwevt is a library for Windows XML Event Log (EVTX) data types. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfwevt."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260702"

RPM_NAME = "libfwevt-devel-20260702-1.3.aarch64.rpm"
RPM_HASH = "867a1b1dcebfe0832dc7864ab3b944f0ce76e43020752b03da237858799b1cf36a575a8ad4f07a5ed2a409dfdbbd6d1e9c9ea570c5f03c8bc951422f867e8813"

RPROVIDES:${PN} += "libfwevt-devel \
pkgconfig-libfwevt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfwevt1"

inherit rpm

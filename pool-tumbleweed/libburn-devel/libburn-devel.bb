SUMMARY = "Development Files for libburn"
DESCRIPTION = "Development files for developing applications using libburn."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.8"

RPM_NAME = "libburn-devel-1.5.8-1.3.aarch64.rpm"
RPM_HASH = "fec9f9c13ac020e5c234ebf16bea9c57fa796842dc4c7c408ad0ebefbf4ad991d4b04388c4eec6a039cb93d1e6be12bc8086a04b43dc62c9cd71a7dca0769ce4"

RPROVIDES:${PN} += "libburn-devel \
pkgconfig-libburn-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libburn4"

inherit rpm

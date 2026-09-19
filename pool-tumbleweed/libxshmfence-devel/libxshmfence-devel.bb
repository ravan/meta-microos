SUMMARY = "Development files for the X Shm-Fence library"
DESCRIPTION = "This is a tiny library that exposes a event API on top of Linux \
futexes. \
 \
This package contains the development headers for the library found \
in libxshmfence."
LICENSE = "HPND"

PV = "1.3.3"

RPM_NAME = "libxshmfence-devel-1.3.3-1.7.aarch64.rpm"
RPM_HASH = "ad075754a58b4b23a557ea8b1aaad6ee88d5343dc6323eaf0420acfb97fa77e802ad71a0962991fb6e599923588c7ed5b95b4f8d0a03774ceb79f42af1562b33"

RPROVIDES:${PN} += "libxshmfence-devel \
pkgconfig-xshmfence"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxshmfence1"

inherit rpm

SUMMARY = "Development files for the libratbag game mouse config library"
DESCRIPTION = "libratbag is a configuration library for gaming mice. It provides a \
generic way to access the various features exposed by these mice and \
abstracts away hardware-specific and kernel-specific quirks. \
 \
This subpackage contains the files needed to build programs with \
libratbag."
LICENSE = "MIT"

PV = "0.18"

RPM_NAME = "libratbag-devel-0.18-2.5.aarch64.rpm"
RPM_HASH = "bbe198ca5ff488fb89153b1d25f0210f98937babe015f2cffe475ac9cdf51e8c8075f7fea9507688b947df8dfd7c29b7e296dd1e0cd4b4baffa97a7af1a576a8"

RPROVIDES:${PN} += "libratbag-devel \
pkgconfig-liblur"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liblur3"

inherit rpm

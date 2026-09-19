SUMMARY = "GNU binutils (BFD development files)"
DESCRIPTION = "This package includes header files and static libraries necessary to \
build programs which use the GNU BFD library, which is part of \
binutils."
LICENSE = "GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "binutils-devel-2.45-4.3.aarch64.rpm"
RPM_HASH = "62c8c32c758020e77dac21a21c2f21f981f91ecc827c7d0f4711debcd719c8f1cc190f61b96c9ff13951da1926b04df1b74e62727da7957c48eea1e306d6a0e1"

RPROVIDES:${PN} += "binutils-/usr/include/bfd.h \
binutils-devel"

RDEPENDS:${PN} += "binutils \
libzstd-devel \
zlib-devel"

inherit rpm

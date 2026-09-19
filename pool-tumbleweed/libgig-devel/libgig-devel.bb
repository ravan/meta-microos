SUMMARY = "Library for loading Gigasampler and DLS Level 1/2 files"
DESCRIPTION = "C++ library for loading Gigasampler and DLS Level 1/2 files."
LICENSE = "GPL-2.0-or-later"

PV = "4.6.0"

RPM_NAME = "libgig-devel-4.6.0-1.1.aarch64.rpm"
RPM_HASH = "6c112451916b30db5e0c09b02e271f7d893d68b27e6a1221402c6866d80c4b80a8a9a86238e9177c849c543822913d99795c98772b98d57b4101df89ea148a9d"

RPROVIDES:${PN} += "libgig-devel \
pkgconfig-akai \
pkgconfig-gig"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgig14"

inherit rpm

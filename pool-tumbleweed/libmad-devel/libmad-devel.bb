SUMMARY = "Development package for libmad, an MP3 decoding library"
DESCRIPTION = "This package contains the header files needed to \
develop applications with libmad."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.4"

RPM_NAME = "libmad-devel-0.16.4-1.3.aarch64.rpm"
RPM_HASH = "5e7ec4f15bae5245d7161dcfc01f30e2e65d395246b2f89e24160cee7cae1e2698380d7e257b4c3ccaf5c7203b6972fc06735f0711f9fa879ff2dde9a4b2d785"

RPROVIDES:${PN} += "cmake-mad \
libmad-devel \
mad-devel \
pkgconfig-mad"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmad0"

inherit rpm

SUMMARY = "Development files for librtprocess"
DESCRIPTION = "This is a project that aims to make some of RawTherapee's highly optimized raw \
processing routines readily available for other FOSS photo editing software. \
 \
This package holds the development files."
LICENSE = "BSL-1.0 & GPL-3.0-or-later"

PV = "0.12.0+20230627"

RPM_NAME = "librtprocess-devel-0.12.0+20230627-1.10.aarch64.rpm"
RPM_HASH = "bd2f89d3d0386c70bd3d5ec5a3a256bccb4a6971244979be8dfbd14f0ca15950a1d37ec993d875ee6b862b41b0c0f01f549fd4d20a6717a8b99f472b826ba0cd"

RPROVIDES:${PN} += "cmake-rtprocess \
librtprocess-devel \
pkgconfig-rtprocess"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
librtprocess0"

inherit rpm

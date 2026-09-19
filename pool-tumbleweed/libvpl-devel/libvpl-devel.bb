SUMMARY = "Development files for oneAPI Video Processing Library (oneVPL) dispatcher"
DESCRIPTION = "This package contains the development headers and pkgconfig files for \
the oneAPI Video Processing Library (oneVPL) dispatcher"
LICENSE = "MIT"

PV = "2.17.0"

RPM_NAME = "libvpl-devel-2.17.0-1.2.aarch64.rpm"
RPM_HASH = "9c70db15f525c4c0d31dc9ae083d2935c7a49dc83414f6cde3cf20ca7302773675ea001ead65ed28eb28b76fbf734985010534636db5a3e564c6a38c2a101e4b"

RPROVIDES:${PN} += "cmake-VPL \
libvpl-devel \
pkgconfig-vpl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvpl2"

inherit rpm

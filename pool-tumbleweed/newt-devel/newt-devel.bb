SUMMARY = "Development files for the Newt windowing toolkit"
DESCRIPTION = "This package contains the header files and libraries necessary for \
developing applications which use newt. \
 \
Newt is a development library for text mode user interfaces. \
 \
Install newt-devel if you want to develop applications which depend on \
newt."
LICENSE = "LGPL-2.1-or-later"

PV = "0.52.25"

RPM_NAME = "newt-devel-0.52.25-2.1.aarch64.rpm"
RPM_HASH = "2584a6e8f4cbb59c467ef843d6225934179d3d33629d3cf8c6dd14a881e2bfc611f1e0c426a8a9647dd2d9834ffe330b0c7d64ebc492f1ed62bafd8c8af27bda"

RPROVIDES:${PN} += "newt-devel \
pkgconfig-libnewt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnewt0-52 \
pkgconfig-slang \
popt-devel \
python3-devel \
slang-devel"

inherit rpm

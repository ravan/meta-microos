SUMMARY = "Development files for the EBML file parser library"
DESCRIPTION = "libebml is a C++ library to parse EBML files. See the EBML RFC at \
http://www.matroska.org/technical/specs/rfc/index.html ."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.7"

RPM_NAME = "libebml-devel-1.4.7-1.1.aarch64.rpm"
RPM_HASH = "e511d69444dea0e9ae8991afb751b61e02bd11cac7ddcd4865c73af06ea9411ce4664c262fab8fa5c5d55bb999caed1c9b20f2086ec2a7330a7c57588315ba48"

RPROVIDES:${PN} += "cmake-EBML \
libebml-devel \
pkgconfig-libebml"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libebml5 \
libstdc++-devel"

inherit rpm

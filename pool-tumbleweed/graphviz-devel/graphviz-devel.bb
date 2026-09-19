SUMMARY = "Graphviz development package"
DESCRIPTION = "The graphviz-devel package contains all that's necessary for developing \
programs that use the graphviz libraries including man3 pages."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-devel-15.0.0-2.2.aarch64.rpm"
RPM_HASH = "9940d280e4a03d234ad7a920f9a7da3465c38e88ad028d71ff822d9d2d0f35860e7736a8f4a6cf10abd3d79652b9599f6baa5cacc7c5ae5e9ba36d799434e6dd"

RPROVIDES:${PN} += "graphviz-devel \
pkgconfig-libcdt \
pkgconfig-libcgraph \
pkgconfig-libgvc \
pkgconfig-libgvpr \
pkgconfig-libpathplan \
pkgconfig-libxdot"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
graphviz \
libcdt6 \
libcgraph8 \
libgvc7 \
libgvpr2 \
libpathplan4 \
libxdot4"

inherit rpm

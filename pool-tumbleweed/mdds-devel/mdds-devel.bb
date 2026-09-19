SUMMARY = "A collection of multi-dimensional data structure and indexing algorithm"
DESCRIPTION = "This library provides a collection of multi-dimensional data structure and indexing \
algorithms.  All data structures are available as C++ templates, hence this is a \
header-only library, with no shared library to link against."
LICENSE = "MIT"

PV = "3.0.0"

RPM_NAME = "mdds-devel-3.0.0-1.4.noarch.rpm"
RPM_HASH = "7653bbfd67a0bcff436f3b4573f121d69d71b71f6a1a513095f3d67706603e5ab887899c2453a324c98187f734b23300c14882d9f75bfd0e7e73754f72e08037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mdds-devel \
pkgconfig-mdds-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-headers-devel"

inherit rpm

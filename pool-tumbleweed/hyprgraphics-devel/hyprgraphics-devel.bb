SUMMARY = "Development files for hyprgraphics"
DESCRIPTION = "Hyprgraphics is a small C++ library with graphics / resource related \
utilities used across the hypr* ecosystem. \
 \
This subpackage contains development files for hyprgraphics."
LICENSE = "BSD-3-Clause"

PV = "0.5.1"

RPM_NAME = "hyprgraphics-devel-0.5.1-1.5.aarch64.rpm"
RPM_HASH = "4f8cf5a20514201990b2008d5c6e8910775a160b8c4f5a070b87a0f069937e8b75ae5fea63e907ae6813a05b95448f596cacbd4c96c1e2ca8e0f2ab6460eb136"

RPROVIDES:${PN} += "hyprgraphics-devel \
pkgconfig-hyprgraphics"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhyprgraphics4"

inherit rpm

SUMMARY = "Development Files for OpenSCAP"
DESCRIPTION = "This package contains the development files (mainly C header files) for the \
OpenSCAP C library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.4"

RPM_NAME = "openscap-devel-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "e08b0779584f84ff5bedcfebfc304fa0c3a596ebbb13c57dffed32a27a6133c9ad71556c1dca3f7f7c0508b4f25a9478a89d97848fcc971e30d0e54702e9384c"

RPROVIDES:${PN} += "openscap-devel \
pkgconfig-libopenscap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenscap33 \
openscap"

inherit rpm

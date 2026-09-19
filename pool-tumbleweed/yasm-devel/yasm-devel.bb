SUMMARY = "YASM development package"
DESCRIPTION = "This package includes everything needed to develop programs that use \
libyasm."
LICENSE = "Artistic-1.0 & BSD-2-Clause & BSD-3-Clause & GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.3.0"

RPM_NAME = "yasm-devel-1.3.0-9.8.aarch64.rpm"
RPM_HASH = "2d3f3d79ad402886edf57a867700a2490adcbebfb206b34ab388dd6bae783ddb983aa9e9aea73bc5692d7254b5f1a633e0d9122ff4e858f006e101f74f50a2a1"

RPROVIDES:${PN} += "yasm-devel"

RDEPENDS:${PN} += "yasm"

inherit rpm

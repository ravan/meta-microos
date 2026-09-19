SUMMARY = "Document and Include Files for Enclosure LED Control Library"
DESCRIPTION = "This package contains the files that are necessary for software development \
using libled."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "ledmon-devel-1.1.0-2.5.aarch64.rpm"
RPM_HASH = "c8408ccd4e28f56bbbf2d721a259ecc6d2e4570b3aab389689a37203bfc7bd0fdd371d6e6382b2c29a97132a6bf6137d8f49afcc4de9f550e74abf7c7c8ff965"

RPROVIDES:${PN} += "ledmon-devel \
pkgconfig-ledmon"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libled1 \
pkgconfig"

inherit rpm

SUMMARY = "Development files for XRootD core libraries"
DESCRIPTION = "The XROOTD project gives access to data repositories. \
The typical usage is to give access to file-based ones. \
 \
This package contains header files and development libraries \
for XRootD development."
LICENSE = "LGPL-3.0-or-later"

PV = "5.9.0"

RPM_NAME = "xrootd-libs-devel-5.9.0-1.6.aarch64.rpm"
RPM_HASH = "6b90606907a5e09ffce143630bb71371984a65f65f16cd74ab173dfa554cb21f23ff001ec39b869c71180d6541cd3d212b13e0d4a474f28a7dea496cbb973f23"

RPROVIDES:${PN} += "cmake-XRootD \
xrootd-libs-devel"

RDEPENDS:${PN} += "/usr/bin/bash \
xrootd-libs"

inherit rpm

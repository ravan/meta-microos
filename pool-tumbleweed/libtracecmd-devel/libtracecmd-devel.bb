SUMMARY = "Development files for libtracecmd"
DESCRIPTION = "Development files of the libtracecmd library"
LICENSE = "LGPL-2.1-only"

PV = "1.5.5"

RPM_NAME = "libtracecmd-devel-1.5.5-1.2.aarch64.rpm"
RPM_HASH = "dfa5175494194e6f786cd2538c50dfc46374042619dea592a43aa46a1715a05204081769ac2caf5f073dc56176f05b35e0402e3a8cf0569541573688d37193ef"

RPROVIDES:${PN} += "libtracecmd-devel \
pkgconfig-libtracecmd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtracecmd1 \
pkgconfig-libtraceevent \
pkgconfig-libtracefs \
pkgconfig-libzstd"

inherit rpm

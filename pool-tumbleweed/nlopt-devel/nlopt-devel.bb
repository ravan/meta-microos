SUMMARY = "Development files for nlopt"
DESCRIPTION = "The nlopt-devel package contains libraries and header files for \
developing applications that use NLopt."
LICENSE = "LGPL-2.1-or-later"

PV = "2.11.0"

RPM_NAME = "nlopt-devel-2.11.0-1.3.aarch64.rpm"
RPM_HASH = "e95d629878ddc0f19049348ce14cfbb500251985f4c254175bb43bfb18c2eb73c3c938a88826b236eb9f8e1031deeff1226a84e28097c4288c3617ebf994c71a"

RPROVIDES:${PN} += "cmake-NLopt \
nlopt-devel \
pkgconfig-nlopt"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnlopt1"

inherit rpm

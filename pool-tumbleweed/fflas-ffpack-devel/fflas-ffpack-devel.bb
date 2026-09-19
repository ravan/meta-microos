SUMMARY = "Development files for FFLAS-FFPACK"
DESCRIPTION = "The FFLAS-FFPACK library provides functionalities for dense linear \
algebra over word size prime finite field. \
 \
This subpackage contains the include files for \
developing against the fflas-ffpack library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.5.0"

RPM_NAME = "fflas-ffpack-devel-2.5.0-1.15.aarch64.rpm"
RPM_HASH = "1417b6a580c7d87e6d3879dfb8a105125ab1d68037e9952f3e9adafb8bd108bbe68dd692677261cbcaf5f2e9b89df5619cb6d37148353814315031007dc91a0e"

RPROVIDES:${PN} += "fflas-ffpack-devel \
pkgconfig-fflas-ffpack"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
pkgconfig-givaro"

inherit rpm

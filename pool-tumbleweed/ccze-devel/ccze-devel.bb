SUMMARY = "Development files for ccze"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use ccze."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.2"

RPM_NAME = "ccze-devel-0.2.1.2-4.5.aarch64.rpm"
RPM_HASH = "ced374e14cf3bb02590609ae58d2f677d12ecbc44025d708fa00a00ac13819f3f340fd243019bbed8652417c5eb804c73faf85576e644ad9fee89ca19682f7bf"

RPROVIDES:${PN} += "ccze-devel"

RDEPENDS:${PN} += "ccze"

inherit rpm

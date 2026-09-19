SUMMARY = "Development files for e-antic"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC. \
 \
This subpackage contains the include files and library links for \
developing against the ANTIC library."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "e-antic-devel-2.1.1-2.3.aarch64.rpm"
RPM_HASH = "414ca2e49032246034b67a53e969c3070eed36c1e4d09a079ada8f8e509fb705826cb4a4d4902a27bbd2deea41fc732b1b5f7db43081c75a4f5056bf9d4495c6"

RPROVIDES:${PN} += "e-antic-devel"

RDEPENDS:${PN} += "flint-devel \
libboost-headers-devel \
libeantic3"

inherit rpm

SUMMARY = "Development files for LinBox, a library for computation over finite fields"
DESCRIPTION = "LinBox is a C++ template library for exact, high-performance linear \
algebra computation with dense, sparse, and structured matrices over \
the integers and over finite fields. \
 \
This subpackage contains the include files and library links for \
developing against the Givaro library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.7.1"

RPM_NAME = "linbox-devel-1.7.1-1.5.aarch64.rpm"
RPM_HASH = "56b1bbec9513a8e8f5e918c114ff44b1e678e1f16c06eccf5013f12375d1c1d96ef67095d740c40164e39369fb690aae7a03faef8385bb5625587b80dc1e5fd5"

RPROVIDES:${PN} += "linbox-devel \
pkgconfig-linbox"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
liblinbox0 \
pkgconfig-fflas-ffpack"

inherit rpm

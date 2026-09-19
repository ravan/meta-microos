SUMMARY = "Development files for soci"
DESCRIPTION = "soci is a C++ database access library that provides the illusion of \
embedding SQL in regular C++ code, staying entirely within the C++ \
standard. \
 \
The soci development package includes the header files, libraries, \
development tools necessary for compiling and linking applications \
which will use soci."
LICENSE = "BSL-1.0"

PV = "4.0.2"

RPM_NAME = "soci-devel-4.0.2-5.10.aarch64.rpm"
RPM_HASH = "dadbefa46c796841734e86dc69947377eadf84b50b6c5405ed4540a4566bb9052f01ff6db8a96917beaf52cc2d050ef5830badcd19f0036095e4bf815fc667b1"

RPROVIDES:${PN} += "cmake-SOCI \
soci-devel"

RDEPENDS:${PN} += "libboost-headers-devel \
libsoci-core4-0"

inherit rpm

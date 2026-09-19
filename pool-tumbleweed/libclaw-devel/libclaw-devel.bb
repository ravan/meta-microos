SUMMARY = "Development files for the Claw library"
DESCRIPTION = "This subpackage contains libraries and header files for developing \
applications that want to make use of libclaw."
LICENSE = "LGPL-2.1-or-later"

PV = "1.9.1"

RPM_NAME = "libclaw-devel-1.9.1-1.9.aarch64.rpm"
RPM_HASH = "d99bdcdb3153299da9c56a08d5b447cf6087bc0f28cf7da15ba37ee1183011e83e04fd13a51364dabedfc7ca0159a13aff8f1aa7228c779c92f1d894f0fae9e1"

RPROVIDES:${PN} += "cmake-claw \
libclaw-devel"

RDEPENDS:${PN} += "cmake \
libclaw1"

inherit rpm

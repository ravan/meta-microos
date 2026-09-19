SUMMARY = "C/C++ Development"
DESCRIPTION = "Tools and libraries for software development using C/C++ and other derivative \
of the C programming language."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-C-C++-devel_C_C++-20170319-4.12.noarch.rpm"
RPM_HASH = "6af967eb7f1c004f5de9f5d8a9010e19ff2758bd2dfbd321a5611c530a6e90abb237f39a42735cfe49aa70f8dd86de01c12b2586203b4340b6a9d63234ca0513"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-C-C++-devel-C-C++"

RDEPENDS:${PN} += "gcc-c++ \
libstdc++-devel \
pattern-"

inherit rpm

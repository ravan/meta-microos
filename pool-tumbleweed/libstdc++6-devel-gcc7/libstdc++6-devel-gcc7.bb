SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libstdc++6-devel-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "e296cd88dc89fdf97c7114303869fa14d8e630a203d84e2e3e23963ba58422b38388855b3ffea50376a354f934639d4d8d61425473db855d3601808ad8e98ba6"

RPROVIDES:${PN} += "libstdc++6-devel-gcc7"

RDEPENDS:${PN} += "glibc-devel \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++6"

inherit rpm

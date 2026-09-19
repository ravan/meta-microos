SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "14.4.0+git12698"

RPM_NAME = "libstdc++6-devel-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "7578a677bcb6ab712be72261cfde4bcaec9d743bd9d8f9b3ceb6199f5a58ddf287b3ce910c9d65372a48b1c88b7ddfcb7a8f4af490bc527cdf26167378850c19"

RPROVIDES:${PN} += "libstdc++6-devel-gcc14"

RDEPENDS:${PN} += "glibc-devel \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++6"

inherit rpm

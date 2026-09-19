SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "15.3.0+git11272"

RPM_NAME = "libstdc++6-devel-gcc15-15.3.0+git11272-1.4.aarch64.rpm"
RPM_HASH = "742384c56a8c464258b5c94daf7b96a9d0c510c8b1aab55beca9be0fa0903b179fe0205a6445b3d9f1d76d7deafaa30208a1c1e83bc6dfd9feae62a63ed754a2"

RPROVIDES:${PN} += "libstdc++6-devel-gcc15"

RDEPENDS:${PN} += "glibc-devel \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++6"

inherit rpm

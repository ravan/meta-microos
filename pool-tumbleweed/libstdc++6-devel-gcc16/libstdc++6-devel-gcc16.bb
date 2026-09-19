SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "16.2.0+git9497"

RPM_NAME = "libstdc++6-devel-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "70f681e7a553b7974cbb62ecc926501ac87a7310e672d0d228f6d23ea200c37a7b9ecf294c4e598a75de87ffb45b5b8e4b408ea188e04b1902ce90baa9fc5289"

RPROVIDES:${PN} += "libstdc++6-devel-gcc16"

RDEPENDS:${PN} += "glibc-devel \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++6"

inherit rpm

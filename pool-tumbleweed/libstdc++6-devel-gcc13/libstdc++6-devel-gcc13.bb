SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all the headers and libraries of the standard C++ \
library. It is needed for compiling C++ code."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "13.5.0+git10516"

RPM_NAME = "libstdc++6-devel-gcc13-13.5.0+git10516-1.1.aarch64.rpm"
RPM_HASH = "c369d0322b9dddf6031be08556d359add9b24465e93e3359d41669ac753ec66973443eccbf44ed971b7f8fa18bf4ebc301da1f6b75ccb0b1eeb2e490cb2e7a54"

RPROVIDES:${PN} += "libstdc++6-devel-gcc13"

RDEPENDS:${PN} += "glibc-devel \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++6"

inherit rpm

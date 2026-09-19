SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "14.4.0+git12698"

RPM_NAME = "libstdc++6-gcc14-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "369452f0478f8b1516d282247680fab9724fffdfa36ee4432de02b9b8022a7c4c3ea4f639d83296b0d7e754a7b7ff6b5c8d1ac66996dfaf9c01d234b29826d70"

RPROVIDES:${PN} += "libstdc++.so.6 \
libstdc++6 \
libstdc++6-gcc14"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm

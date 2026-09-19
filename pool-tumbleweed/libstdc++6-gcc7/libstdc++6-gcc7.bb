SUMMARY = "The standard C++ shared library"
DESCRIPTION = "The standard C++ library, needed for dynamically linked C++ programs."
LICENSE = "GPL-3.0-or-later-with-GCC-exception-3.1"

PV = "7.5.0+r278197"

RPM_NAME = "libstdc++6-gcc7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "07213d589963f4abb49b6a4bf87fc59675bbd512d278e50b87b16e0db6b6f29f13da5efb2e54537cb10d06704b1ace095a4f2845e34989ab0ad80c7c6bb334a9"

RPROVIDES:${PN} += "libstdc++.so.6 \
libstdc++6 \
libstdc++6-gcc7"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm

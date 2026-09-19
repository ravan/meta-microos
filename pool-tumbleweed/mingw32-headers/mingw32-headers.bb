SUMMARY = "MinGW-w64 headers for Win32 and Win64"
DESCRIPTION = "MinGW-w64 delivers runtime, headers and libs for developing both 64 \
bit (x64) and 32 bit (x86) windows applications using GCC and other \
free software compilers. \
 \
This subpackage contains the header files."
LICENSE = "SUSE-Public-Domain"

PV = "14.0.0"

RPM_NAME = "mingw32-headers-14.0.0-1.1.noarch.rpm"
RPM_HASH = "88ae307c00e3f905ba435343e2769118a082556fd61132637a7444ce5b87f5b24915caff4cddd15e5d2d75d360b08a178002557d21c817721c5f1b181bb411a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-headers"

RDEPENDS:${PN} += "mingw32-unistd-pthread-devel"

inherit rpm

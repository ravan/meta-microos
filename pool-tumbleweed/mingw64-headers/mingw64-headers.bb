SUMMARY = "MinGW-w64 headers for Win32 and Win64"
DESCRIPTION = "MinGW-w64 delivers runtime, headers and libs for developing both 64 \
bit (x64) and 32 bit (x86) windows applications using GCC and other \
free software compilers. \
 \
This subpackage contains the header files."
LICENSE = "SUSE-Public-Domain"

PV = "14.0.0"

RPM_NAME = "mingw64-headers-14.0.0-1.1.noarch.rpm"
RPM_HASH = "e7d72c4c873e9c60d2d252b736384c536d4e8238f553c10d2f1f5c9e864e520e1b8207f05e7054f5050e11052f1b086f072a717da0bcf22177ba199a3e3a6718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-headers"

RDEPENDS:${PN} += "mingw64-unistd-pthread-devel"

inherit rpm

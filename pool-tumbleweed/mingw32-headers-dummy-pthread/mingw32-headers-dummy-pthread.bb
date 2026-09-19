SUMMARY = "Stub pthread header files for MinGW"
DESCRIPTION = "This subpackage contains stub pthread header files that are empty \
and only exist to satisfy dependencies in MinGW's unistd.h until \
an actual pthread implementation (like winpthreads) is installed."
LICENSE = "SUSE-Public-Domain"

PV = "14.0.0"

RPM_NAME = "mingw32-headers-dummy-pthread-14.0.0-1.1.noarch.rpm"
RPM_HASH = "436ab47c9e0043fef887e0265e0ad6914292ddc49cae5aea8f34dee17bc6fcd5238bed4e3813b7264f9a8b10e2cb28755741917141b159aaca726fd31cfc8baf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw32-headers-dummy-pthread \
mingw32-unistd-pthread-devel"

RDEPENDS:${PN} += ""

inherit rpm

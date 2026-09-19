SUMMARY = "Stub pthread header files for MinGW"
DESCRIPTION = "This subpackage contains stub pthread header files that are empty \
and only exist to satisfy dependencies in MinGW's unistd.h until \
an actual pthread implementation (like winpthreads) is installed."
LICENSE = "SUSE-Public-Domain"

PV = "14.0.0"

RPM_NAME = "mingw64-headers-dummy-pthread-14.0.0-1.1.noarch.rpm"
RPM_HASH = "77d197f1343cb7c1ea2e4d30b5a3bb3e836208aaa37d79c684e205ec8d4efc3c492e1c660825ab6724e854f192266911e4b92a9b760fb0421dcb7998defc937a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-headers-dummy-pthread \
mingw64-unistd-pthread-devel"

RDEPENDS:${PN} += ""

inherit rpm

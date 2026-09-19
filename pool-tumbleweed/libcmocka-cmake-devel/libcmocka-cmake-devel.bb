SUMMARY = "CMake support for the cmocka library"
DESCRIPTION = "cmake support for developing with the cmocka unit testing library."
LICENSE = "Apache-2.0"

PV = "2.0.2"

RPM_NAME = "libcmocka-cmake-devel-2.0.2-1.4.aarch64.rpm"
RPM_HASH = "1b51f1877ea86a20045fa5125a3ba290da31db7ed206940521bf59182ac5f3fa04ee09daf9a925ae63987e9344b7349daa5b59605e11544595efdf6d32e73731"

RPROVIDES:${PN} += "cmake-cmocka \
libcmocka-cmake \
libcmocka-cmake-devel \
libcmocka-devel-/usr/lib64/cmake/cmocka"

RDEPENDS:${PN} += "cmake \
libcmocka-devel"

inherit rpm

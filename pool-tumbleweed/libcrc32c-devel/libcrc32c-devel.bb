SUMMARY = "C++ header files and library symbolic links for crc32c"
DESCRIPTION = "This package contains the C++ header files and symbolic links to the shared \
libraries for libcrc32c. If you would like to develop programs using libcrc32c, \
you will need to install libcrc32c-devel."
LICENSE = "BSD-3-Clause"

PV = "1.1.2"

RPM_NAME = "libcrc32c-devel-1.1.2-2.9.aarch64.rpm"
RPM_HASH = "c6730875d898a66299a818728f81467e0e3890d22183f512443c269960e52392780982e0b34264a2e187f66398e78d40e51fde61e93142cdd3f50fb0b844de93"

RPROVIDES:${PN} += "cmake-Crc32c \
libcrc32c-devel"

RDEPENDS:${PN} += "libcrc32c1"

inherit rpm

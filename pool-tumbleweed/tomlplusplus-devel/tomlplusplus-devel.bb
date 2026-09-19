SUMMARY = "Development libraries and header files for tomlplusplus"
DESCRIPTION = "This package contains libraries and header files for developing \
applications that use tomlplusplus."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "tomlplusplus-devel-3.4.0-1.11.aarch64.rpm"
RPM_HASH = "32d2b0ae3efe8d126ab59a93cc55c03e919290fa930111b96eaf897c110daf308bcc467756a6aeb510e52f0eba4350db5a31fce7302170b31614400cc9ad8244"

RPROVIDES:${PN} += "cmake-tomlplusplus \
pkgconfig-tomlplusplus \
tomlplusplus-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtomlplusplus3"

inherit rpm

SUMMARY = "Development files for cxxopts"
DESCRIPTION = "CXXOpts is a C++ option parser library supporting single-letter options \
with a single dash, and long options with a double-dash. \
(There are some corner cases in 3.0.0 where behavior is not exactly \
matching GNU getopt or POSIX mode.) \
It requires and makes use of C++11 <regex>."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "cxxopts-devel-3.3.1-1.5.aarch64.rpm"
RPM_HASH = "2430f97aff6ec7a146e138ab1c1014cacec7231691d883eac51a609b56b5a4a87e83003306acee17b159ec84f0e13db134d7fe414010cbf9ba3c93d05d1efb0a"

RPROVIDES:${PN} += "cmake-cxxopts \
cxxopts-devel \
pkgconfig-cxxopts"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstdc++-devel"

inherit rpm

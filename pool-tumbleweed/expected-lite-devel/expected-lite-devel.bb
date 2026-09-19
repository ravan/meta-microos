SUMMARY = "Expected objects in C++11"
DESCRIPTION = "Development files for a header-only library"
LICENSE = "BSL-1.0"

PV = "0.10.0"

RPM_NAME = "expected-lite-devel-0.10.0-1.3.aarch64.rpm"
RPM_HASH = "ca086bdc9c6f03f1f69e8d4995db889b2af93a69d86feccbfe0a81ff1f2b58e9a61ec66ca4498b97568751932b37d59ed12e9b832600354120f7138e2638dad0"

RPROVIDES:${PN} += "cmake-expected-lite \
expected-lite-devel"

RDEPENDS:${PN} += "libstdc++-devel"

inherit rpm

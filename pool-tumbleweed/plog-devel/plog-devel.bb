SUMMARY = "Development files for plog"
DESCRIPTION = "The plog-devel package contains libraries and header files for \
developing applications that use plog."
LICENSE = "MIT"

PV = "1.1.10"

RPM_NAME = "plog-devel-1.1.10-1.8.aarch64.rpm"
RPM_HASH = "8d12a704c29f1dd05f931aaebddd256d1e403e297f2e6ca33f8562c237b31d7bfebedffc93a68628f531ad8d3961ae5de6bf1b75e7aa9c5de0ebd072906c69af"

RPROVIDES:${PN} += "cmake-plog \
plog-devel"

RDEPENDS:${PN} += ""

inherit rpm

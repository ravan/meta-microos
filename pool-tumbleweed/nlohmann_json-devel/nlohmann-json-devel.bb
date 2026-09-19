SUMMARY = "JSON for Modern C++"
DESCRIPTION = "Development files for a header-only library \
to make JSON a first-class datatype for C++11"
LICENSE = "MIT"

PV = "3.12.0"

RPM_NAME = "nlohmann_json-devel-3.12.0-2.5.aarch64.rpm"
RPM_HASH = "f07fa52a7ee7787cef291796b85fedcdf121d13e13a8cf30af044ac3c94583becc227f51d70b272b9448d653c156a86ae02f415b4b2af5663e0927eece610cfe"

RPROVIDES:${PN} += "cmake-nlohmann-json \
nlohmann-json-devel \
pkgconfig-nlohmann-json"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstdc++-devel"

inherit rpm

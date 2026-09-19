SUMMARY = "Development files for yaml-cpp"
DESCRIPTION = "Development files for yaml-cpp library."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "yaml-cpp-devel-0.9.0-1.3.aarch64.rpm"
RPM_HASH = "6425d3621bb93311444413464cf584e37874f0aa6963fd87e90a93fd68f39881581a8ddcbbc06cae70edd511dcf9b8241b33f495d96a7a15ada4c092259ae980"

RPROVIDES:${PN} += "cmake-yaml-cpp \
pkgconfig-yaml-cpp \
yaml-cpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libyaml-cpp0-9"

inherit rpm

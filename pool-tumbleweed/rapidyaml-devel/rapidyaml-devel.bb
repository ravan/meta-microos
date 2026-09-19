SUMMARY = "Header files for rapidyaml, a library to parse and emit YAML"
DESCRIPTION = "ryml is a C++ library to parse and emit YAML. \
 \
This package contains development headers and examples."
LICENSE = "MIT"

PV = "0.8.0"

RPM_NAME = "rapidyaml-devel-0.8.0-1.5.aarch64.rpm"
RPM_HASH = "f71fb75b72c65fa067a61dd147b018547834ceffbbb7e05552f5bb3c6f93b5305935b654e5c9448c820138860aa0cfdc168e463ee6528eff08971fabb9538a11"

RPROVIDES:${PN} += "cmake-c4core \
cmake-ryml \
rapidyaml-devel"

RDEPENDS:${PN} += "libc4core0-2-5 \
libryml0-8-0"

inherit rpm

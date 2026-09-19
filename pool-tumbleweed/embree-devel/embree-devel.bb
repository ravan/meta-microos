SUMMARY = "Development files for embree"
DESCRIPTION = "This package contains the C++ header and CMake config files."
LICENSE = "Apache-2.0"

PV = "4.4.1"

RPM_NAME = "embree-devel-4.4.1-1.3.aarch64.rpm"
RPM_HASH = "790e4b5a908bcfd77b69607d1899566975414f918d39fcb310f5d28c71896a8cc3437f07185fc68dee660c51aa7428f800aceb719012150649eac2a00882a1e3"

RPROVIDES:${PN} += "cmake-embree \
embree-devel"

RDEPENDS:${PN} += "libembree4-4"

inherit rpm

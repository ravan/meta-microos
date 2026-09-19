SUMMARY = "Development files for mpark-variant"
DESCRIPTION = "MPark.Variant is an implementation of C++17 std::variant for C++11/14/17."
LICENSE = "BSL-1.0"

PV = "1.4.0+20210816.23cb94f"

RPM_NAME = "mpark-variant-devel-1.4.0+20210816.23cb94f-1.5.aarch64.rpm"
RPM_HASH = "8228f90735d36055235a9fa431d549306b07fb3cf88a1210b935badadc0d3cad213b097ae34bc5ce6a88ee7348532b3293c278b8274ebbddb049a3d54f1228a0"

RPROVIDES:${PN} += "cmake-mpark-variant \
mpark-variant-devel \
mpark-variant-static"

RDEPENDS:${PN} += ""

inherit rpm

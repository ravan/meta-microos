SUMMARY = "Development files for clingo"
DESCRIPTION = "The clingo-devel package contains libraries and header files for \
developing applications that use clingo."
LICENSE = "MIT"

PV = "5.8.0"

RPM_NAME = "clingo-devel-5.8.0-2.4.aarch64.rpm"
RPM_HASH = "dfcf8c907c4670187e43107f2bd086487efabee3c7fa9417a7432112702ade7d819dd29b3700a00d2340e6edb1f40180ed44a2cd9668a6826c1cdc6202b2dff9"

RPROVIDES:${PN} += "clingo-devel \
cmake-Clingo"

RDEPENDS:${PN} += "clingo \
libclingo4"

inherit rpm

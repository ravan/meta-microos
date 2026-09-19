SUMMARY = "Development headers for Boost.TypeErasure library"
DESCRIPTION = "This package contains development headers for Boost.TypeErasure library. \
 \
This package installs the default Boost version of the library."
LICENSE = "MIT"

PV = "1.91.0"

RPM_NAME = "libboost_type_erasure-devel-1.91.0-2.1.aarch64.rpm"
RPM_HASH = "d7e7a9bf76d9c7925b1b986b7e8110183608fee47fbb87b12768ef356820d95f988cdfc59ea2211a205a65071d679dafc12ece3d531689fa0f4ec01d2069d7a5"

RPROVIDES:${PN} += "libboost-type-erasure-devel"

RDEPENDS:${PN} += "libboost-type-erasure1-91-0-devel"

inherit rpm

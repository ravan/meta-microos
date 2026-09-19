SUMMARY = "Development files for maeparser"
DESCRIPTION = "This package contains the development files for maeparser."
LICENSE = "MIT"

PV = "1.3.3"

RPM_NAME = "maeparser-devel-1.3.3-1.3.aarch64.rpm"
RPM_HASH = "2d26b5593b09ce059aa78408fa9bf93adc4bc273e8c6b88c24125ea1bf54708d5d8b0d18c0a96f8afbd3f48138d055a5f79d656b7d5a096f8db273e49e7e5a44"

RPROVIDES:${PN} += "cmake-maeparser \
maeparser-devel"

RDEPENDS:${PN} += "libboost-headers-devel \
libmaeparser1"

inherit rpm

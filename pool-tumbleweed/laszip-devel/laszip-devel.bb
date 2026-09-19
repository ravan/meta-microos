SUMMARY = "Development files for laszip"
DESCRIPTION = "Headers and development files for laszip needed to develop \
softwares that handle LAS data to read and write LASzip-compressed \
data."
LICENSE = "LGPL-2.1-or-later"

PV = "3.5.0"

RPM_NAME = "laszip-devel-3.5.0-1.1.aarch64.rpm"
RPM_HASH = "c4358301a4ee9e89da6e80fe75dd2762dfa96dd3c39736915e332719a42b69e18b643078f3888a432a282ea9e8708a5b598d488785a22911aae9b190fa6375cb"

RPROVIDES:${PN} += "laszip-devel"

RDEPENDS:${PN} += "liblaszip-api8 \
liblaszip8"

inherit rpm

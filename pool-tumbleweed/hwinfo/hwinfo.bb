SUMMARY = "Hardware Library"
DESCRIPTION = "A program that lists results from the hardware detection \
library."
LICENSE = "GPL-2.0-or-later"

PV = "25.5"

RPM_NAME = "hwinfo-25.5-1.1.aarch64.rpm"
RPM_HASH = "d4c9239f1a08cf44028b9f44b6c719ec1dce684d389fb917c67062c4e46518183fe0b9f420d1a92d5ba2a87b51854d9b3491360792b11dd6b3d51c25127a8dfe"

RPROVIDES:${PN} += "hwinfo"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libhd.so.25"

inherit rpm

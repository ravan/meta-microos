SUMMARY = "Implementation of Python 3 with very low memory footprint"
DESCRIPTION = "A lean and efficient Python implementation for microcontrollers and constrained systems"
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "micropython-1.28.0-2.3.aarch64.rpm"
RPM_HASH = "807cb2ac9e1e91c6067a57417139c1d81cb5906aeb9310adc2a270508f2c9f905fbc573e975ce7878bc436781c07e81f8c5ddd561b9a37503f50c33ec43f49d5"

RPROVIDES:${PN} += "micropython"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libm.so.6"

inherit rpm

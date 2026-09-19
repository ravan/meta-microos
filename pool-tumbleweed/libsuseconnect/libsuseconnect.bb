SUMMARY = "C interface to suseconnect-ng"
DESCRIPTION = "This package contains library which provides C interface to selected \
suseconnect-ng functions."
LICENSE = "LGPL-3.0-or-later"

PV = "1.23.0"

RPM_NAME = "libsuseconnect-1.23.0-1.1.aarch64.rpm"
RPM_HASH = "bef8c44f64ca5cc7999de2180cac601735f8dc65d43d2103e6ca2e0adceebcaa28caee9612e32f06f071f1beb9ef07e2b0fcb3f2d013293a7af18ee74a8e9813"

RPROVIDES:${PN} += "libsuseconnect \
libsuseconnect.so"

RDEPENDS:${PN} += "libc.so.6 \
suseconnect-ng"

inherit rpm

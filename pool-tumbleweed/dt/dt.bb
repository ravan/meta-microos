SUMMARY = "Generic data test program"
DESCRIPTION = "dt is a generic data test program used to verify proper operation of \
peripherals, file systems, device drivers, or any data stream supported \
by the operating system.  In its simplest mode of operation, dt writes \
and then verifys its default data pattern, then displays performance \
statisics and other test parameters before exiting.  Since verification \
of data is performed, dt can be thought of as a generic diagnostic tool."
LICENSE = "MIT"

PV = "26"

RPM_NAME = "dt-26-1.3.aarch64.rpm"
RPM_HASH = "407275d190b1b5a255b243516acc66dd280967d97b5ffd0a64859d50ccd52802d8c8eae17fb5cb74ca7662ad72ef5974738984172ae7163f3ff5502d0e208db3"

RPROVIDES:${PN} += "dt"

RDEPENDS:${PN} += "/usr/bin/csh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

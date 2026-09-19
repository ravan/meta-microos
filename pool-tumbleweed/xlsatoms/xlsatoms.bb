SUMMARY = "Utility to list interned atoms defined on an X11 server"
DESCRIPTION = "xlsatoms lists the interned atoms defined on an X11 server."
LICENSE = "X11"

PV = "1.1.4"

RPM_NAME = "xlsatoms-1.1.4-1.13.aarch64.rpm"
RPM_HASH = "360d1fdf7e8a422c2a807f279ffbdda6fd08a6481c5c4c3b19b5c8c9dd89adc69ce812daebd351082791d9be49c10cb8e1973fd168ad2c08b5d84c80c10e4c77"

RPROVIDES:${PN} += "xlsatoms"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm

SUMMARY = "An ADS-B Mode S decoder for RTLSDR devices (Flightaware fork)"
DESCRIPTION = "An ADS-B Mode S decoder specifically designed for RTLSDR devices. \
Flightaware fork."
LICENSE = "GPL-2.0-only"

PV = "11.1"

RPM_NAME = "dump1090-fa-11.1-1.2.aarch64.rpm"
RPM_HASH = "6fafab7fc9885f7b4803ad1ff1aa06f3c9ff806212f60dfbb8797cf5fd5e7a03433b38240e8dd58ad99bd8269a4ee8acdfdf0322820e4b9707974e3df7346179"

RPROVIDES:${PN} += "dump1090-fa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbladeRF.so.2 \
libc.so.6 \
libm.so.6 \
libncurses.so.6 \
librtlsdr.so.0 \
libtinfo.so.6"

inherit rpm

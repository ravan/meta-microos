SUMMARY = "Support programs for the open source SDR hardware"
DESCRIPTION = "Tools for HackRF, an open source hardware project to build a Software \
Defined Radio (SDR) peripheral."
LICENSE = "GPL-2.0-only"

PV = "2026.01.3"

RPM_NAME = "hackrf-2026.01.3-1.4.aarch64.rpm"
RPM_HASH = "b78dc9b3812ffd747e3b8fcadd89af2942dfd24990ae876dfe12f5591347e579bfd31123db8bb5169c65724359173a5ce1f6b25d226940c8180414d3e54733d8"

RPROVIDES:${PN} += "hackrf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfftw3f.so.3 \
libhackrf.so.0 \
libm.so.6"

inherit rpm

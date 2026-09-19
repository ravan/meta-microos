SUMMARY = "Library for solving the problem of harmonic inversion"
DESCRIPTION = "Harminv is library to solve the problem of harmonic inversion — given \
a discrete-time, finite-length signal that consists of a sum of \
finitely-many sinusoids (possibly exponentially decaying) in a given \
bandwidth, it determines the frequencies, decay constants, amplitudes, \
and phases of those sinusoids."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.2"

RPM_NAME = "libharminv3-1.4.2-1.12.aarch64.rpm"
RPM_HASH = "77523bfc80ac316486ab1fecbaf5d8d43c4a876c593423ed3954bb5af9a1eb66c3a4a0b76b718fe5fcb5fa3ee9c7a1994bee0e0ffdb51f3f1f14e482c195530f"

RPROVIDES:${PN} += "libharminv.so.3 \
libharminv3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
liblapack.so.3 \
libm.so.6"

inherit rpm

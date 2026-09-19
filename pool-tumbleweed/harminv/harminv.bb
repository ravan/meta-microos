SUMMARY = "Solver for the problem of harmonic inversion"
DESCRIPTION = "Harminv is a program to solve the problem of harmonic inversion — given \
a discrete-time, finite-length signal that consists of a sum of \
finitely-many sinusoids (possibly exponentially decaying) in a given \
bandwidth, it determines the frequencies, decay constants, amplitudes, \
and phases of those sinusoids."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.2"

RPM_NAME = "harminv-1.4.2-1.12.aarch64.rpm"
RPM_HASH = "b77e3aef7880a5b64b1fd6936004cd64fd0d847d91cb7b5fe29925347039847e5b69bb229faf529f171c8a7ea97abe3ec0461f4341bda1bf2d0b6798abb0d2f3"

RPROVIDES:${PN} += "harminv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libharminv.so.3 \
libm.so.6"

inherit rpm

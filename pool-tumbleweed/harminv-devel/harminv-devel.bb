SUMMARY = "Libraries and header files for the harminv library"
DESCRIPTION = "Harminv is library to solve the problem of harmonic inversion — given \
a discrete-time, finite-length signal that consists of a sum of \
finitely-many sinusoids (possibly exponentially decaying) in a given \
bandwidth, it determines the frequencies, decay constants, amplitudes, \
and phases of those sinusoids. \
 \
This package contains libraries and header files for developing \
applications that use harminv."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.2"

RPM_NAME = "harminv-devel-1.4.2-1.12.aarch64.rpm"
RPM_HASH = "0284a195bf5b6fdacba96f8283faa9310bdf41766afbae7f850038aaa97e4b0863a9efd92cd0d7563ffbcefb07c1266ccaff64f88a7091c4657d759a9d58ce47"

RPROVIDES:${PN} += "harminv-devel \
pkgconfig-harminv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libharminv3"

inherit rpm

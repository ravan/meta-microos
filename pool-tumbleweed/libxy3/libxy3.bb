SUMMARY = "Library for reading x-y data from several file formats"
DESCRIPTION = "C++ library for reading files that contain x-y data from powder diffraction, \
spectroscopy or other experimental methods. The supported formats include: \
VAMAS, pdCIF, Bruker UXD and RAW, Philips UDF and RD, Rigaku DAT, \
Sietronics CPI, DBWS/DMPLOT, Koalariet XDD and others."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6"

RPM_NAME = "libxy3-1.6-1.30.aarch64.rpm"
RPM_HASH = "7231be5e021e503ef59a3e9afb57f57fc54a94c173b673fa04c2ff02316785daa3b9abba94fc365e9c69fc09938c9a0b76f640b947b0afc557cc0aa4384f5ffa"

RPROVIDES:${PN} += "libxy.so.3 \
libxy3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

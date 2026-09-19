SUMMARY = "A library for nonlinear optimization"
DESCRIPTION = "NLopt is a free/open-source library for nonlinear optimization, \
providing a common interface for a number of different free \
optimization routines available online as well as original \
implementations of various other algorithms."
LICENSE = "LGPL-2.1-or-later"

PV = "2.11.0"

RPM_NAME = "python314-nlopt-2.11.0-1.4.aarch64.rpm"
RPM_HASH = "82d302e1395290f144a8ff3ec20c6af51e275a6ad02173cfc571a6a65e63eaafdbf2bd417b02b2447d69213aee38b0355ff4243587f006cfb9e190fc980fd082"

RPROVIDES:${PN} += "python3.14dist-nlopt \
python314-nlopt \
python3dist-nlopt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libnlopt.so.1 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm

SUMMARY = "Extra data types for GNU Octave"
DESCRIPTION = "The datatypes package is a collection of classdef Classes for \
providing extra data types not available in core Octave. \
This is part of Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.1"

RPM_NAME = "octave-forge-datatypes-1.2.1-1.3.aarch64.rpm"
RPM_HASH = "7f6650644188e7503c9321def1af1bdb415faf1a47efd796821d730e8b1b5147d6ebb5d14509fbfeb33bef6554557551f91e0db275bf7ba86bee2fb2db81e8f7"

RPROVIDES:${PN} += "octave-forge-datatypes"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm

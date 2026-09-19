SUMMARY = "Instrument Control for Octave"
DESCRIPTION = "Low level I/O functions for serial, i2c, parallel, tcp, gpib, vxi11 and usbtmc interfaces. \
This is part of the Octave-Forge project."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "octave-forge-instrument-control-0.10.1-1.1.aarch64.rpm"
RPM_HASH = "7e3d55baf5dc7875255152dd998663c67baba667a19fc4ce65abb3793b0e689949454d170b824fb07f849ad512ab9de0080ad9ee306ddd9f602642fe479f824e"

RPROVIDES:${PN} += "octave-forge-instrument-control"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
octave-api-v61 \
octave-cli"

inherit rpm

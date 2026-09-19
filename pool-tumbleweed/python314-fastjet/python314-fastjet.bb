SUMMARY = "Python bindings for fastjet"
DESCRIPTION = "FastJet is a software package for jet finding in pp and e+e- \
collisions. \
 \
This package provides python3 bindings for fastjet."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "python314-fastjet-3.5.1-2.1.aarch64.rpm"
RPM_HASH = "1d605f67e49e6a0a538f75b3a6c5cf17097b8d7f938d41fd3010b16ce646bf2cb88de6eea8ca3fc00d5e66f1000ff449c58437e2a3fd2fafd64f6f011df6ec30"

RPROVIDES:${PN} += "python314-fastjet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfastjet.so.0 \
libfastjettools.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm

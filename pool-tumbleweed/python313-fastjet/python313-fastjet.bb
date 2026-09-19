SUMMARY = "Python bindings for fastjet"
DESCRIPTION = "FastJet is a software package for jet finding in pp and e+e- \
collisions. \
 \
This package provides python3 bindings for fastjet."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "python313-fastjet-3.5.1-2.1.aarch64.rpm"
RPM_HASH = "a281bc21ad00f78b25d87be6d5237e2c6cd7d4c957b8b36d0b7cb38c3272f6edb14cbe3d62498c0cee572fbcbcc036bf594c276065d3bb865915a1e716a79e11"

RPROVIDES:${PN} += "python3-fastjet \
python313-fastjet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfastjet.so.0 \
libfastjettools.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm

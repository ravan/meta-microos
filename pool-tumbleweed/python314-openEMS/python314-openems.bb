SUMMARY = "Python 3.14 bindings for openEMS"
DESCRIPTION = "This package contains Python 3.14 bindings for the openEMS \
library."
LICENSE = "GPL-3.0-only"

PV = "0.0.36"

RPM_NAME = "python314-openEMS-0.0.36-4.8.aarch64.rpm"
RPM_HASH = "4e2f3064a8d3b32d29809632d8553c342c3ec47261471e8abd641c01cff02efbb8a2d97ad7249bab4c7f52ef3dce551aa9c2552ceaf84da8bdf0690cf100eb9e"

RPROVIDES:${PN} += "python3.14dist-openems \
python314-openEMS \
python3dist-openems"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libCSXCAD.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libnf2ff.so.0 \
libopenEMS.so.0 \
libstdc++.so.6 \
python-abi \
python314-CSXCAD \
python314-h5py \
python314-matplotlib \
python314-numpy"

inherit rpm

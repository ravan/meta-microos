SUMMARY = "Python 3.13 bindings for openEMS"
DESCRIPTION = "This package contains Python 3.13 bindings for the openEMS \
library."
LICENSE = "GPL-3.0-only"

PV = "0.0.36"

RPM_NAME = "python313-openEMS-0.0.36-4.8.aarch64.rpm"
RPM_HASH = "e6027ca8f27b782b0bb415c064f51dff0f62fdea820d147ed543e9c93b9dab4e74eefb778eff956e5366656c3c5489283cc1021a83672af03f63ac3f735afacd"

RPROVIDES:${PN} += "python3-openEMS \
python3.13dist-openems \
python313-openEMS \
python3dist-openems"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libCSXCAD.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libnf2ff.so.0 \
libopenEMS.so.0 \
libstdc++.so.6 \
python-abi \
python313-CSXCAD \
python313-h5py \
python313-matplotlib \
python313-numpy"

inherit rpm

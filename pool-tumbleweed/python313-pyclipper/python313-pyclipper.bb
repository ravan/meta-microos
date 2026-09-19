SUMMARY = "Cython wrapper for the Clipper library for clipping lines and polygons"
DESCRIPTION = "Pyclipper is a Cython wrapper exposing public functions and classes of \
the C++ translation of the `Angus Johnson's Clipper library`, a library \
for clipping and offsetting lines and polygons. \
 \
The Clipper library performs line & polygon clipping - intersection, \
union, difference & exclusive-or, and line & polygon offsetting. The \
library is based on Vatti's clipping algorithm."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python313-pyclipper-1.4.0-1.6.aarch64.rpm"
RPM_HASH = "1e6a790a67a3a85dd5ae47fe8a888b91b6bf1b9e4f0c69705c668997566f9235d103c3830a0551f2488e1e382d9e75c2ea040baf8bcbc281d71b97b5e7479b90"

RPROVIDES:${PN} += "python3-pyclipper \
python3.13dist-pyclipper \
python313-pyclipper \
python3dist-pyclipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm

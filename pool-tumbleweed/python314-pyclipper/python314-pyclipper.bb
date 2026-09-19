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

RPM_NAME = "python314-pyclipper-1.4.0-1.6.aarch64.rpm"
RPM_HASH = "8c266c3388a6ed53dddf902813c2c86c7cf466f4d9de77f9eb3813c9963213bd5724558f2cb67b7895905185c104b71e3f6555767a0df96dd931f5deef50415c"

RPROVIDES:${PN} += "python3.14dist-pyclipper \
python314-pyclipper \
python3dist-pyclipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm

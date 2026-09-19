SUMMARY = "Real Embedded Algebraic Number Theory in C"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python314-e-antic-2.1.1-2.3.aarch64.rpm"
RPM_HASH = "4c2ca6c798e0574a9ccda89448243a892e159392a6528e3ac8bc80fcd7586d9ca017d7b50fde99550228e879892a593ec3d1270dd1456202363f70c2ada8b2b6"

RPROVIDES:${PN} += "python3.14dist-pyeantic \
python314-e-antic \
python314-pyeantic \
python3dist-pyeantic"

RDEPENDS:${PN} += "python-abi"

inherit rpm

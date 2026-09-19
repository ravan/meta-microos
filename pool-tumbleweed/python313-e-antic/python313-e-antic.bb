SUMMARY = "Real Embedded Algebraic Number Theory in C"
DESCRIPTION = "E-ANTIC is a C/C++ library to deal with real embedded number fields \
built on top of ANTIC."
LICENSE = "LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "python313-e-antic-2.1.1-2.3.aarch64.rpm"
RPM_HASH = "96897c7aaf1d98484b1e922c7025364a080e9841599b9c7541b96177c30ea612414cd6e7302d1caeabe85351756e5e62590e8cd4b8302efa0b5902bdb9a78868"

RPROVIDES:${PN} += "python3-e-antic \
python3-pyeantic \
python3.13dist-pyeantic \
python313-e-antic \
python313-pyeantic \
python3dist-pyeantic"

RDEPENDS:${PN} += "python-abi"

inherit rpm

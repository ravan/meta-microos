SUMMARY = "Python interface for kf6-kunitconversion"
DESCRIPTION = "This package provides a python interface for kf6-kunitconversion."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "python3-kf6-kunitconversion-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "daa699a67232dd63c8debebb27fea0ba8ad924ed643d8575acd1ef1cce6c13ff5c9575ba46e9dcfdd8167cce5fc3cc60c326202496320aab7471ed2d3a9c1ec7"

RPROVIDES:${PN} += "python3-kf6-kunitconversion"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6UnitConversion.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libpyside6.abi3.so.6.11 \
libpython3.13.so.1.0 \
libshiboken6.abi3.so.6.11 \
libstdc++.so.6 \
python-abi"

inherit rpm

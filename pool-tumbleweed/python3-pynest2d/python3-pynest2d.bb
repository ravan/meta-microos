SUMMARY = "CPython bindings for libnest2d"
DESCRIPTION = "Binding allowing libnest2d to be called from Python using Numpy."
LICENSE = "LGPL-3.0-only"

PV = "4.12.0"

RPM_NAME = "python3-pynest2d-4.12.0-3.5.aarch64.rpm"
RPM_HASH = "ecdcb19eb704e43722dbbb0d5e3f863c240c0f0002944379f390d6e03fc5d6da148eb24ff06c745eddc011fe3c070dec681b1758f85a89bd0a4e1135584d7dbf"

RPROVIDES:${PN} += "python3-pynest2d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libnlopt.so.1 \
libpolyclipping.so.22 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
python-abi \
python3-qt5-sip"

inherit rpm

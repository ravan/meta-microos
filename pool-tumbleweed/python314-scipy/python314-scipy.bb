SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.18.1"

RPM_NAME = "python314-scipy-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "c67fbea195c9c5e4d44eaaed06adde39eb6a1a765a8f0561dc76a5f5865b70130ca576fa01e739d2fd3f336e8149abb405b5226ffcb6f87de40d9a6b60f55234"

RPROVIDES:${PN} += "python3.14dist-scipy \
python314-scipy \
python3dist-scipy"

RDEPENDS:${PN} += "-python314-numpy >= 2.0.0 with python314-numpy < 2.8 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm

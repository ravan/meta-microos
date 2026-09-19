SUMMARY = "Scientific Tools for Python"
DESCRIPTION = "Scipy is open-source software for mathematics, science, and \
engineering. The core library is NumPy which provides convenient and \
fast N-dimensional array manipulation. The SciPy library is built to \
work with NumPy arrays, and provides many numerical routines such as \
for numerical integration and optimization."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later & BSL-1.0"

PV = "1.18.1"

RPM_NAME = "python313-scipy-1.18.1-1.1.aarch64.rpm"
RPM_HASH = "29e138dc80bcc25427e9b774ac382a2fb556526ec6582647015f22e83d8d5bdac8410e54358e9696355ac4d669b3a3038c27d450b037995e5b47d00c6500ed5d"

RPROVIDES:${PN} += "python3-scipy \
python3.13dist-scipy \
python313-scipy \
python3dist-scipy"

RDEPENDS:${PN} += "-python313-numpy >= 2.0.0 with python313-numpy < 2.8 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libopenblas.so.0 \
libstdc++.so.6 \
python-abi"

inherit rpm

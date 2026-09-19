SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "python314-scikit-learn-1.9.0-2.1.aarch64.rpm"
RPM_HASH = "fa1756c05ad3745646ce7727d2d32d8fcbbde00af05d80ae1b13e4c29edc748c9538838005fde69b936f146d88300dc0872a8d10c29b42be2ddb1f8b4dce2563"

RPROVIDES:${PN} += "python3.14dist-scikit-learn \
python314-scikit-learn \
python314-sklearn \
python3dist-scikit-learn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-joblib \
python314-narwhals \
python314-numpy \
python314-scipy \
python314-threadpoolctl"

inherit rpm

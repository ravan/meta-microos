SUMMARY = "Python modules for machine learning and data mining"
DESCRIPTION = "Scikit-learn is a python module for machine learning built on top of \
scipy."
LICENSE = "BSD-3-Clause"

PV = "1.9.0"

RPM_NAME = "python313-scikit-learn-1.9.0-2.1.aarch64.rpm"
RPM_HASH = "8979fc324f1a655defb8b831abc4b4cf918417abb17e9b988aa82fa2946b3a84bf132d92e3c7418869e3d5e16fcf8975b5a0fb62cb7e16b94055c1348f70c475"

RPROVIDES:${PN} += "python3-scikit-learn \
python3-sklearn \
python3.13dist-scikit-learn \
python313-scikit-learn \
python313-sklearn \
python3dist-scikit-learn \
sklearn"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-joblib \
python313-narwhals \
python313-numpy \
python313-scipy \
python313-threadpoolctl"

inherit rpm

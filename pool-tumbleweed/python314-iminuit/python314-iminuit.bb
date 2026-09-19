SUMMARY = "Python bindings for MINUIT2"
DESCRIPTION = "iminuit is a Python interface to the MINUIT2 C++ package. \
 \
It can be used as a general function minimization method, \
but is most commonly used for likelihood fits of models to data, \
and to get model parameter error estimates from likelihood profile analysis."
LICENSE = "MIT"

PV = "2.32.0"

RPM_NAME = "python314-iminuit-2.32.0-1.4.aarch64.rpm"
RPM_HASH = "249795eae4aa4166461aee078e66e092341e6e41966e6f4757c9f328b8729e66b07fed2be4cada4d6097afbd7ce18c3a6d8c434977d4003ee8103408463a62a1"

RPROVIDES:${PN} += "python3.14dist-iminuit \
python314-iminuit \
python3dist-iminuit"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm

SUMMARY = "Boost.Python.NumPy runtime library"
DESCRIPTION = "This package contains the Boost.Python.NumPy runtime libraries for python3 \
bindings."
LICENSE = "BSL-1.0"

PV = "1.91.0"

RPM_NAME = "libboost_numpy-py3-1_91_0-1.91.0-4.1.aarch64.rpm"
RPM_HASH = "f784d57605f047a9669ceb3cb25ef1563318e31c86fbe3c92374e46d6bdd5e468b7a9f7d419984989735de6a9187f674d488fcb2c088967a88d39d7369e99315"

RPROVIDES:${PN} += "libboost-numpy-py3-1-91-0 \
libboost-numpy-py3.so.1.91.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
boost-license1-91-0 \
libboost-python-py3.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

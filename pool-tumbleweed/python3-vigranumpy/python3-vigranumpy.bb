SUMMARY = "Numpy support for VIGRA library"
DESCRIPTION = "VIGRA stands for 'Vision with Generic Algorithms'. It is a novel \
computer vision library that puts its main emphasis on customizable \
algorithms and data structures. By using template techniques similar to \
those in the C++ Standard Template Library, you can easily adapt any \
VIGRA component to the needs of your application, without giving up \
execution speed. This package contains python / numpy bindings for VIGRA"
LICENSE = "MIT"

PV = "1.12.2"

RPM_NAME = "python3-vigranumpy-1.12.2-1.14.aarch64.rpm"
RPM_HASH = "ec4b01fe9eaea4df68835e7f440c867643ef27cd8c0439e3d0d553f67c886dfb6fbbbea884e25f5b439806d190dbef22957ba161c675820d200b290cd801491f"

RPROVIDES:${PN} += "cmake-Vigranumpy \
python3-vigranumpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-python-py3.so.1.91.0 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libhdf5-hl.so.310 \
libhdf5.so.310 \
libm.so.6 \
libpython3.13.so.1.0 \
libstdc++.so.6 \
libvigraimpex.so.11 \
python-abi \
python3-numpy \
vigra"

inherit rpm

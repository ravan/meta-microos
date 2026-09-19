SUMMARY = "Python interface for dlib toolkit"
DESCRIPTION = "dlib is a toolkit for making real world machine learning and data analysis \
applications using Python \
 \
This package provides a module to allow importing and using dlib from Python."
LICENSE = "BSL-1.0"

PV = "20.0"

RPM_NAME = "python313-dlib-20.0-2.4.aarch64.rpm"
RPM_HASH = "eca61a8830eec39fe23d2d1226faafa17fe2fe0efe6c89cf97fb301eafd3133f2cc8e57b78d6a8c2caf0c3dced59ed55987fb97980b15618bd9305a92de295d6"

RPROVIDES:${PN} += "python3-dlib \
python3.13dist-dlib \
python313-dlib \
python3dist-dlib"

RDEPENDS:${PN} += "libX11.so.6 \
libc.so.6 \
libcblas.so.3 \
libgcc-s.so.1 \
libgif.so.7 \
libjpeg.so.8 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
liblapack.so.3 \
libm.so.6 \
libpng16.so.16 \
libstdc++.so.6 \
libwebp.so.7 \
python-abi \
python313-base"

inherit rpm

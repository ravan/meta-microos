SUMMARY = "Python interface for dlib toolkit"
DESCRIPTION = "dlib is a toolkit for making real world machine learning and data analysis \
applications using Python \
 \
This package provides a module to allow importing and using dlib from Python."
LICENSE = "BSL-1.0"

PV = "20.0"

RPM_NAME = "python314-dlib-20.0-2.4.aarch64.rpm"
RPM_HASH = "9d6802f8b8f2bce0d7e115f1692e6cf5618f157482ae5577b75412f8618abdec39b056cf175422a60ad34eafeec557ad0a3e9943bd1245c45e9e16ca3991d686"

RPROVIDES:${PN} += "python3.14dist-dlib \
python314-dlib \
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
python314-base"

inherit rpm

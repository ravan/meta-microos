SUMMARY = "Python bindings for the OpenEXR image file format"
DESCRIPTION = "This package provides python bindings for openexr image file format."
LICENSE = "BSD-3-Clause"

PV = "3.4.13"

RPM_NAME = "python314-OpenEXR-3.4.13-1.1.aarch64.rpm"
RPM_HASH = "211ab184eb82f5a1ecf8ef1002adb469702cf8313b130b2569a36a9b6da1e3412716195126c7edb05c4990440253276b5cfd411d097ed87baa1caa2492b3e051"

RPROVIDES:${PN} += "python3.14dist-openexr \
python314-OpenEXR \
python3dist-openexr"

RDEPENDS:${PN} += "libImath-3-2.so.30 \
libc.so.6 \
libdeflate.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libopenjph.so.0.31 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm

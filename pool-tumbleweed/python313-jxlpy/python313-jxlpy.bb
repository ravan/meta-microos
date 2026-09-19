SUMMARY = "Cython bindings and Pillow plugin for JPEG XL"
DESCRIPTION = "This module introduces reading and writing support for JPEG XL directly from \
Python 3. \
 \
JXLPy is based on JPEG XL implementation in imagecodecs but doesn't it require \
Numpy and any external dependencies besides Cython and libjxl. \
 \
It also provides support for Pillow via plugin."
LICENSE = "MIT"

PV = "0.9.5"

RPM_NAME = "python313-jxlpy-0.9.5-1.1.aarch64.rpm"
RPM_HASH = "07d110d287657134f29d9dfbd99ab5d2b200c9e71c40971b6f28721f0e2fe8df44f6d0ea89777ae5da1308014a1792ecb2d530c871ca7ff97fdaa2d5d60da058"

RPROVIDES:${PN} += "python3-jxlpy \
python3.13dist-jxlpy \
python313-jxlpy \
python3dist-jxlpy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjxl-threads.so.0.11 \
libjxl.so.0.11 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm

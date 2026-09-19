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

RPM_NAME = "python314-jxlpy-0.9.5-1.1.aarch64.rpm"
RPM_HASH = "5ea5bd727c94feaaf24bb63c0f55545129bb63dc0ffbf96118a978e281c1215e4241bedb8523dca369bef86133b2fd3eaf148cd5de11ba9746da5a6455183538"

RPROVIDES:${PN} += "python3.14dist-jxlpy \
python314-jxlpy \
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

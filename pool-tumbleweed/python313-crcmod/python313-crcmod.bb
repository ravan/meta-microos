SUMMARY = "CRC Generator"
DESCRIPTION = "The software in this package is a Python module for generating objects that \
compute the Cyclic Redundancy Check (CRC).  There is no attempt in this package \
to explain how the CRC works.  There are a number of resources on the web that \
give a good explanation of the algorithms.  Just do a Google search for 'crc \
calculation' and browse till you find what you need.  Another resource can be \
found in chapter 20 of the book 'Numerical Recipes in C' by Press et. al. \
 \
This package allows the use of any 8, 16, 24, 32, or 64 bit CRC.  You can \
generate a Python function for the selected polynomial or an instance of the \
Crc class which provides the same interface as the ``md5`` and ``sha`` modules \
from the Python standard library.  A ``Crc`` class instance can also generate \
C/C++ source code that can be used in another application."
LICENSE = "MIT"

PV = "1.7"

RPM_NAME = "python313-crcmod-1.7-10.11.aarch64.rpm"
RPM_HASH = "a3706fe2a438ac0a55c7351cce9cae90a355f3dd81e48ad65fed72642405e52ad5eb7cdb64f1c0f0b11b626aa25b4b84f2bcf19339aa364f3d15032b5b222ace"

RPROVIDES:${PN} += "python3-crcmod \
python3.13dist-crcmod \
python313-crcmod \
python3dist-crcmod"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

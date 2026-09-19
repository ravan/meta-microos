SUMMARY = "LHA archive support for Python"
DESCRIPTION = "Lhafile is a python C extension to extract lha files (.lzh). \
The interface is similar to the zipfile module in the regular \
Python distribution."
LICENSE = "BSD-3-Clause"

PV = "0.3.1"

RPM_NAME = "python313-lhafile-0.3.1-1.7.aarch64.rpm"
RPM_HASH = "5343185019948b64771bb38a95f8fe774e81e30fea5e4fa05b66b65393cb784577e0fa40c9ab65211d838ba985d6d031c7e0ae3deb8831ffaf21b42f755b2e44"

RPROVIDES:${PN} += "python3-lhafile \
python3.13dist-lhafile \
python313-lhafile \
python3dist-lhafile"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm

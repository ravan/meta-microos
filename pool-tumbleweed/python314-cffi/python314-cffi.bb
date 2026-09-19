SUMMARY = "Foreign Function Interface for Python calling C code"
DESCRIPTION = "Foreign Function Interface for Python calling C code. The aim of this project \
is to provide a convenient and reliable way of calling C code from Python."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python314-cffi-2.0.0-2.5.aarch64.rpm"
RPM_HASH = "7d1f7bb6c45ca413449aa7fd393fea4ac09e6a322c1406acb226f87bfca8f0ad43e2d18a8be2547a98b78fd97c2989ae4c88cb60a0469b7ee8dcbeb0e223489c"

RPROVIDES:${PN} += "python3.14dist-cffi \
python314-cffi \
python3dist-cffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
python-abi \
python314-pycparser"

inherit rpm

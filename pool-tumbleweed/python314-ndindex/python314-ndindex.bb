SUMMARY = "A Python library for manipulating indices of ndarrays"
DESCRIPTION = "A Python library for manipulating indices of ndarrays."
LICENSE = "MIT"

PV = "1.10.1"

RPM_NAME = "python314-ndindex-1.10.1-1.5.aarch64.rpm"
RPM_HASH = "389e00b6146eb61bf3f42b7c8dba18131215167e88e0632dadcbebbf73997ca3729e06f131c61947ee2f90a9322e218fe7b4357a1cb92fd591c5d89a91c241f1"

RPROVIDES:${PN} += "python3.14dist-ndindex \
python314-ndindex \
python3dist-ndindex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm

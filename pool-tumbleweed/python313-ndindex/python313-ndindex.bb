SUMMARY = "A Python library for manipulating indices of ndarrays"
DESCRIPTION = "A Python library for manipulating indices of ndarrays."
LICENSE = "MIT"

PV = "1.10.1"

RPM_NAME = "python313-ndindex-1.10.1-1.5.aarch64.rpm"
RPM_HASH = "64bd19070f5a0c7aa9949c55ac0f5f08583e7577cd1a559c2a93acf9afd0bb75f3cd0d292d8124b96d31e6aa3284481da0d0c4217f8a3061a1edb5923ade85d2"

RPROVIDES:${PN} += "python3-ndindex \
python3.13dist-ndindex \
python313-ndindex \
python3dist-ndindex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm

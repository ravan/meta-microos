SUMMARY = "Python bindings for libixion"
DESCRIPTION = "Python 3 bindings for libixion."
LICENSE = "MIT"

PV = "0.20.0"

RPM_NAME = "python3-libixion-0.20.0-4.7.aarch64.rpm"
RPM_HASH = "a7094589e09d6e17b3f55ef414af9543d8f1b9b9a844d9d606d5b2bac43cdaf3898a282053637ab32563aac574e5de408c1a168da2939014725b77fd23e6c495"

RPROVIDES:${PN} += "libixion-python3 \
python3-libixion"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libixion-0.20.so.0 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm

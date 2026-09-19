SUMMARY = "Streamlined Cython bindings for the harfbuzz shaping engine"
DESCRIPTION = "Streamlined Cython bindings for the harfbuzz shaping engine"
LICENSE = "Apache-2.0"

PV = "0.56.0"

RPM_NAME = "python313-uharfbuzz-0.56.0-1.1.aarch64.rpm"
RPM_HASH = "34fc131c84a2694c6d33062d2d19b69de846a05f3983b3623ec90e11a889e1773ca011d5d177d6bf4bdeafe2c6b1ef2e9ccb51693ffb82787b67fa3a9346fa46"

RPROVIDES:${PN} += "python3-uharfbuzz \
python3.13dist-uharfbuzz \
python313-uharfbuzz \
python3dist-uharfbuzz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm

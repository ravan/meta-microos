SUMMARY = "Streamlined Cython bindings for the harfbuzz shaping engine"
DESCRIPTION = "Streamlined Cython bindings for the harfbuzz shaping engine"
LICENSE = "Apache-2.0"

PV = "0.56.0"

RPM_NAME = "python314-uharfbuzz-0.56.0-1.1.aarch64.rpm"
RPM_HASH = "e086fb34e9ce100d69bef6b39ba63bc5e8b4bc7c7687cc47ae230a00dd93bc9a6838740756239a291f127f4f1ef08776086ce5c109205982d853eab84c622693"

RPROVIDES:${PN} += "python3.14dist-uharfbuzz \
python314-uharfbuzz \
python3dist-uharfbuzz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm

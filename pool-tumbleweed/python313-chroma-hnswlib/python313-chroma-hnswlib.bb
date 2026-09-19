SUMMARY = "Chromas fork of hnswlib"
DESCRIPTION = "Chroma-Hnswlib - fast approximate nearest neighbor search"
LICENSE = "Apache-2.0"

PV = "0.8.2"

RPM_NAME = "python313-chroma-hnswlib-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "f25caddffc9a2654181336968b3befd5f9c031ff5c8031a83927b12aef3f71f9a09e6c73393c22ba04ff9ff9e4b154da6fbfe4ed2fe7d6fe5eeb795d022f4463"

RPROVIDES:${PN} += "python3-chroma-hnswlib \
python3.13dist-chroma-hnswlib \
python313-chroma-hnswlib \
python3dist-chroma-hnswlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm

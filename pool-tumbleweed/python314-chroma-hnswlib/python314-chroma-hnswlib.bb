SUMMARY = "Chromas fork of hnswlib"
DESCRIPTION = "Chroma-Hnswlib - fast approximate nearest neighbor search"
LICENSE = "Apache-2.0"

PV = "0.8.2"

RPM_NAME = "python314-chroma-hnswlib-0.8.2-1.4.aarch64.rpm"
RPM_HASH = "3b586206568b916a620aef6807e586527afbbf16d0ff4ce0dba4dddf0e76d5d5a71edf9a62a8d70ac58eb037687c8e05660bc3d1b6218f86b6e646e75f0d7abd"

RPROVIDES:${PN} += "python3.14dist-chroma-hnswlib \
python314-chroma-hnswlib \
python3dist-chroma-hnswlib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm

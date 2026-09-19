SUMMARY = "Library for fast text representation and classification"
DESCRIPTION = "fastText is a library for efficient learning of word \
representations and sentence classification."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python314-fasttext-0.9.2-6.7.aarch64.rpm"
RPM_HASH = "a6ba1eb4b2612d58b5968cec8b672b27332e1d0129d4478066136418bd35ebc4d08aa3d3495430e048fc1e44967135582b18bd6ebf0697b71f1ac11724d7f165"

RPROVIDES:${PN} += "fasttext \
python3.14dist-fasttext \
python314-fasttext \
python3dist-fasttext"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
fasttext \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfasttext.so.0 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi \
python314-numpy \
python314-pybind11 \
python314-setuptools"

inherit rpm

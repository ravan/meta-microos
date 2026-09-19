SUMMARY = "Library for fast text representation and classification"
DESCRIPTION = "fastText is a library for efficient learning of word \
representations and sentence classification."
LICENSE = "MIT"

PV = "0.9.2"

RPM_NAME = "python313-fasttext-0.9.2-6.7.aarch64.rpm"
RPM_HASH = "da141a61a85608bd0065c6258e499f9aa211ea12b7a4488ceb9d7ad55498acbfa0b339dd3d1af890dfb6c7fc62f5095242465433d68c578e6e1124896cfa60ea"

RPROVIDES:${PN} += "fasttext \
python3-fasttext \
python3.13dist-fasttext \
python313-fasttext \
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
python313-numpy \
python313-pybind11 \
python313-setuptools"

inherit rpm

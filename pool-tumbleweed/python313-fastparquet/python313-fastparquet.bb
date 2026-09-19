SUMMARY = "Python support for Parquet file format"
DESCRIPTION = "This is a Python implementation of the parquet format \
for integrating it into python-based Big Data workflows."
LICENSE = "Apache-2.0"

PV = "2026.5.0"

RPM_NAME = "python313-fastparquet-2026.5.0-1.2.aarch64.rpm"
RPM_HASH = "d051a0bdc720eb55657904c3e5b9ed1b4d3632b01bb7d7cdda4f0feb3eee7c90905238aa080dda3689f814fdf7a8b534e0a23be222d1c30755c98f2a172c38f5"

RPROVIDES:${PN} += "python3-fastparquet \
python3.13dist-fastparquet \
python313-fastparquet \
python3dist-fastparquet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-cramjam \
python313-fsspec \
python313-numpy \
python313-packaging \
python313-pandas"

inherit rpm

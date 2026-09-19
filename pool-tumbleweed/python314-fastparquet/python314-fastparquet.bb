SUMMARY = "Python support for Parquet file format"
DESCRIPTION = "This is a Python implementation of the parquet format \
for integrating it into python-based Big Data workflows."
LICENSE = "Apache-2.0"

PV = "2026.5.0"

RPM_NAME = "python314-fastparquet-2026.5.0-1.2.aarch64.rpm"
RPM_HASH = "331e54af0713b80405877588c745596e30e79a5bef1f00befbee37c942f48b5318b148e67097ba600b8c361fab5741fe00c6bda46f00590af6f2c7957ea4d5c8"

RPROVIDES:${PN} += "python3.14dist-fastparquet \
python314-fastparquet \
python3dist-fastparquet"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-cramjam \
python314-fsspec \
python314-numpy \
python314-packaging \
python314-pandas"

inherit rpm

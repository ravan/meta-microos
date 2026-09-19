SUMMARY = "Vector search SQLite extension for Python"
DESCRIPTION = "sqlite-vec is a small SQLite extension for storing and querying float, \
int8, and binary vectors in vec0 virtual tables. This package ships the \
loadable (vec0.so) plus Python helpers to load it into sqlite3 \
connections and to serialize vectors."
LICENSE = "Apache-2.0 | MIT"

PV = "0.1.9"

RPM_NAME = "python313-sqlite-vec-0.1.9-1.1.aarch64.rpm"
RPM_HASH = "62dd5de55e2d0f22f4e67ae7fcd2e8bf4db9ba7be9e9d480614f5823e49845bf230561cfa53e7fb172c1625adcac0e80adcf5906d03f5df4e7fecd893e81d0ad"

RPROVIDES:${PN} += "python3-sqlite-vec \
python3.13dist-sqlite-vec \
python313-sqlite-vec \
python3dist-sqlite-vec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi"

inherit rpm

SUMMARY = "Vector search SQLite extension for Python"
DESCRIPTION = "sqlite-vec is a small SQLite extension for storing and querying float, \
int8, and binary vectors in vec0 virtual tables. This package ships the \
loadable (vec0.so) plus Python helpers to load it into sqlite3 \
connections and to serialize vectors."
LICENSE = "Apache-2.0 | MIT"

PV = "0.1.9"

RPM_NAME = "python314-sqlite-vec-0.1.9-1.1.aarch64.rpm"
RPM_HASH = "6b1f90d66b2b7fcdd3c6cb69c1a10f0a5faa976b4a5241accddec3bae07eefb4f2b807b0a3e322ca9ee0ea3c95d5a115eb5f02d99437048c0085f5f3f74f177f"

RPROVIDES:${PN} += "python3.14dist-sqlite-vec \
python314-sqlite-vec \
python3dist-sqlite-vec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
python-abi"

inherit rpm

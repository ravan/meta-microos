SUMMARY = "Reader for the MaxMind DB format"
DESCRIPTION = "This is a Python module for reading MaxMind DB files. The module includes both \
a pure Python reader and an optional C extension. \
 \
MaxMind DB is a binary file format that stores data indexed by IP address \
subnets (IPv4 or IPv6)."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python314-maxminddb-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "814e8a64d1db4be473edd913f52c616e2355628f7cb14f3d27e5a78445750abeb6cff939bbaf96046241709debb3953952fa2c66a7a9aa994959c53f63d572fa"

RPROVIDES:${PN} += "python3.14dist-maxminddb \
python314-maxminddb \
python3dist-maxminddb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
python-abi"

inherit rpm

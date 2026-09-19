SUMMARY = "Reader for the MaxMind DB format"
DESCRIPTION = "This is a Python module for reading MaxMind DB files. The module includes both \
a pure Python reader and an optional C extension. \
 \
MaxMind DB is a binary file format that stores data indexed by IP address \
subnets (IPv4 or IPv6)."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python313-maxminddb-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "bdb19d4228cc64aaaa5f036317b21e0749c2ea7830b2e6667c8377f6dcde3e5559242e7f3722450471b7618dc389beebd2543eb1c45b688950eb41e8adfeba94"

RPROVIDES:${PN} += "python3-maxminddb \
python3.13dist-maxminddb \
python313-maxminddb \
python3dist-maxminddb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmaxminddb.so.0 \
python-abi"

inherit rpm

SUMMARY = "High performance python functional utilities in Cython"
DESCRIPTION = "Cython implementation of the toolz package, which provides high \
performance utility functions for iterables, functions, and \
dictionaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python314-cytoolz-1.1.0-1.6.aarch64.rpm"
RPM_HASH = "69d9b46f1266835e61b08bec3314ee23f9f8c7ebcccd8cdc51bd50925280a70b1c5450810a6e0b4d20464812f8697968c40f513358c206a381b9f44929b5303d"

RPROVIDES:${PN} += "python3.14dist-cytoolz \
python314-cytoolz \
python3dist-cytoolz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-toolz"

inherit rpm

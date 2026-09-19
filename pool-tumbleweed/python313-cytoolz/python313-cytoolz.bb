SUMMARY = "High performance python functional utilities in Cython"
DESCRIPTION = "Cython implementation of the toolz package, which provides high \
performance utility functions for iterables, functions, and \
dictionaries."
LICENSE = "BSD-3-Clause"

PV = "1.1.0"

RPM_NAME = "python313-cytoolz-1.1.0-1.6.aarch64.rpm"
RPM_HASH = "030f0c59843ea6c7858f75ddd3c92abc49be790f1417784fa6512cba9e84bac20c6f530315d6c23d512d732eadfecb81a02cb8c9ca7aae0b5619fb220ed94f96"

RPROVIDES:${PN} += "python3-cytoolz \
python3.13dist-cytoolz \
python313-cytoolz \
python3dist-cytoolz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-toolz"

inherit rpm

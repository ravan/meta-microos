SUMMARY = "Tree is a library for working with nested data structures"
DESCRIPTION = "Tree is a library for working with nested data structures."
LICENSE = "Apache-2.0"

PV = "0.1.10"

RPM_NAME = "python314-dm-tree-0.1.10-1.4.aarch64.rpm"
RPM_HASH = "a685063d0d8504b8d5fa5d4e9bf58f4d97f31cf57350216f311ab0733234adb52d1cb1f306dfb6ff0927bce1fa5a2c7a30247753a71ae075317a9f0bb1a2298f"

RPROVIDES:${PN} += "python3.14dist-dm-tree \
python314-dm-tree \
python3dist-dm-tree"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm

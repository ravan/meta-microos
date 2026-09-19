SUMMARY = "Tree is a library for working with nested data structures"
DESCRIPTION = "Tree is a library for working with nested data structures."
LICENSE = "Apache-2.0"

PV = "0.1.10"

RPM_NAME = "python313-dm-tree-0.1.10-1.4.aarch64.rpm"
RPM_HASH = "f101ff5484c0e3f732fbb403f02fa819979984c5dd03e050c31dd01f9f8765f625498b5d2dcc35d46f010bfeb6051a9ef48e7eccc0810db227b0f2b78f33b5e1"

RPROVIDES:${PN} += "python3-dm-tree \
python3.13dist-dm-tree \
python313-dm-tree \
python3dist-dm-tree"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm

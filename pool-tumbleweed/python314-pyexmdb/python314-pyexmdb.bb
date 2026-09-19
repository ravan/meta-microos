SUMMARY = "Python bindings for libexmdbpp"
DESCRIPTION = "The library provides a C++ API and implementation for constructing \
exmdb protocol requests and responses and conversing with a server. \
 \
This subpackage contains bindings for Python."
LICENSE = "AGPL-3.0-or-later"

PV = "1.11.0.58baa16"

RPM_NAME = "python314-pyexmdb-1.11.0.58baa16-2.7.aarch64.rpm"
RPM_HASH = "45a04fb95405e8f1e4999148e659668a159898db6c3baf056f4816c55c52fec3d44f7c64af855d5187393d83a2c34fcfb8b38fe68df78a3769e6a0e48abdd645"

RPROVIDES:${PN} += "python314-pyexmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexmdbpp.so.0 \
libexmdbpp0 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm

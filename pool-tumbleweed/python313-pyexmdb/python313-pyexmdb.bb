SUMMARY = "Python bindings for libexmdbpp"
DESCRIPTION = "The library provides a C++ API and implementation for constructing \
exmdb protocol requests and responses and conversing with a server. \
 \
This subpackage contains bindings for Python."
LICENSE = "AGPL-3.0-or-later"

PV = "1.11.0.58baa16"

RPM_NAME = "python313-pyexmdb-1.11.0.58baa16-2.7.aarch64.rpm"
RPM_HASH = "bc7289831344a30ac091335af61d384a3cd91d0722ec29be9c6371602ada95b7efdca7f867b0298eaed9bef9e698d6e8d9b1359dc3edeb3cdac2de7118573da2"

RPROVIDES:${PN} += "python3-pyexmdb \
python313-pyexmdb"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexmdbpp.so.0 \
libexmdbpp0 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm

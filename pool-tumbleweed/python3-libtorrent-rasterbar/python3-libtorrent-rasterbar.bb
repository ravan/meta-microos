SUMMARY = "Python Bindings for libtorrent-rasterbar"
DESCRIPTION = "Python Bindings for the libtorrent-rasterbar package."
LICENSE = "BSD-3-Clause"

PV = "2.0.14"

RPM_NAME = "python3-libtorrent-rasterbar-2.0.14-1.1.aarch64.rpm"
RPM_HASH = "dadcf758eaef9c4f5d938fa689791441d5f8e19259157102bf66c096bddd45c1749a9a8465c78c49ba4bbede8444fb548f4572e541fde9c5b2d37022d88117d9"

RPROVIDES:${PN} += "libtorrent.cpython-313-aarch64-linux-gnu.so \
python3-libtorrent-rasterbar \
python3.13dist-libtorrent \
python3dist-libtorrent"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libboost-python-py3.so.1.91.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libtorrent-rasterbar.so.2.0 \
python-abi"

inherit rpm

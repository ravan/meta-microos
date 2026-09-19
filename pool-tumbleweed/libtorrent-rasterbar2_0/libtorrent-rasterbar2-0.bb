SUMMARY = "A C++ implementation of the BitTorrent protocol"
DESCRIPTION = "libtorrent-rasterbar is a C++ library that aims to be a good \
alternative to all the other bittorrent implementations around. \
It is a library and not a full featured client, although it comes \
with a working example client."
LICENSE = "BSD-3-Clause"

PV = "2.0.14"

RPM_NAME = "libtorrent-rasterbar2_0-2.0.14-1.1.aarch64.rpm"
RPM_HASH = "d008a286be7af5968f7ea070e75367ed8df9c792206fac99b95890053bcedbfc9f305fd9ab41bccd9b551ed78fe21d893fdded53beda27a1afbc8816911af2e3"

RPROVIDES:${PN} += "libtorrent-rasterbar.so.2.0 \
libtorrent-rasterbar2-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm

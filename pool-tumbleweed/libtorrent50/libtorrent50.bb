SUMMARY = "A BitTorrent library written in C++"
DESCRIPTION = "LibTorrent is a BitTorrent library written in C++. It transfers \
directly from file pages to the network stack, and achieves 3x higher \
seed speeds than the official client on high-bandwidth links."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "0.16.22"

RPM_NAME = "libtorrent50-0.16.22-1.1.aarch64.rpm"
RPM_HASH = "5bc08877370125c7015a06a1071202069d55d8c965cd1c73dc477906561c43af8afa3b1bbe397d7d98ff9eb3e613928403c2a8f15cc325d72eee33ffcf6ba408"

RPROVIDES:${PN} += "libtorrent.so.50 \
libtorrent50"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgcc-s.so.1 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

SUMMARY = "Development files for libtorrent, a C++ BitTorrent library"
DESCRIPTION = "LibTorrent is a BitTorrent library written in C++. It transfers \
directly from file pages to the network stack, and achieves 3x higher \
seed speeds than the official client on high-bandwidth links."
LICENSE = "SUSE-GPL-2.0+-with-openssl-exception"

PV = "0.16.22"

RPM_NAME = "libtorrent-devel-0.16.22-1.1.aarch64.rpm"
RPM_HASH = "36cc6318494816a6d9f89d1318c6f447e59fd5db8719961f76bd7be4a2dd3e69b26d6fac4b5f00b657ff3d3fac5f7cdc187d2919d4818fbb3a8723f210000e0d"

RPROVIDES:${PN} += "libtorrent-devel \
pkgconfig-libtorrent"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtorrent50 \
pkgconfig-libcrypto \
pkgconfig-libcurl \
pkgconfig-zlib"

inherit rpm

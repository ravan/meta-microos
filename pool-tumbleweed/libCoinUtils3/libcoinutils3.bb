SUMMARY = "Shared Libraries for coin-or-CoinUtils"
DESCRIPTION = "CoinUtils is an open-source collection of classes and helper functions \
that are generally useful to multiple COIN-OR projects."
LICENSE = "EPL-2.0"

PV = "2.11.12"

RPM_NAME = "libCoinUtils3-2.11.12-1.7.aarch64.rpm"
RPM_HASH = "b14d21ae84b053d0d47d73fda4af4e3f9cb1ee2729964714416f55c5fca32fd30c0d43c1a1f6ec348256f0cc6d2a90a4fe639190942eb5c36a774784255e6264"

RPROVIDES:${PN} += "libCoinUtils.so.3 \
libCoinUtils3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm

SUMMARY = "Shared Libraries for coin-or-Cbc"
DESCRIPTION = "Cbc (Coin-or branch and cut) is an open-source mixed integer linear \
programming solver written in C++. It can be used as a callable \
library or using a stand-alone executable. It can be used in a wide \
variety of ways through various modeling systems, packages, etc."
LICENSE = "EPL-2.0"

PV = "2.10.13"

RPM_NAME = "libCbc3-2.10.13-1.2.aarch64.rpm"
RPM_HASH = "fcaf99e762d8672cf6c3f45c635c23d0bf81ece60fa66521ae58e015a48d3d0273d9d77f79b342b00ce0ae7fc56ede40caac3cd32e82b7f435ec720bc1233440"

RPROVIDES:${PN} += "libCbc.so.3 \
libCbc3 \
libCbcSolver.so.3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCgl.so.1 \
libClp.so.1 \
libCoinUtils.so.3 \
libOsi.so.1 \
libOsiClp.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

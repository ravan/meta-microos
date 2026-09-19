SUMMARY = "COIN-OR Open Solver Interface for Cbc"
DESCRIPTION = "Cbc (Coin-or branch and cut) is an open-source mixed integer linear \
programming solver written in C++. It can be used as a callable \
library or using a stand-alone executable. It can be used in a wide \
variety of ways through various modeling systems, packages, etc."
LICENSE = "EPL-2.0"

PV = "2.10.13"

RPM_NAME = "libOsiCbc3-2.10.13-1.2.aarch64.rpm"
RPM_HASH = "757344e7717b0bd5ee2c3cbe6428a1cd5e8bf48e00cbc4281e8eb6f726fc2371aa2894b8acc69df2c4c4ae5043950c44904c855851af40f370c29f6a32a96779"

RPROVIDES:${PN} += "libOsiCbc.so.3 \
libOsiCbc3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCbc.so.3 \
libCoinUtils.so.3 \
libOsi.so.1 \
libOsiClp.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

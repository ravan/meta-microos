SUMMARY = "COIN-OR Branch-and-Cut solver"
DESCRIPTION = "Cbc (Coin-or branch and cut) is an open-source mixed integer linear \
programming solver written in C++. It can be used as a callable \
library or using a stand-alone executable. It can be used in a wide \
variety of ways through various modeling systems, packages, etc."
LICENSE = "EPL-2.0"

PV = "2.10.13"

RPM_NAME = "coin-or-Cbc-2.10.13-1.2.aarch64.rpm"
RPM_HASH = "d575274e5741d1340d5901b03cebb56513526ab3e1fb881a5d67a384ba1fcb215d73c255d572aeeb96eb13d314e4b4dbe97f7b199d01149ff7b963198dafe7a0"

RPROVIDES:${PN} += "coin-or-Cbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libCbc.so.3 \
libCbcSolver.so.3 \
libOsiClp.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm

SUMMARY = "COIN-OR Open Solver Interface for CLP"
DESCRIPTION = "Clp (Coin-or linear programming) is an open-source linear programming \
solver. It is primarily meant to be used as a callable library, but a \
basic, stand-alone executable version is also available."
LICENSE = "EPL-2.0"

PV = "1.17.10"

RPM_NAME = "libOsiClp1-1.17.10-1.7.aarch64.rpm"
RPM_HASH = "273be5973621f46feae327156b6d70dee06c81d982f395cb1a32a71adc0d3e1054826217991400903d1303be66f8945d1172e381071018532125fcb0f0efb06f"

RPROVIDES:${PN} += "libOsiClp.so.1 \
libOsiClp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libClp.so.1 \
libCoinUtils.so.3 \
libOsi.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

SUMMARY = "Shared Libraries for coin-or-Clp"
DESCRIPTION = "Clp (Coin-or linear programming) is an open-source linear programming \
solver. It is primarily meant to be used as a callable library, but a \
basic, stand-alone executable version is also available."
LICENSE = "EPL-2.0"

PV = "1.17.10"

RPM_NAME = "libClp1-1.17.10-1.7.aarch64.rpm"
RPM_HASH = "1c6aa55feeff853114357997a13901034b2d0ebacde7bbe944b98984879acb455aec796472274d6e411b809388c60ff74956607275b34d45059c7ac2e2d7bac8"

RPROVIDES:${PN} += "libClp.so.1 \
libClp1 \
libClpSolver.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libCoinUtils.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

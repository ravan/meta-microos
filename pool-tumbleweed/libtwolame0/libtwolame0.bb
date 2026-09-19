SUMMARY = "Shared libraries for TwoLame"
DESCRIPTION = "TwoLAME is an optimised MPEG Audio Layer 2 (MP2) encoder based on \
tooLAME by Mike Cheng, which in turn is based upon the ISO dist10 \
code and portions of LAME. TwoLAME includes libtwolame, a fully \
thread-safe shared library with an API very similar to LAME's. \
 \
This package contains the shared libraries for TwoLame."
LICENSE = "LGPL-2.1-only"

PV = "0.4.0"

RPM_NAME = "libtwolame0-0.4.0-1.25.aarch64.rpm"
RPM_HASH = "72aad19889263380ff92ae53406e900c3a1f64f733e0b3d6566b7cf746e778b8125cba0b308d7a1bdf8b908418005c601d1b8b2c1926c0f13d4b4e5638032ea0"

RPROVIDES:${PN} += "libtwolame.so.0 \
libtwolame0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

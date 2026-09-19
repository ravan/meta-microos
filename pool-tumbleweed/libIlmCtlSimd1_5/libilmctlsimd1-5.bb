SUMMARY = "SIMD execution for the the Color Transformation Language"
DESCRIPTION = "The IlmCtlSimd library contains functions to use SIMD from the \
CTL interpreter."
LICENSE = "AMPAS"

PV = "1.5.5"

RPM_NAME = "libIlmCtlSimd1_5-1.5.5-1.4.aarch64.rpm"
RPM_HASH = "8b4b2e9499cca2889693c61576ede556db64348222eb8f03ac43e1acb6b1914e2c9d5448cafdb1dbbfb8c76847e99cf04a8d32b319cd45a5771bc077387e1943"

RPROVIDES:${PN} += "libIlmCtlSimd.so.1.5 \
libIlmCtlSimd1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ctl-data \
ld-linux-aarch64.so.1 \
libIex-3-4.so.33 \
libIlmCtl.so.1.5 \
libIlmCtlMath.so.1.5 \
libImath-3-2.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

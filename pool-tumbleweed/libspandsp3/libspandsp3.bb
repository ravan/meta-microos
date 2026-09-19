SUMMARY = "A DSP library for Telephony and SoftFAX"
DESCRIPTION = "SpanDSP is a library of DSP functions for telephony, in the 8000 sample \
per second world of E1s, T1s, and higher order PCM channels. It \
contains low level functions, such as basic filters. It also contains \
higher level functions, such as cadenced supervisory tone detection, \
and a complete software FAX machine."
LICENSE = "LGPL-2.1-only"

PV = "3.0.0+g57"

RPM_NAME = "libspandsp3-3.0.0+g57-1.8.aarch64.rpm"
RPM_HASH = "2dc52fbcc4c14d2e791c4a31bd3982eca8995c6771e36e099a8750272180bd1bc39d4552f1dee46644e98917ebc5bbf5419cc43f3feb10ad00cfc44a1d134ba3"

RPROVIDES:${PN} += "libspandsp.so.3 \
libspandsp3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libmvec.so.1 \
libtiff.so.6"

inherit rpm

SUMMARY = "Computer sound synthesis and composition library"
DESCRIPTION = "Library for csound use \
Csound is a software synthesis program supporting oscillators and \
filters."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "libcsound64-6_0-6.18.1-6.4.aarch64.rpm"
RPM_HASH = "7e6fea50f00a1c696ae91003f1d43d972aedf977d1ee0a8172d672c854862f158e9a8be9fae409aa47db1c7e937d8f9e6783085677207653677f9697be99d38a"

RPROVIDES:${PN} += "libcsound64-6-0 \
libcsound64.so.6.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libmvec.so.1 \
libsndfile.so.1"

inherit rpm

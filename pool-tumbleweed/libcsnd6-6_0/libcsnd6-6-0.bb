SUMMARY = "Computer sound synthesis and composition library"
DESCRIPTION = "Library for csound use. \
Csound is a software synthesis program supporting oscillators and \
filters."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.18.1"

RPM_NAME = "libcsnd6-6_0-6.18.1-6.4.aarch64.rpm"
RPM_HASH = "7b1802034d5186b905dd391b482a858ee7cea3b908461b3ec0cef1a2ecb44e9abc4093ed048062f5a5a04b8943048618504ac699f221f09a82ffd4716a95c9cd"

RPROVIDES:${PN} += "libcsnd6-6-0 \
libcsnd6.so.6.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcsound64.so.6.0 \
libgcc-s.so.1 \
libsndfile.so.1 \
libstdc++.so.6"

inherit rpm

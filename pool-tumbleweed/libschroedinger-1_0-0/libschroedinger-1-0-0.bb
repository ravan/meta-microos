SUMMARY = "Library for decoding and encoding video in the Dirac format"
DESCRIPTION = "The Schroedinger project implements portable libraries for the high \
quality Dirac video codec created by BBC Research and Development. \
Dirac is a free and open source codec producing very high image quality \
video. The project produces two libraries in ANSI C89, one for decoding \
and one for encoding."
LICENSE = "GPL-2.0-only & LGPL-2.0-only & MPL-1.1 & MIT"

PV = "1.0.11"

RPM_NAME = "libschroedinger-1_0-0-1.0.11-11.28.aarch64.rpm"
RPM_HASH = "a776a9573e4d72a941a0045733abc5e3fa22813fdb1bc27f9f042dcf0930d7c3a748457bc67e15c191b1419fb4c30ea14168666e690802bfed27026c22607a14"

RPROVIDES:${PN} += "libschroedinger-1-0-0 \
libschroedinger-1.0.so.0 \
schroedinger"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
liborc-0.4.so.0"

inherit rpm

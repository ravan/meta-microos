SUMMARY = "The UCL compression library"
DESCRIPTION = "This package contains a lossless data compression library written in \
ANSI C. UCL implements the NRV compression algorithms. Compared to \
LZO, decompression time is traded for compression ratio."
LICENSE = "GPL-2.0-or-later"

PV = "1.03"

RPM_NAME = "libucl1-1.03-6.8.aarch64.rpm"
RPM_HASH = "dbf161c8fc5b15ec0deb563ecd42049633b1376a899942b6f14830824e3d6c56b5f488752ab81e7f133c014db8e7a6c99f2a57eeee1ca339598f188621cbf815"

RPROVIDES:${PN} += "libucl.so.1 \
libucl1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

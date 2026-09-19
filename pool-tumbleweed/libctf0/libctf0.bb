SUMMARY = "Compact C Type Format library (runtime, BFD dependency)"
DESCRIPTION = "This package includes the libctf shared library. \
The Compact C Type Format (CTF) is a way of representing information about a binary program"
LICENSE = "GFDL-1.3-only & GPL-3.0-or-later"

PV = "2.45"

RPM_NAME = "libctf0-2.45-4.3.aarch64.rpm"
RPM_HASH = "17d17017de95537ab29b800231077d92b37a953258be9359dfce4a2452b9ef2cb566dea56132d07282915561e680a39bbfad47d5bcfa8ba7cdc415f0c3b01a70"

RPROVIDES:${PN} += "libctf.so.0 \
libctf0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfd-2.45.0.20251103-4.so \
libc.so.6 \
libz.so.1"

inherit rpm

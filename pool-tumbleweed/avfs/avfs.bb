SUMMARY = "AVFS - an archive look-inside filesystem"
DESCRIPTION = "AVFS is a filesystem which enables all programs to look inside archived or \
compressed files, or access remote files without recompiling the programs \
or changing the kernel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.2.0"

RPM_NAME = "avfs-1.2.0-3.5.aarch64.rpm"
RPM_HASH = "11553a463f0e897f74f25ac2a9f29414896cb2dd5a74195ff414a6304942dc1caa06a2c18ae18458ea633a492b26cafec8f15c570b4449ac79944162133e0e10"

RPROVIDES:${PN} += "avfs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libfuse3.so.4 \
liblz.so.1 \
liblzma.so.5 \
libneon.so.27 \
libz.so.1 \
libzstd.so.1"

inherit rpm

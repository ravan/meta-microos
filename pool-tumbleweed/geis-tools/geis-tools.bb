SUMMARY = "Gesture engine interface and support"
DESCRIPTION = "GEIS is a library for applications and toolkit programmers which \
provides a consistent platform independent interface for any \
system-wide input gesture recognition mechanism."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "2.2.17"

RPM_NAME = "geis-tools-2.2.17-5.10.aarch64.rpm"
RPM_HASH = "7b3e2133968835d77ba9b64d205b155d6c021176f7c3c29cf698ebf18da60c460f6b8d78b956a0ced947d717e95a6c01abe0fe4100ffe5f86ff27784df58a0a4"

RPROVIDES:${PN} += "geis-tools"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgeis.so.1 \
libxcb.so.1 \
python3-geis"

inherit rpm

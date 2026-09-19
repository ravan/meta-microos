SUMMARY = "GNU shar utilities"
DESCRIPTION = "This is the set of GNU shar utilities. \
 \
shar makes shell archives out of many files, preparing them for \
transmission by electronic mail services.  Use unshar to unpack shell \
archives after reception. \
 \
uuencode prepares a file for transmission over an electronic channel \
which ignores or otherwise mangles the eight bit (high order bit) of \
bytes.	uudecode does the converse transformation."
LICENSE = "GPL-3.0-or-later"

PV = "4.15.2"

RPM_NAME = "sharutils-4.15.2-10.5.aarch64.rpm"
RPM_HASH = "3ba01a749c59cfad56e4d92c5b1860b5e776e55b7df3b42a471dbcf3425ed2ae2cde392ae5620391301e40c12bfadd6de14641ce93f34b096f1900016b0e8b67"

RPROVIDES:${PN} += "sharutil \
sharutils"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm

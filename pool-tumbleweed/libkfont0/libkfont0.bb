SUMMARY = "Font I/O library for kbd utilities"
DESCRIPTION = "libkfont contains routines for reading/writing PSF fonts, screen maps \
and Unicode maps/tables for kbd."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "2.10.0"

RPM_NAME = "libkfont0-2.10.0-1.1.aarch64.rpm"
RPM_HASH = "366d2ec0d3c8299056d8aa18def2aeb188e44316a322a2910898b716c309d9011518cd024a81a1f7c162241ffe41689d1caf29cce143473c6fc94c5a4c921404"

RPROVIDES:${PN} += "libkfont.so.0 \
libkfont0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libkbdfile.so.1"

inherit rpm

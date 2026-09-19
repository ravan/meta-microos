SUMMARY = "Universal Charset Detection Library"
DESCRIPTION = "uchardet is a C language binding of the original C++ implementation of \
the universal charset detection library by Mozilla. \
 \
uchardet is an encoding detector library, which takes a sequence of \
bytes in an unknown character encoding without any additional \
information, and attempts to determine the encoding of the text."
LICENSE = "GPL-2.0-or-later | MPL-1.1 | LGPL-2.1-or-later"

PV = "0.0.8"

RPM_NAME = "uchardet-0.0.8-2.5.aarch64.rpm"
RPM_HASH = "21c35fb3507f6fa7bf6a6a20278514353817b149cbfa4097da7a0b603359746f215d10f36392492480874a197810a8c3dd146d1b14afe171d6362d6bb5b22278"

RPROVIDES:${PN} += "uchardet"

RDEPENDS:${PN} += "libc.so.6 \
libuchardet.so.0"

inherit rpm

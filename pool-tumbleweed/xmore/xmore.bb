SUMMARY = "Plain text display utility for X"
DESCRIPTION = "xmore is a plain text browser."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "xmore-1.0.4-1.10.aarch64.rpm"
RPM_HASH = "e59a57a636784c733437eeb33f9bcd802883a0f2ded0a21d92e45fb0f375ca2556b96ff515c99f24ed472f5666e51f3c423a6bbb86924d0cbb5bd407ca1891e1"

RPROVIDES:${PN} += "xmore"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6"

inherit rpm

SUMMARY = "Library for converting ANSI, ASCII, and other formats to PNG"
DESCRIPTION = "This library contains shared code regarding the conversion of ANSI and \
artscene related file formats into PNG images."
LICENSE = "BSD-2-Clause"

PV = "1.4.2"

RPM_NAME = "libansilove1-1.4.2-1.5.aarch64.rpm"
RPM_HASH = "a0e61773e304448ee04c86166d4888906be4bce67621c0b6ba8f40912ea2005c1da94f52c57fa5e67d19a407703a547877d6590a8828961579e51cae1ca05993"

RPROVIDES:${PN} += "libansilove.so.1 \
libansilove1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3"

inherit rpm

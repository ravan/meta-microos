SUMMARY = "JBIG2 Decoder Utility"
DESCRIPTION = "jbig2dec is a decoder utility implementing the JBIG2 bi-level image compression \
spec. Also known as ITU T.88 and ISO IEC 14492, and included by reference in \
Adobe's PDF version 1.4 and later."
LICENSE = "AGPL-3.0-or-later"

PV = "0.20"

RPM_NAME = "jbig2dec-0.20-2.13.aarch64.rpm"
RPM_HASH = "8ad2db7624c107d33a4067a3e98de8594f217961df154a39fad4cf7f8de8fb173bf25c397731802056a2f4357f6903e1a72478fffeddba22e21c38d2c27b2028"

RPROVIDES:${PN} += "jbig2dec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjbig2dec.so.0 \
libpng16.so.16"

inherit rpm

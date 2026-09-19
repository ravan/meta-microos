SUMMARY = "JBIG2 Decoder Library"
DESCRIPTION = "jbig2dec is a decoder utility implementing the JBIG2 bi-level image compression \
spec. Also known as ITU T.88 and ISO IEC 14492, and included by reference in \
Adobe's PDF version 1.4 and later."
LICENSE = "AGPL-3.0-or-later"

PV = "0.20"

RPM_NAME = "libjbig2dec0-0.20-2.13.aarch64.rpm"
RPM_HASH = "ac0fe352adc97415147483a1b7527d6abb3671a4e4b51655ac76adfca0fba68386ac273a7e69e5df1141f1110792265b64272bb5af541abe69b4ca3e6600b4a6"

RPROVIDES:${PN} += "libjbig2dec.so.0 \
libjbig2dec0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

SUMMARY = "Protocol Decoder Library for sigrok"
DESCRIPTION = "The sigrok project aims at creating a portable, cross-platform, \
Free/Libre/Open-Source logic analyzer software that supports various \
logic analyzer hardware products. \
 \
libsigrokdecode is a shared library written in C which provides the basic \
API for running sigrok protocol decoders. The protocol decoders themselves \
are written in Python."
LICENSE = "GPL-3.0-or-later"

PV = "0.6.0~git20241001.71f4514"

RPM_NAME = "libsigrokdecode4-0.6.0~git20241001.71f4514-1.6.aarch64.rpm"
RPM_HASH = "da49385888a09a734eaf3752e856cc7b86c24662c0282cb15df0bef0e005987ba3faaba1dad9790483e73962eca21d918759baf5f7c17765290baaa6528dcbf2"

RPROVIDES:${PN} += "libsigrokdecode.so.4 \
libsigrokdecode4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libpython3.13.so.1.0 \
python3-base"

inherit rpm

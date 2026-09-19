SUMMARY = "Test program for Voikko spell checker"
DESCRIPTION = "Libvoikko is a library of free natural language processing tools. It \
aims to provide support for languages that are not well served by \
other existing free linguistic tools. \
 \
This package contains a test program for using Voikko spell checker."
LICENSE = "GPL-2.0-or-later"

PV = "4.3.3"

RPM_NAME = "voikkospell-4.3.3-1.5.aarch64.rpm"
RPM_HASH = "4947372d890f18b580a770e332d1155df116a0351cdeaefc2bba270e3d22bae7c51f5e25a757d5303448d5ce322f16d23796f4dd4295038da9038fa7d990bf84"

RPROVIDES:${PN} += "voikkospell"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvoikko.so.1 \
libvoikko1"

inherit rpm

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

RPM_NAME = "libsigrokdecode-devel-0.6.0~git20241001.71f4514-1.6.aarch64.rpm"
RPM_HASH = "d23f6e6e2117fb4d8a15c9571262d67863ab99d9908c9f058a4c676c014a12e5f37a596e184847319971308875212033b3475a1839772a26e5ebde3975bbb748"

RPROVIDES:${PN} += "libsigrokdecode-devel \
pkgconfig-libsigrokdecode"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsigrokdecode4 \
pkgconfig-glib-2.0 \
pkgconfig-python3-embed \
python3-devel"

inherit rpm

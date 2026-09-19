SUMMARY = "H.264 codec library (dummy implementation)"
DESCRIPTION = "OpenH264 is a codec library which supports H.264 encoding and \
decoding. It is suitable for use in real time applications such as \
WebRTC. \
 \
This package contains a dummy implementation for applications to \
link to OpenH264."
LICENSE = "BSD-2-Clause & LGPL-2.1-or-later"

PV = "2.6.0~noopenh264"

RPM_NAME = "libopenh264-8-2.6.0~noopenh264-1.5.aarch64.rpm"
RPM_HASH = "da24ad1e5b32fe67f8d67a1f57a73e08bb54aa3a91576e7197161861ca1da12b7121de3600d408faaced8e0c2250358710c32013c6ccf1402310270471f86a69"

RPROVIDES:${PN} += "libopenh264-8 \
libopenh264.so.8"

RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm

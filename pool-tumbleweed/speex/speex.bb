SUMMARY = "An Open Source, Patent Free Speech Codec"
DESCRIPTION = "Speex is a patent free audio codec designed especially for voice \
(unlike Vorbis which targets general audio) signals and providing good \
narrowband and wideband quality. This project aims to be complementary \
to the Vorbis codec."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "speex-1.2.1-2.10.aarch64.rpm"
RPM_HASH = "f216a6d3f3db58f72644f834f8d4d8442a4c5aa698ec48c10b4e4d85934cdec5378e8335ff5bd9478197499c3f48771acb41381f47e2babec543d2fe2ab877be"

RPROVIDES:${PN} += "speex"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libogg.so.0 \
libspeex.so.1 \
libspeexdsp.so.1"

inherit rpm

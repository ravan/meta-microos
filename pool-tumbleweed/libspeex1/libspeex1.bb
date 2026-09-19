SUMMARY = "An Open Source, Patent Free Speech Codec Library"
DESCRIPTION = "Speex is a patent free audio codec designed especially for voice \
(unlike Vorbis which targets general audio) signals and providing good \
narrowband and wideband quality. This project aims to be complementary \
to the Vorbis codec."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "libspeex1-1.2.1-2.10.aarch64.rpm"
RPM_HASH = "dffdfafe4f27a273c4740b372bdb05d40fa1c136753db40202d9a2b8753a0f1757a7acd3bcdf7e199f63880560dbe9f3a6332b74535abffece8f3f9841435906"

RPROVIDES:${PN} += "libspeex \
libspeex.so.1 \
libspeex1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

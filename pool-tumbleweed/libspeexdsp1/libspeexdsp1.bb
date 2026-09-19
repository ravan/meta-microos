SUMMARY = "Patent-free speech codec"
DESCRIPTION = "Speex is a patent free audio codec designed especially for voice \
(unlike Vorbis which targets general audio) signals and providing good \
narrowband and wideband quality. This project aims to be complementary \
to the Vorbis codec."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "libspeexdsp1-1.2.1-2.12.aarch64.rpm"
RPM_HASH = "f454e4650c31965a732b3522e89701bf352d9e4927c3ed1bde114a74fdaee9ac22312620cc25b566227cbe7b09688d8079043a565ceeab5699e0b8d717a7ea14"

RPROVIDES:${PN} += "libspeexdsp.so.1 \
libspeexdsp1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm

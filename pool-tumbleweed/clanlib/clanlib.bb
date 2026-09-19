SUMMARY = "A Portable Interface for Writing Games"
DESCRIPTION = "ClanLib delivers a platform-independent interface for writing games."
LICENSE = "Zlib"

PV = "4.2.0"

RPM_NAME = "clanlib-4.2.0-4.1.aarch64.rpm"
RPM_HASH = "de5a6c59f5d9970899977547a65c0dff927c17aab0a73396bb16cd259994e7fbaca3531717b5576bd9247ba48270e2ee39a635b8f8882ab85eae172d29a10485"

RPROVIDES:${PN} += "clanlib \
libclan42App-4.2.so.1 \
libclan42Core-4.2.so.1 \
libclan42Display-4.2.so.1 \
libclan42GL-4.2.so.1 \
libclan42Network-4.2.so.1 \
libclan42Sound-4.2.so.1 \
libclan42UI-4.2.so.1 \
libclan42XML-4.2.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXinerama.so.1 \
libasound.so.2 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm

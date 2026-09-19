SUMMARY = "Theora video compression codec"
DESCRIPTION = "Theora is a free and open video compression format. It is designed to scale \
well from postage stamp to HD resolution, and is considered particularly \
competitive at low bitrates. \
 \
The package contains the library that can decode and encode Theora streams. \
Theora is also able to playback VP3 streams."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "libtheora1-1.2.0-2.6.aarch64.rpm"
RPM_HASH = "c16b668d6c7bbe650256e0d10ba8dcc4040f79282302ef32b59511c3e902f564f0bd4ef4bb86cc3ab56aa5319820afd2a14d0f9039caaff167876f42d091a2ce"

RPROVIDES:${PN} += "libtheora \
libtheora.so.1 \
libtheora1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libogg.so.0"

inherit rpm

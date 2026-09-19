SUMMARY = "Ogg Bitstream Library"
DESCRIPTION = "Libogg is a library for manipulating Ogg bitstreams.  It handles both \
making Ogg bitstreams and getting packets from Ogg bitstreams. \
 \
Ogg is the native bitstream format of libvorbis (Ogg Vorbis audio \
codec) and libtheora (Theora video codec)."
LICENSE = "BSD-3-Clause"

PV = "1.3.6"

RPM_NAME = "libogg0-1.3.6-1.4.aarch64.rpm"
RPM_HASH = "e4e26f1a02358c226310a01ea06df771fc13190a93bc767bb4741732eca69503866813a3dc95c98480ca526e00fa6503b52321ab921e237b3229f9995a97418b"

RPROVIDES:${PN} += "libogg.so.0 \
libogg0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm

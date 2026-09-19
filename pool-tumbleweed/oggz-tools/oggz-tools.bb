SUMMARY = "A library that provides parsing and seeking of Ogg-files"
DESCRIPTION = "liboggz knows about Ogg speex, Ogg vorbis, Ogg theora, and the \
Ogg based Annodex formats, thus allows parsing (though not decoding) \
of these files. For getting decoding and encoding functionality you \
will require in addition libspeex, libvorbis, libtheora, and \
libannodex respectively."
LICENSE = "BSD-3-Clause"

PV = "1.1.3"

RPM_NAME = "oggz-tools-1.1.3-2.4.aarch64.rpm"
RPM_HASH = "eb631ed48e6c07781a1c01945594d760d9729027f2da8b32dd0c5db5464fc26ca6259cf5d923e16dd4a0edf91404b4ea41ffad04933fd004e476b573f3c9332e"

RPROVIDES:${PN} += "oggz-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libogg.so.0 \
liboggz.so.2"

inherit rpm

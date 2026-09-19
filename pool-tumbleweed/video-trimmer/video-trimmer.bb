SUMMARY = "Trim videos quickly"
DESCRIPTION = "Video Trimmer cuts out a fragment of a video given the start and end \
timestamps. The video is never re-encoded, so the process is very fast and \
does not reduce the video quality."
LICENSE = "GPL-3.0-or-later"

PV = "26.03.1"

RPM_NAME = "video-trimmer-26.03.1-1.3.aarch64.rpm"
RPM_HASH = "2b71aae073d37ad101d5c29f8482fa4d8b00c27ad541aa4143da2dfbb15551bb9672f18724a5db28f1ff70afb7f7c27e1698e7a633c49e22ef12861efbf7e18a"

RPROVIDES:${PN} += "video-trimmer"

RDEPENDS:${PN} += "libadwaita-1.so.0 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libpango-1.0.so.0"

inherit rpm

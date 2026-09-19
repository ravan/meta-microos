SUMMARY = "Video cutter that uses FFmpeg and GTK+"
DESCRIPTION = "CutterFF is a program for cutting videos using FFmpeg and GTK+. \
It does not decode/encode the streams, it only copies them. \
 \
Features \
 - Selecting which streams written to the output \
 - Selecting the format and bitstream filters \
 - Choose a program if video contains more than one \
 - Set cutpoints everywhere in the video \
 - Many formats and codecs supported by FFmpeg \
 - Log window for displaying FFmpeg messages"
LICENSE = "GPL-3.0-only"

PV = "1.3"

RPM_NAME = "cutterff-1.3-1.14.aarch64.rpm"
RPM_HASH = "4b1a7913837dd307216de94295f4a5898c375de9ce771a828eadce0d8cdb9af954a21a917591f4aaba18d9e8ecacfbca75ae56d3392f095d1f981fbfaca502e1"

RPROVIDES:${PN} += "cutterff"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libswscale.so.9"

inherit rpm

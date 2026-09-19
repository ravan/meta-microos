SUMMARY = "Clapper Enhancer Parser M3U"
DESCRIPTION = "M3U playlists support"
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "clapper-enhancers-parser-m3u-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "03a8c1b658621a3ce2c55929bf86b564043990683a66f3f4f2e559ee12670f36b3758b710a722413cfecd2f77e160169dd2068ae8fde6c6e8d731dd84fe45032"

RPROVIDES:${PN} += "clapper-enhancers-parser-m3u \
libclapper-parser-m3u.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclapper-0.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libpeas-2.so.0"

inherit rpm

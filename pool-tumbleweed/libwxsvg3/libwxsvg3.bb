SUMMARY = "Library to create, manipulate and render SVG files"
DESCRIPTION = "Dynamic libraries from wxsvg, as required at runtime."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "1.5.25"

RPM_NAME = "libwxsvg3-1.5.25-2.6.aarch64.rpm"
RPM_HASH = "1260c45bac74cf59d9408be2434ad77498918bed03a4efcf76426912f0c8bcd3ce317859369c7cbda61d88f1e8832e3308355348d87d18a4202c8fa041fe5858"

RPROVIDES:${PN} += "libwxsvg.so.3 \
libwxsvg3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcairo.so.2 \
libexif.so.12 \
libexpat.so.1 \
libgcc-s.so.1 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstdc++.so.6 \
libswscale.so.9 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk3u-core-suse.so.16.0.0"

inherit rpm

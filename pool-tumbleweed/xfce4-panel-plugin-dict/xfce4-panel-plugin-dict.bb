SUMMARY = "Dictionary Plugin for the Xfce Panel"
DESCRIPTION = "This package contains the xfce4-dict dictionary plugin for the Xfce panel."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.10"

RPM_NAME = "xfce4-panel-plugin-dict-0.8.10-1.1.aarch64.rpm"
RPM_HASH = "ef13d4758d750651555ac2f61d5f783eb491892d127ba96d19d4567f63b1483794e9a614c398b0fabfaa17928f1bffd1e500dcdd25885259b905113330981936"

RPROVIDES:${PN} += "libxfce4dict.so \
xfce4-panel-plugin-dict"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
xfce4-dict \
xfce4-panel"

inherit rpm

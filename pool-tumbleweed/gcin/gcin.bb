SUMMARY = "Chinese input method server"
DESCRIPTION = "gcin is a Chinese input method server for traditional Chinese. \
It features a better GTK user interface."
LICENSE = "LGPL-2.1-only"

PV = "2.9.0"

RPM_NAME = "gcin-2.9.0-7.9.aarch64.rpm"
RPM_HASH = "cc2421a3e8e484765742b202cb1dd9271b388bcc33ed1262070ce78a6a78326a21bead6224d18be1ea4171222c578cb9078bd67c229ad4e8e5afb453926ad83b"

RPROVIDES:${PN} += "gcin \
locale-zh-TW;zh-HK;zh-MO"

RDEPENDS:${PN} += "/usr/bin/bash \
gcin-branding \
gcin-gtk2 \
gcin-gtk3 \
gcin-qt5 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgcin-im-client.so.1 \
libgcin-im-client1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm

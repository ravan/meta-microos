SUMMARY = "MATE dictionary"
DESCRIPTION = "This is the MATE dictionary as shipped with the MATE utilities. \
mate-dictionary is a program which can look up the definition of \
words"
LICENSE = "GPL-2.0-or-later"

PV = "1.28.0"

RPM_NAME = "mate-dictionary-1.28.0-2.6.aarch64.rpm"
RPM_HASH = "fa4cb4c2a6cf008f51e174e2f4a5622174ff313cb36316c358c4cc0a8de19594b1e61d937583838d294e1662c10f411cd55e590ffbfc8c4c9ed2b4c859315f91"

RPROVIDES:${PN} += "libmate-dictionary-applet.so.0 \
mate-dictionary"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libm.so.6 \
libmate-desktop-2.so.17 \
libmate-panel-applet-4.so.1 \
libmatedict.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
mate-desktop-gschemas"

inherit rpm

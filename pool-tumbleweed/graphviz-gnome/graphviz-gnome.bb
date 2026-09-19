SUMMARY = "Graphviz plugins that use gtk/GNOME"
DESCRIPTION = "Graphviz plugins that use gtk/GNOME."
LICENSE = "EPL-2.0"

PV = "15.0.0"

RPM_NAME = "graphviz-gnome-15.0.0-2.3.aarch64.rpm"
RPM_HASH = "a5ef863246315a5550e2ee39bf4eda15788d528e095a797fc049e47367c3aa3995ba0c1276fd5fb2715117da1f46f96359647040ca7dcf68059b4553324768cf"

RPROVIDES:${PN} += "graphviz-gnome \
libgvplugin-gs.so.8 \
libgvplugin-pango.so.8 \
libgvplugin-rsvg.so.8 \
libgvplugin-xlib.so.8"

RDEPENDS:${PN} += "/usr/bin/sh \
graphviz \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgs.so.10 \
libgvc.so.7 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
librsvg-2.so.2"

inherit rpm

SUMMARY = "GTK3 settings editor adapted to work in sway/wlroots environment"
DESCRIPTION = "Nwg-look is a GTK3 settings editor, designed to work properly in wlroots-based Wayland environment. The look and feel is strongly influenced by LXAppearance."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "nwg-look-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "36fb1c10f41f9f5bc6d48ec940170a99e58cfe2567edcdd53d723128291cddee38467b68f409efb819dc03fe99cf8c8b8a60215ba3875f3d8434bda0273d1ea6"

RPROVIDES:${PN} += "nwg-look"

RDEPENDS:${PN} += "libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libfontconfig.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm

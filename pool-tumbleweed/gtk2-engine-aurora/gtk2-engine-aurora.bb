SUMMARY = "Another GTK2 engine theme"
DESCRIPTION = "The Aurora Gtk Engine themes all common Gtk widgets \
to provide an attractive, complete and consistent \
look for Gtk applications."
LICENSE = "GPL-2.0"

PV = "1.5.1"

RPM_NAME = "gtk2-engine-aurora-1.5.1-18.1.aarch64.rpm"
RPM_HASH = "cb11a11d3d88ae3b4752b83a7026cf22c0783b7130319f2b15a7bcaa1a4853bed15393f8323db88eb232d181f960b2f5b716339babee0fce157f5a232842e995"

RPROVIDES:${PN} += "gtk2-engine-aurora \
libaurora.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm

SUMMARY = "Wlroots application drawer"
DESCRIPTION = "Application drawer for wlroots-based Wayland compositors."
LICENSE = "MIT"

PV = "0.7.5"

RPM_NAME = "nwg-drawer-0.7.5-1.7.aarch64.rpm"
RPM_HASH = "6059a1a8d9d82abc83215c463982a07fb8f16f1c0d9832f8d25eba17f3fd5997ac0ffec183cecf66f119449c780e4f53c631cb035ee3d067cb2e9128a3f17ede"

RPROVIDES:${PN} += "nwg-drawer"

RDEPENDS:${PN} += "libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libpango-1.0.so.0"

inherit rpm

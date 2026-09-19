SUMMARY = "Library to create components for Wayland and GTK4 using the Layer Shell"
DESCRIPTION = "Library for using the Layer Shell and Session Lock Wayland protocols with \
GTK4. This Library is compatible with C, C++ and any language that supports \
GObject introspection files (Python, Vala, etc)."
LICENSE = "MIT"

PV = "1.3.0+git21.cbfdd73"

RPM_NAME = "libgtk4-layer-shell0-1.3.0+git21.cbfdd73-1.1.aarch64.rpm"
RPM_HASH = "107b4fa410c197627c5d424c54906d22656c4300f7fdc820b17352addbb2a6440d81d093c14409e6a6edf16f930d8f436b516ab5e2c9782f325ae7ee5bdef8bb"

RPROVIDES:${PN} += "libgtk4-layer-shell.so.0 \
libgtk4-layer-shell0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libwayland-client.so.0 \
typelib-1-0-Gtk4LayerShell-1-0"

inherit rpm

SUMMARY = "A wayland based logout menu"
DESCRIPTION = "A wayland based logout menu."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "wlogout-1.2.2-1.7.aarch64.rpm"
RPM_HASH = "c2af37f686da6cef0542c680930f4cc8898fd75261574aa05f1c8b2d43de2814db093c7143fc88f6f642ebb243044e80bc547a0f8fa540c61b696614117d0d34"

RPROVIDES:${PN} += "config-wlogout \
wlogout"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0"

inherit rpm

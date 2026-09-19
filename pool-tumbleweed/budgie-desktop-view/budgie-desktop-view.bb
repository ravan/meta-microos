SUMMARY = "Official Budgie Desktop icons application / implementation"
DESCRIPTION = "Budgie Desktop View is the official Budgie desktop icons application / implementation"
LICENSE = "Apache-2.0"

PV = "10.10.0+0"

RPM_NAME = "budgie-desktop-view-10.10.0+0-1.3.aarch64.rpm"
RPM_HASH = "6fc9ee87efb6a8d3a333b4823284824b772b377490f2d6e7ffc621eac70b3f2b3ab456b411d94d866e36440efef183fdf15d59a20ae9c29d8006a9c62805c68d"

RPROVIDES:${PN} += "budgie-desktop-view"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libxfce4windowing-0.so.0"

inherit rpm

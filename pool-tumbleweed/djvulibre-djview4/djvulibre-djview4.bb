SUMMARY = "Portable DjVu Qt4 Based Viewer and Browser Plugin"
DESCRIPTION = "DjView4 is a viewer and browser plugin for DjVu documents,based on the \
DjVuLibre-3.5 library and the Qt4 toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "4.12"

RPM_NAME = "djvulibre-djview4-4.12-2.17.aarch64.rpm"
RPM_HASH = "04caef3dc44c9fac7ef2ae243df23084fda5c218d5abb7f699248b0e592ba5a8ded04eec9a9590f0fb2b39c9249d7a8cce8c9ccfb1bc0e3f553438d3d4df32bc"

RPROVIDES:${PN} += "djvulibre-djview4"

RDEPENDS:${PN} += "djvulibre \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5OpenGL.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdjvulibre.so.21 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm

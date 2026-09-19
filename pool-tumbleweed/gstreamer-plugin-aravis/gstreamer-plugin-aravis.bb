SUMMARY = "Gstreamer support for aravis"
DESCRIPTION = "This package contains the gstreamer plugin for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.36"

RPM_NAME = "gstreamer-plugin-aravis-0.8.36-2.3.aarch64.rpm"
RPM_HASH = "3d90641921927b48be9cdc7e9c20b658f8653e37c3d40fd534414b2c7d2aebdef00acac332bdc78ea71abfe155569afcb057857c44ae99a3c2133a4c5f53e980"

RPROVIDES:${PN} += "gstreamer-plugin-aravis \
gstreamer1 \
libgstaravis.0.8.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaravis-0.8.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstbase-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm

SUMMARY = "Glib/gobject based library implementing a Genicam interface"
DESCRIPTION = "Aravis is a glib/gobject based library implementing a Genicam interface, \
which can be used for the acquisition of video streams coming from either \
ethernet, firewire or USB cameras. It currently only implements an ethernet \
camera protocol used for industrial cameras."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.36"

RPM_NAME = "aravis-0.8.36-2.3.aarch64.rpm"
RPM_HASH = "9e5b49fa0cd44cac543f8f9bcf2bd45c79a58f7bf1132b6e970f0a145a60618202ce2e8d51781e3d76d03ae7e9e21fd4eeb4efeefd5b253fa2aa8c00e7d87f3e"

RPROVIDES:${PN} += "aravis"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaravis-0.8.so.0 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

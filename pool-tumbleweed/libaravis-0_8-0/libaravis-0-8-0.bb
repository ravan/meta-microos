SUMMARY = "Shared library for aravis"
DESCRIPTION = "Aravis is a glib/gobject based library implementing a Genicam interface, \
which can be used for the acquisition of video streams coming from either \
ethernet, firewire or USB cameras. It currently only implements an ethernet \
camera protocol used for industrial cameras. \
 \
This package contains the shared library for aravis."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.36"

RPM_NAME = "libaravis-0_8-0-0.8.36-2.3.aarch64.rpm"
RPM_HASH = "f41381fc636dfd6215e2b59c40dcbb8b81868ba73e8c7160e72e780ba61903911de947d0fa30d72cd08eef6dc3a4ea00736415e277ca5ca6cdc943115843a345"

RPROVIDES:${PN} += "libaravis-0-8-0 \
libaravis-0.8.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libusb-1.0.so.0 \
libxml2.so.16 \
libz.so.1"

inherit rpm

SUMMARY = "Virtual Machine Viewer"
DESCRIPTION = "Virtual Machine Viewer provides a graphical console client for \
connecting to virtual machines. It uses the GTK-VNC widget to provide \
the display, and libvirt for looking up VNC server details."
LICENSE = "GPL-2.0-or-later"

PV = "11.0"

RPM_NAME = "virt-viewer-11.0-10.1.aarch64.rpm"
RPM_HASH = "16eb1862df15702e90edb62ad013dfe1efd76219b0956670cd99a7933a051ebe01ff2ba3deb3d9e5d53a01b3a92ccfdde4b4c0dc702e610fb1c1f19f7e4f82f8"

RPROVIDES:${PN} += "virt-viewer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-vnc-2.0.so.0 \
libgvnc-1.0.so.0 \
libpango-1.0.so.0 \
libspice-client-glib-2.0.so.8 \
libspice-client-gtk-3.0.so.5 \
libvirt-glib-1.0.so.0 \
libvirt.so.0 \
libvte-2.91.so.0 \
libxml2.so.16 \
netcat"

inherit rpm

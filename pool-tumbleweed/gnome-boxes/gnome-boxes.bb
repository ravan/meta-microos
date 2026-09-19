SUMMARY = "A GNOME 3 application to access remote or virtual systems"
DESCRIPTION = "Boxes is an application to create, setup, access, and use: remote \
machines, remote and local virtual machines, and, when technology permits, \
applications on local virtual machines."
LICENSE = "LGPL-2.0-or-later"

PV = "50.0"

RPM_NAME = "gnome-boxes-50.0-2.2.aarch64.rpm"
RPM_HASH = "2bf9e8ff3ce09e2ad79e2e89b9c363261b91ca483e998268efa7ac2a459bf2ac90e7d5f0a802eff8e4a66bb47cef95478d66cf9ea065885c24dc471edef41829"

RPROVIDES:${PN} += "gnome-boxes \
libgovf-0.1.so \
typelib-Govf"

RDEPENDS:${PN} += "cdio-utils \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libhandy-1.so.0 \
libm.so.6 \
libosinfo-1.0.so.0 \
libportal-gtk3.so.1 \
libportal.so.1 \
libsoup-3.0.so.0 \
libspice-client-glib-2.0.so.8 \
libspice-client-gtk-3.0.so.5 \
libusb-1.0.so.0 \
libvirt-daemon-qemu \
libvirt-gconfig-1.0.so.0 \
libvirt-gobject-1.0.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.16 \
localsearch \
mtools \
qemu-chardev-spice \
qemu-hw-usb-host \
qemu-hw-usb-redirect \
qemu-hw-usb-smartcard \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio"

inherit rpm

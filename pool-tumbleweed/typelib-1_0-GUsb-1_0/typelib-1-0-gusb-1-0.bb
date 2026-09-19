SUMMARY = "Introspection bindings for libgusb, a GObject-based wrapper for libusb1"
DESCRIPTION = "GUsb is a GObject wrapper for libusb1 that makes it easy to do \
asynchronous control, bulk and interrupt transfers with proper \
cancellation and integration into a mainloop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.4.9"

RPM_NAME = "typelib-1_0-GUsb-1_0-0.4.9-1.10.aarch64.rpm"
RPM_HASH = "30e7ee513da464d035fbcab981e9b6d57e5c9e50a9d2c5300b97e5029cca4d9b8628be207f1c0bbb7f9949e96396214db6fc56ecc4df1c5b8b1466fa0c980689"

RPROVIDES:${PN} += "typelib-1-0-GUsb-1-0 \
typelib-GUsb"

RDEPENDS:${PN} += "libgusb.so.2 \
typelib-GLib \
typelib-GModule \
typelib-GObject \
typelib-Gio \
typelib-Json"

inherit rpm

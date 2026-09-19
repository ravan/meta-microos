SUMMARY = "USB Topology and Device Viewer"
DESCRIPTION = "USBView is a GTK program that displays the topography of the devices \
that are plugged into the USB on a Linux machine. It also displays \
information on each of the devices. This can be useful to determine if \
a device is working properly."
LICENSE = "GPL-2.0-only"

PV = "3.1"

RPM_NAME = "usbview-3.1-2.4.aarch64.rpm"
RPM_HASH = "c3b21a052dde57df6d0f573d5547cc4173ef7cc028341c5d3c288672e875bb9771ae2ad8cb71674e88adb70b1036dca283a0e223d9a1b13c91732d655aa5c94c"

RPROVIDES:${PN} += "usbview"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm

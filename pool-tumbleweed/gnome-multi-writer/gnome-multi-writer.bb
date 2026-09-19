SUMMARY = "Program for writing an ISO file to multiple USB devices at once"
DESCRIPTION = "GNOME MultiWriter can be used to write an ISO file to multiple USB devices \
at once. \
Supported drive sizes are between 1Gb and 32Gb. \
 \
MultiWriter may be useful for QA testing, to create a GNOME Live image \
or a code sprint or to create hundreds of LiveUSB drives for a trade show."
LICENSE = "GPL-2.0-or-later"

PV = "3.35.90+26"

RPM_NAME = "gnome-multi-writer-3.35.90+26-3.4.aarch64.rpm"
RPM_HASH = "80ef14708db604e465c463c58a8d3675e4d0d12001598d165c56122213fe46e567cb74878a5a27090fbe97b1c93cb75c13a624335b91ca024b27f66c4a6e3c5f"

RPROVIDES:${PN} += "gnome-multi-writer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcanberra-gtk3.so.0 \
libcanberra.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libgusb.so.2 \
libpolkit-gobject-1.so.0 \
libudisks2.so.0"

inherit rpm

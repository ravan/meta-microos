SUMMARY = "Automatic archives creating and extracting library"
DESCRIPTION = "gnome-autoar provides functions, widgets, and gschemas for GNOME applications which want \
to use archives as a method to transfer directories over the Internet."
LICENSE = "LGPL-2.0-or-later"

PV = "0.4.5"

RPM_NAME = "libgnome-autoar-gtk-0-0-0.4.5-3.4.aarch64.rpm"
RPM_HASH = "c96cb46392419b4e3f21d5c90e5dee04aefedb776ab79e58d9cf3bc1c687d5f5b35cdddad04e8a4d7be74fadb5e29a426c7aa7e2dca8a57a67f26b03a493760f"

RPROVIDES:${PN} += "libgnome-autoar-gtk-0-0 \
libgnome-autoar-gtk-0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgnome-autoar-0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm

SUMMARY = "Platform Independent Hotkey Handling for GTK+ Applications"
DESCRIPTION = "GtkHotkey is simple library offering a platform independent way for GTK+ \
applications to manage and bind desktop-wide hotkeys."
LICENSE = "LGPL-3.0-or-later"

PV = "0.2.1"

RPM_NAME = "libgtkhotkey1-0.2.1-18.9.aarch64.rpm"
RPM_HASH = "01aafdc2eeaf5c7392a8399b9c21b2bfa5722d64f75e30db9232a03988d809be1d21d938587dc8f17cfa57671835679d8622f2c16d6162272a9e0ea27f4f006f"

RPROVIDES:${PN} += "libgtkhotkey.so.1 \
libgtkhotkey1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm

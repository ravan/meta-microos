SUMMARY = "The Anthy engine for IBus input platform"
DESCRIPTION = "The Anthy engine for IBus platform. It provides Japanese input method from \
libanthy."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.17"

RPM_NAME = "ibus-anthy-1.5.17-2.4.aarch64.rpm"
RPM_HASH = "b702a4f59b02a2fba7670ab2d740318a0b0174a2544374a02bad8b95e71789883bf08df475aa3f19ac7686cf4fe9ad25612e1080492bf4a0382ce6f01f4c7b8a"

RPROVIDES:${PN} += "ibus-anthy \
libanthygobject-1.0.so.5 \
typelib-Anthy"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
anthy \
ld-linux-aarch64.so.1 \
libanthy.so.0 \
libanthydic.so.0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
python3-gobject \
typelib-Anthy \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-IBus \
typelib-Pango"

inherit rpm

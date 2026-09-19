SUMMARY = "GNOME OpenGPG key signing helper"
DESCRIPTION = "Its purpose is to ease signing other peoples' keys. It is similar \
to caff, PIUS, or monkeysign. In fact, it is influenced a lot by \
these tools and either reimplements ideas or reuses code. \
Consider either of the aboved mentioned tools when you need a much \
more mature codebase."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.7.2"

RPM_NAME = "gnome-keysign-0.9.7.2-5.4.aarch64.rpm"
RPM_HASH = "f16e9871ae55244576270641b66d76610fc7ac7e9ccb7d9fd9508c9808687c34331924e32cb54269f5d7fc44dffe469d20977d40da7d692b4c2712fe61cfc1ac"

RPROVIDES:${PN} += "gnome-keysign \
python3.13dist-gnome-keysign \
python3dist-gnome-keysign"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
gstreamer1 \
python-abi \
python3-Twisted \
python3-avahi \
python3-cairo \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
python3-gpg \
python3-pybluez \
python3-qrcode \
python3-requests \
python3-setuptools \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gst \
typelib-GstVideo \
typelib-Gtk \
typelib-Pango"

inherit rpm

SUMMARY = "GTK Bluetooth Manager"
DESCRIPTION = "Blueman provides means for controlling the BlueZ API and presenting \
Bluetooth operations such as: \
 \
    * Connecting to 3G/EDGE/GPRS via dial-up \
    * Connecting to/Creating bluetooth networks \
    * Connecting to input devices \
    * Connecting to audio devices \
    * Sending/Receiving/Browsing files via OBEX \
    * Pairing \
 \
using a graphical user interface."
LICENSE = "GPL-3.0-only"

PV = "2.4.6"

RPM_NAME = "blueman-2.4.6-1.5.aarch64.rpm"
RPM_HASH = "e20bf21c644c7705d78eb7cb227f35961ec0de0f2ab8ea8d6a3c3934103ade9ed9a1da86861e5f44d0c1f233275511114c8e1fec37a0e4417833c25be2533464"

RPROVIDES:${PN} += "blueman"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
bluez \
dbus-1-python3 \
dbus-org.freedesktop.Notifications \
gdk-pixbuf-loader-rsvg \
ld-linux-aarch64.so.1 \
libbluetooth.so.3 \
libc.so.6 \
obex-data-server \
polkit \
pulseaudio-utils \
python-abi \
python3-cairo \
python3-gobject-Gdk \
python3-notify2 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-GdkX11 \
typelib-Gio \
typelib-Gtk \
typelib-NM \
typelib-Pango"

inherit rpm

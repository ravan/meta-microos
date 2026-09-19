SUMMARY = "Live Internet radio broadcaster discovery program"
DESCRIPTION = "GNOME Radio is a Free Software program that allows you to easily \
locate Free Internet Radio stations by broadcasters on the Internet \
with the help of map and text search.  GNOME Radio is developed on \
the GNOME desktop platform and it requires at least GStreamer 1.0 \
for playback.  Enjoy Free Internet Radio."
LICENSE = "GPL-3.0-or-later"

PV = "128"

RPM_NAME = "gnome-radio-128-1.10.aarch64.rpm"
RPM_HASH = "ffc8c50e40bb2ea9afb9e3ccc6fe89cbf78bcaef33978fe6182a4f1a6b0cf14d23bc662bc26d196554e40572e962164bd184d4ffcf954a8012fef3092cb24960"

RPROVIDES:${PN} += "girl \
gnome-internet-radio-locator \
gnome-radio"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libchamplain-0.12.so.0 \
libchamplain-gtk-0.12.so.0 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgeocode-glib-2.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstplayer-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libxml2.so.16"

inherit rpm

SUMMARY = "GNOME music playing application"
DESCRIPTION = "Lollypop is a GNOME music playing application. It provides the following \
features: \
* Supports mp3/4, ogg and flac \
* Genre/Cover browsing \
* Genre/Artist/Cover browsing \
* Search \
* Main playlist (called queue in other apps) \
* Party mode \
* Replay gain \
* Cover art downloader \
* Context artist view \
* MTP sync \
* Fullscreen view \
* Last.fm support \
* Auto install codecs \
* HiDPI support \
* Tunein support."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.40"

RPM_NAME = "lollypop-1.4.40-1.7.noarch.rpm"
RPM_HASH = "c65d7de059811b6e6bdacafd51a1588c6980017cfaf9ac93aa546853e36396cd2224f918ce939790e42403b557a9432362748663e1a5d9692f5ecd8f958e71fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lollypop"

RDEPENDS:${PN} += "/usr/bin/python3 \
dbus-1-python3 \
gstreamer-plugins-base \
python-abi \
python3-Pillow \
python3-beautifulsoup4 \
python3-cairo \
python3-gobject \
python3-gobject-Gdk \
python3-gst \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Goa \
typelib-Gst \
typelib-GstAudio \
typelib-GstPbutils \
typelib-Gtk \
typelib-Handy \
typelib-Pango \
typelib-Secret \
typelib-Soup \
typelib-TotemPlParser"

inherit rpm

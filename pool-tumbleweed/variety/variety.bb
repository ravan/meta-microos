SUMMARY = "Wallpaper changer"
DESCRIPTION = "Variety changes the desktop wallpaper on a regular basis, using user-specified \
or automatically downloaded images. \
 \
Variety sits conveniently as an indicator in the panel and can be easily paused \
and resumed. The mouse wheel can be used to scroll wallpapers back and forth \
until you find the perfect one for your current mood. \
 \
Apart from displaying images from local folders, several different online sources \
can be used to fetch wallpapers according to user-specified criteria."
LICENSE = "GPL-3.0-only"

PV = "0.9.1"

RPM_NAME = "variety-0.9.1-1.1.noarch.rpm"
RPM_HASH = "98075b91bee15aabe1fbc157379bd4e53abe7cf03226b52689710afe65388b9bccbbaa8f6304e2d77359de251da8f966d12fb71f213f7fe3a7018611878ef44c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-variety \
python3dist-variety \
variety"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.13 \
ImageMagick \
python-abi \
python3-Pillow \
python3-beautifulsoup4 \
python3-configobj \
python3-dbus-python \
python3-gexiv2 \
python3-gobject-Gdk \
python3-httplib2 \
python3-lxml \
python3-packaging \
python3-pycairo \
python3-requests \
typelib-AppIndicator3 \
typelib-GExiv2 \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Notify \
typelib-Pango \
typelib-PangoCairo \
yelp"

inherit rpm

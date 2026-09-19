SUMMARY = "Versatile File Searching Tool"
DESCRIPTION = "Catfish is a GTK+ search utility written in python. Its search is powered by \
/usr/bin/find and /usr/bin/locate, with search suggestions provided by \
zeitgeist."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "catfish-4.20.1-1.5.noarch.rpm"
RPM_HASH = "a47c5c7fbfab07042e8e2dc646919f4df718c6743b78574d9bf7a8a479bd915018166eaf38166af20de60c2dc71a64724c382582ffd8a680984bf46e308721d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "catfish"

RDEPENDS:${PN} += "/usr/bin/python3 \
findutils-locate \
gdk-pixbuf-loader-rsvg \
gsettings-backend-dconf \
python-abi \
python3 \
python3-cairo \
python3-dbus-python \
python3-gobject \
python3-gobject-Gdk \
python3-gobject-cairo \
python3-pexpect \
python3-xml \
sudo \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-Pango \
typelib-Xfconf \
typelib-Zeitgeist"

inherit rpm

SUMMARY = "Graphical diary and journal"
DESCRIPTION = "RedNotebook is a graphical journal to keep track of notes and thoughts. \
It includes a calendar navigation, customizable templates, export \
functionality and word clouds. You can also format, tag and search your \
entries."
LICENSE = "GPL-3.0-or-later"

PV = "2.42"

RPM_NAME = "rednotebook-2.42-1.1.noarch.rpm"
RPM_HASH = "d5f0cb11edf558b45f0827178a1ab309fff698e4bc90bb611fe599954b418cc6e77c3354193e1a5c4d716ec18e009acf283569f5d8d79f1c6ae95dd6cdc1a1a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-rednotebook \
python3dist-rednotebook \
rednotebook"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML \
python3-gobject-Gdk \
typelib-GIRepository \
typelib-GLib \
typelib-GObject \
typelib-Gdk \
typelib-GdkPixbuf \
typelib-Gio \
typelib-Gtk \
typelib-GtkSource \
typelib-Pango \
typelib-WebKit2"

inherit rpm

SUMMARY = "A calendar widget for GTK using PyGoocanvas"
DESCRIPTION = "A calendar widget for GTK using PyGoocanvas (Gnome widget linrary)."
LICENSE = "GPL-2.0-only"

PV = "0.8.0"

RPM_NAME = "python313-GooCalendar-0.8.0-3.5.noarch.rpm"
RPM_HASH = "7f14b1becc8df7b23de3b150d97e1f01cf80fee802b4e8fd4860ddf626abd50762a0638a289ed050958008f30d5be5d890ee68c24c86e22c1b7bac15858aa460"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GooCalendar \
python3.13dist-goocalendar \
python313-GooCalendar \
python3dist-goocalendar"

RDEPENDS:${PN} += "python-abi \
typelib-GObject \
typelib-Gdk \
typelib-GooCanvas \
typelib-Gtk \
typelib-Pango"

inherit rpm

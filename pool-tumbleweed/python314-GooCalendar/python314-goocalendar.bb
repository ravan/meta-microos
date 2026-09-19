SUMMARY = "A calendar widget for GTK using PyGoocanvas"
DESCRIPTION = "A calendar widget for GTK using PyGoocanvas (Gnome widget linrary)."
LICENSE = "GPL-2.0-only"

PV = "0.8.0"

RPM_NAME = "python314-GooCalendar-0.8.0-3.5.noarch.rpm"
RPM_HASH = "50a646693d0d464587fb950950f9b93e91a993dfc4c84ba357f245df2ea52da2130d204f69298afeac407d2f4099f7b15ef4986880d93aca6312084676e3750a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-goocalendar \
python314-GooCalendar \
python3dist-goocalendar"

RDEPENDS:${PN} += "python-abi \
typelib-GObject \
typelib-Gdk \
typelib-GooCanvas \
typelib-Gtk \
typelib-Pango"

inherit rpm

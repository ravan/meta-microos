SUMMARY = "MacOS High Sierra like theme for GTK 3, Gnome-Shell and more"
DESCRIPTION = "MacOS High Sierra like theme for GTK 3, GTK 2, Gnome-Shell, XFWM4 and Unity."
LICENSE = "GPL-3.0-only"

PV = "20191216"

RPM_NAME = "sierra-gtk-theme-20191216-1.19.noarch.rpm"
RPM_HASH = "f8d71aa7ba3565b30b073ac4ee2d357880250afd861deefc6bb191513354e2473b4f606c828f023d3bd87e3352d84dff259e53d08017f0c15daa60ffbdddc15e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sierra-gtk-theme"

RDEPENDS:${PN} += ""

inherit rpm

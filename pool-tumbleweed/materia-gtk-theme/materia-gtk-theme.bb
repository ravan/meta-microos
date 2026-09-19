SUMMARY = "A Material Design theme for GNOME/GTK+ based desktop environments"
DESCRIPTION = "Materia (formerly Flat-Plat) is a Material Design theme for GNOME/GTK+ based desktop environments. \
It supports GTK+ 3, GTK+ 2, GNOME Shell, Budgie, Cinnamon, MATE, Unity, LightDM, GDM, Chrome theme, etc."
LICENSE = "GPL-2.0-only"

PV = "20210322"

RPM_NAME = "materia-gtk-theme-20210322-1.14.noarch.rpm"
RPM_HASH = "c20d66e6d480be52376d43b1f8666d2c322003c838d2b803ef2f68231da05cf03dc09b92a8988f72f184e0d7daa91b1551441fcc85c2282a450a4bbee32fe13e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "materia-gtk-theme"

RDEPENDS:${PN} += "gnome-themes-extras"

inherit rpm

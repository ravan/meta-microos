SUMMARY = "Translations for package spice-gtk"
DESCRIPTION = "Provides translations for the 'spice-gtk' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.43"

RPM_NAME = "spice-gtk-lang-0.43-1.1.noarch.rpm"
RPM_HASH = "f4592f66951d83ffa9b5a3bb7c308801aeea4de214aa62f993fb3901b0bdd879ce10b54ea06657a6e39be7a8450bb41532f69608abc80d9b48a9d56eb40ae27e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-spice-gtk-cs \
locale-spice-gtk-de \
locale-spice-gtk-fr \
locale-spice-gtk-it \
locale-spice-gtk-ka \
locale-spice-gtk-ru \
spice-gtk-lang \
spice-gtk-lang-all"

RDEPENDS:${PN} += "spice-gtk"

inherit rpm

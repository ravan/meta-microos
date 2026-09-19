SUMMARY = "GTK+ 2 support for the Adwaita GNOME theme"
DESCRIPTION = "Adwaita is the default GNOME theme in GNOME 3."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28"

RPM_NAME = "gtk2-metatheme-adwaita-3.28-3.5.noarch.rpm"
RPM_HASH = "8d9d6d8bc59d6daf10b23e4dbaf97da6cdfbd31eda3af9a005134ff265ec8cd56e8e1c23db7163e1b67b8e01889b9fe039256c510321e6d41b28d437fb107d2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-adwaita"

RDEPENDS:${PN} += "gtk2 \
gtk2-theming-engine-adwaita \
metatheme-adwaita-common"

inherit rpm

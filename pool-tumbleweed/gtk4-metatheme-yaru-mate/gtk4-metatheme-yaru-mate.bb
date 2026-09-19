SUMMARY = "GTK+ 4 support for the Yaru-MATE Gtk Themes"
DESCRIPTION = "Includes the Yaru-MATE themes. \
 \
Introduced as the default theme in Ubuntu MATE 21.04."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "22.04.17"

RPM_NAME = "gtk4-metatheme-yaru-mate-22.04.17-1.12.noarch.rpm"
RPM_HASH = "ff6324a53d86f8d227a14e91b12dbbebf6a66af761d2e3ca97b50acc3d4ec5d2f0beb98cd6547a3934c319d439c60a81cde8f928c12894958cfbefccf8660db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-yaru-mate"

RDEPENDS:${PN} += "metatheme-yaru-mate-common"

inherit rpm

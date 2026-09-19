SUMMARY = "GTK+ 3 support for the Yaru-MATE Gtk Themes"
DESCRIPTION = "Includes the Yaru-MATE themes. \
 \
Introduced as the default theme in Ubuntu MATE 21.04."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "22.04.17"

RPM_NAME = "gtk3-metatheme-yaru-mate-22.04.17-1.12.noarch.rpm"
RPM_HASH = "c93a9f26d408a6622521ae1aea76467ec3ae6a9b843e54a21b14d6e7333f4795cac23b5fbc050694a26d2830f387008442cdbf72c559e3984e6ede6c62ea04e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-yaru-mate"

RDEPENDS:${PN} += "metatheme-yaru-mate-common"

inherit rpm

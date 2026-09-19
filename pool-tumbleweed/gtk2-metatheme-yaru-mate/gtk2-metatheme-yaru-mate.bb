SUMMARY = "GTK+ 2 support for the Yaru-MATE Gtk Themes"
DESCRIPTION = "Includes the Yaru-MATE themes. \
 \
Introduced as the default theme in Ubuntu MATE 21.04."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "22.04.17"

RPM_NAME = "gtk2-metatheme-yaru-mate-22.04.17-1.12.noarch.rpm"
RPM_HASH = "1247d0455b8f2f7abad34703113c266f24fa2e1a72e8cf23341fb0620aa4db4c130b53c554cc56abe0b5ba86abdd6eb4641e97fe7edcaff70da530e504b319a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-yaru-mate"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-yaru-mate-common"

inherit rpm

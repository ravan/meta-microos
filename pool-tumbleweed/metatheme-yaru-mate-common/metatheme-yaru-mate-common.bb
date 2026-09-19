SUMMARY = "Common files for the Yaru-MATE Gtk Themes"
DESCRIPTION = "Includes the Yaru-MATE themes. \
 \
Introduced as the default theme in Ubuntu MATE 21.04."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "22.04.17"

RPM_NAME = "metatheme-yaru-mate-common-22.04.17-1.12.noarch.rpm"
RPM_HASH = "7188775a93604a23d4226953af3f61054f4456d6fd4a00d2281492c12536b2670d2b194f25031da37678a771a952c8df3571c3b111b509a4730317408a4c3c36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-yaru-mate-common"

RDEPENDS:${PN} += ""

inherit rpm

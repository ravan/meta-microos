SUMMARY = "Translations for package nextcloud-desktop"
DESCRIPTION = "Provides translations for the 'nextcloud-desktop' package."
LICENSE = "GPL-2.0-or-later & LGPL-3.0-or-later"

PV = "34.0.3"

RPM_NAME = "nextcloud-desktop-lang-34.0.3-1.1.noarch.rpm"
RPM_HASH = "4fa9ca4d504961447a2fb890536a0f70d5c1c2d469f9d31cd7a36f6861b1e21cc0ce629d3a24832ed817b3eb51441a71af351482e8abee2373f84e3016ad4a3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nextcloud-desktop-lang \
nextcloud-desktop-lang-all"

RDEPENDS:${PN} += "nextcloud-desktop"

inherit rpm

SUMMARY = "Translations for package nitrogen"
DESCRIPTION = "Provides translations for the 'nitrogen' package."
LICENSE = "GPL-2.0-only & CC-BY-SA-3.0"

PV = "1.6.1"

RPM_NAME = "nitrogen-lang-1.6.1-1.35.noarch.rpm"
RPM_HASH = "d7678952bd6873c9bc6bc48a91ec02a39c007fb8dc3ebc0ab4a7c94272524adcc2f5348ab705fa3acb03d30b35755c2b38fb3465d32780ce80511960dddc7413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nitrogen-bs \
locale-nitrogen-fi \
locale-nitrogen-hr \
locale-nitrogen-pl \
locale-nitrogen-ru \
locale-nitrogen-sr \
nitrogen-lang \
nitrogen-lang-all"

RDEPENDS:${PN} += "nitrogen"

inherit rpm

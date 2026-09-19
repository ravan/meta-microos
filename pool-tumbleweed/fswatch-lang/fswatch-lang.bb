SUMMARY = "Translations for package fswatch"
DESCRIPTION = "Provides translations for the 'fswatch' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.22.0"

RPM_NAME = "fswatch-lang-1.22.0-1.1.noarch.rpm"
RPM_HASH = "6ec88835fa949b814887766990b7ae4a07b9ed47beae30cd2dfe3889a6e1c368832f981b478e93a5ffce049be22dfbaf1098539f802ad3314757bdd5d3cd7bd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fswatch-lang \
fswatch-lang-all \
locale-fswatch-en \
locale-fswatch-en@boldquot \
locale-fswatch-en@quot \
locale-fswatch-es \
locale-fswatch-it"

RDEPENDS:${PN} += "fswatch"

inherit rpm

SUMMARY = "Translations for package gmrun"
DESCRIPTION = "Provides translations for the 'gmrun' package."
LICENSE = "ISC"

PV = "1.4w"

RPM_NAME = "gmrun-lang-1.4w-1.10.noarch.rpm"
RPM_HASH = "fa4ebcbea610b4e696e596dffec92e72bb2bec2741556faf1bf3fdf8c70a5394038c6e08f1032b09f845119e420bb404471c71b49aae84b71bdd9b5a80d6d7a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gmrun-lang \
gmrun-lang-all \
locale-gmrun-es \
locale-gmrun-fr \
locale-gmrun-he"

RDEPENDS:${PN} += "gmrun"

inherit rpm

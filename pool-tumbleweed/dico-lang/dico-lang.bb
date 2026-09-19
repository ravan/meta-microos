SUMMARY = "Translations for package dico"
DESCRIPTION = "Provides translations for the 'dico' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.12"

RPM_NAME = "dico-lang-2.12-2.5.noarch.rpm"
RPM_HASH = "bc053e7ed8059567461bc64b3fbe2973bc70f45937ec9e31c870f53e604902762f140b7ff4b4f2fbbb9b311298c8690ef7db04d6787616387a00317aff7fd62e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dico-lang \
dico-lang-all \
locale-dico-da \
locale-dico-de \
locale-dico-es \
locale-dico-fi \
locale-dico-fr \
locale-dico-pl \
locale-dico-pt-BR \
locale-dico-ro \
locale-dico-sr \
locale-dico-sv \
locale-dico-uk"

RDEPENDS:${PN} += "dico"

inherit rpm

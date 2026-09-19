SUMMARY = "Translations for package parlatype"
DESCRIPTION = "Provides translations for the 'parlatype' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.3"

RPM_NAME = "parlatype-lang-4.3-1.6.noarch.rpm"
RPM_HASH = "175e6a8ca9942addfbc65ececcd4578d220a67b91dc2c038c5a1188056d1b3b790e2ce4e2697f91d4349a0b76d93f1d8ef4d0b4ab3ffd1138fffbe4447a97fe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-parlatype-ar \
locale-parlatype-ca \
locale-parlatype-cs \
locale-parlatype-de \
locale-parlatype-en-AU \
locale-parlatype-en-CA \
locale-parlatype-en-GB \
locale-parlatype-eo \
locale-parlatype-es \
locale-parlatype-eu \
locale-parlatype-fi \
locale-parlatype-fr \
locale-parlatype-gl \
locale-parlatype-he \
locale-parlatype-hi \
locale-parlatype-hu \
locale-parlatype-ia \
locale-parlatype-id \
locale-parlatype-it \
locale-parlatype-ja \
locale-parlatype-lt \
locale-parlatype-lv \
locale-parlatype-ms \
locale-parlatype-nb-NO \
locale-parlatype-nl \
locale-parlatype-pl \
locale-parlatype-pt \
locale-parlatype-pt-BR \
locale-parlatype-ru \
locale-parlatype-sk \
locale-parlatype-sr \
locale-parlatype-sv \
locale-parlatype-ta \
locale-parlatype-tr \
locale-parlatype-uk \
locale-parlatype-zh-Hans \
parlatype-lang \
parlatype-lang-all"

RDEPENDS:${PN} += "parlatype"

inherit rpm
